package slack.service


interface SlackService {

    fun sendMessage(text: String)

    fun sendMessage(channel: String, text: String)
}