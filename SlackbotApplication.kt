
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SlackbotApplication

fun main(args: Array<String>) {
	runApplication<SlackbotApplication>(*args)
	val slackService = SlackServiceImpl()
	slackService.sendMessage("안녕하세요. slackbot message 테스트 입니다.")
	slackService.showSlackInfo()

	/*
	* Slack bot
	* bot을 만들기 위하여 처음엔 google검색을 하였다.
	* 하지만, kotlin을 활용하여 봇과 대화방식의 api 경험 글들은
	* 찾아보았지만 잘 안보였고 Youtube를 통해 영상을 검색하여 찾아보았지만 찾기가 쉽지 않았다.
	* 결국 지금 만든 slack bot api도 늦게나마 말람 기능이란걸 꺠달았다.
	*
	* */

	/*2023.03.07

	드디어 Slack에 message를 보내게 되었다.
	처음 @Value어노테이션이 properties에 있는 값들을 읽어오지 못하여
	Youtube 동영상을 보며 따라도 해보고, 버전이 안 맞는다는 에러도 나와
	jdk를 삭제 후 open jdk도 설치, 캐시도 삭제했지만 되지는 않았다.
	이런 안되는 과정을 git에 올려보려고 branch를 만들어 넣으려고 시도 중
	reset명령어로 시원하게 날려 먹은 경험도 해보았다.
	그러다가 init을 사용하여서도 가능하다는걸 느껴 init에 변수값들을 넣으니 그제서야
	정상적으로 실행이 되었다.
	* */

}