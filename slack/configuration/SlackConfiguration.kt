import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

@PropertySource("classpath:application.yml")
@Component
class SlackConfiguration( private val botToken: String,
                          private val channel: String) {

    fun getApiToken(): String {
        return botToken
    }


    fun getChannel(): String {
        return channel
    }
}
