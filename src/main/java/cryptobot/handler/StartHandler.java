package cryptobot.handler;

import org.springframework.stereotype.Component;

@Component
public class StartHandler extends HelpHandler {
	@Override
	public String command() {
		return "/start";
	}
}
