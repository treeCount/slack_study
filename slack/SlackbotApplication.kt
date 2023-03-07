package slack

import SlackConfiguration
import SlackServiceImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties


@SpringBootApplication
@ConfigurationProperties("application")
class SlackbotApplication

fun main(args: Array<String>) {
	//val context: ConfigurableApplicationContext = runApplication<SpringBootApplication>(*args)

	// SlackService 빈 검색
	val slackService = SlackServiceImpl()
	//val slackConfiguration = SlackConfiguration("xoxb-2949190190386-4870840035507-jaJaypc3P0nNyoniqTvaq9Ak","C04RLR7VDUK")
	//context.getBean(SlackService::class.java)

	slackService.sendMessage("안녕하세요. slackbot message 테스트 입니다.")
	slackService.showSlackInfo()
	// SlackService 메소드 호출
	//slackService.sendMessage("안녕하세요. slackbot message 테스트 입니다.")

// 애플리케이션 종료
	//context.close()
	/*runApplication<SlackbotApplication>(*args)
	val slackService = SlackServiceImpl()
	slackService.sendMessage("안녕하세요. slackbot message 테스트 입니다.")
	slackService.showSlackInfo()*/

	/*
	* Slack bot
	* bot을 만들기 위하여 처음엔 google검색을 하였다.
	* 하지만, kotlin을 활용하여 봇과 대화방식의 api 경험 글들은
	* 찾아보았지만 잘 안보였고 Youtube를 통해 영상을 검색하여 찾아보았지만 찾기가 쉽지 않았다.
	* 결국 지금 만든 slack bot api도 늦게나마 말람 기능이란걸 꺠달았다.
	*
	* */


	/*2023-03-07 Slackbot으로 Message를 보낼 수 있게 되었다.
	*
	* 처음 이 코드가 먹히질 않아서 Youtube를 통해 동영상을 보면서 따라 만들어서 해봤지만, 그 역시도 되질 않았었다.
	* 그렇게 안됐지만 좋은 시도이기에 branch를 생성하고 git에 올리려고 하였으나 다른 거슬리는 git branch가 있어 삭제를 시도하였다.
	* 그렇게 나의 과정일지 중 하나인 branch가 시원하게 날라갔다. branch를 삭제할때는 신중하게 삭제하자.
	* 그리고 다시 처음 코드로 돌아와서 @Value가 전혀 먹히질 않아 chatGpt한테 물어보며 찾아보았다.
	* 그러다보니, java 문제인가 싶어서 삭제하고 다시 설치, 환경변수 경로 다시 설정, 프로젝트 jdk 경로성정,캐시 삭제등 다양한 설정을 경험하였따.
	* 너무 힘들었지만, 좋은경험이었다.
	*
	* */
}