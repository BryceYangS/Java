package etc.live;

import java.time.LocalDateTime;

public class Title {
	private int titleNo;
	private LocalDateTime registered;

	public int getTitleNo() {
		return titleNo;
	}

	public LocalDateTime getRegistered() {
		return registered;
	}

	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;
	}

	public void setRegistered(LocalDateTime registered) {
		this.registered = registered;
	}

	@Override
	public String toString() {
		return "Title{" +
			"titleNo=" + titleNo +
			", registered=" + registered +
			'}';
	}
}
