package slack

import SlackServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication


@SpringBootApplication
@EnableConfigurationProperties
class SlackbotApplication

fun main(args: Array<String>) {
	runApplication<SlackbotApplication>(*args)
	val slackService = SlackServiceImpl()
	slackService.sendMessage("안녕하세요")
	slackService.showSlackInfo()

	/*
	* Slack bot
	* bot을 만들기 위하여 처음엔 google검색을 하였다.
	* 하지만, kotlin을 활용하여 봇과 대화방식의 api 경험 글들은
	* 찾아보았지만 잘 안보였고 Youtube를 통해 영상을 검색하여 찾아보았지만 찾기가 쉽지 않았다.
	* 결국 지금 만든 slack bot api도 늦게나마 말람 기능이란걸 꺠달았다.
	*
	* */

}