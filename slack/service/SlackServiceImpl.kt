import slack.service.SlackService
import com.slack.api.Slack
import com.slack.api.methods.response.conversations.ConversationsListResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Service

@Service
@ConfigurationProperties("application")
class SlackServiceImpl : SlackService {

    private val log = LoggerFactory.getLogger(javaClass)

    @Value("\${slack.bot.token}")
    lateinit var token: String
    //lateinit var token: Any = if (null) {slackConfiguration.getApiToken()}

    @Value("\${slack.monitor.channel.token}")
    lateinit var defaultChannel: String

    /*
    * @Value어노테이션이 전혀 먹히질 않아서
    * 초기화를 늦게 할 수 있는 init에 변수를 직접적으로 넣었더니 실행이 되엇다.
    * */
    init {
        //defaultChannel 프로퍼티를 초기화합니다.
        defaultChannel = "asdsdwdsa"
        token = "asdwdsadsd"
    }

        /*override fun getDefaultChannel(): String {
            if (!::defaultChannel.isInitialized) { // 프로퍼티 초기화 여부를 체크
                defaultChannel = "C04RLR7VDUK" // 기본 채널 ID
            }
            return defaultChannel
        }*/

    override fun sendMessage(text: String) {
        sendMessage(defaultChannel, text)
    }

    /**
     * Send Slack Alarm
     */
    override fun sendMessage(channel: String, text: String) {
        val client = Slack.getInstance().methods()
        runCatching {
            client.chatPostMessage {
                it.token(token)
                    .channel(channel)
                    .text(text)
            }
        }.onFailure { e ->
            log.error("Slack Send Error: {}", e.message, e)
        }
    }

    /**
     * Slack Channel name, id list
     */
    fun showSlackInfo() {
        val client = Slack.getInstance().methods()
        var result: ConversationsListResponse = ConversationsListResponse()
        kotlin.runCatching {
            result = client.conversationsList {
                it.token(token)
            }
        }.onSuccess {
            result.channels.stream().forEach {
                log.info("{} -> {}", it.name, it.id)
            }
        }
    }
}