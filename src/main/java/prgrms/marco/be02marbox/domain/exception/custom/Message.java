package prgrms.marco.be02marbox.domain.exception.custom;

public enum Message {
	DUPLICATE_EMAIL_EXP_MSG("이미 존재하는 이메일 입니다."),
	DUPLICATE_NAME_EXP_MSG("이미 존재하는 이름입니다."),
	INVALID_EMAIL_EXP_MSG("존재하지 않는 이메일 입니다."),
	ACCESS_DENIED_EXP_MSG("API 접근 권한이 없습니다."),
	INVALID_THEATER_EXP_MSG("존재하지 않는 극장 ID 입니다."),
	EMPTY_TOKEN_EXP_MSG("토큰은 필수 입니다."),
	EMPTY_USERNAME_EXP_MSG("사용자 이름은 필수 입니다.");

	private final String message;

	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
