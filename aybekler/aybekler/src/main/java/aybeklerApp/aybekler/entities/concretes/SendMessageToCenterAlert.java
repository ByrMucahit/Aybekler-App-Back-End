package aybeklerApp.aybekler.entities.concretes;

public class SendMessageToCenterAlert {
	
	/* Common Variables */
	private int codeOfAlert;
	private String nameOfAccount;
	private String topic;
	private String detailOfTopic;
	
	/* Constructor */
	public SendMessageToCenterAlert(int codeOfAlert, String nameOfAccount, String topic, String detailOfTopic) {
		super();
		this.codeOfAlert = codeOfAlert;
		this.nameOfAccount = nameOfAccount;
		this.topic = topic;
		this.detailOfTopic = detailOfTopic;
	}
	
	/* Getter Setter */
	public int getCodeOfAlert() {
		return codeOfAlert;
	}

	public void setCodeOfAlert(int codeOfAlert) {
		this.codeOfAlert = codeOfAlert;
	}

	public String getNameOfAccount() {
		return nameOfAccount;
	}

	public void setNameOfAccount(String nameOfAccount) {
		this.nameOfAccount = nameOfAccount;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDetailOfTopic() {
		return detailOfTopic;
	}

	public void setDetailOfTopic(String detailOfTopic) {
		this.detailOfTopic = detailOfTopic;
	}
}


/*
 * Description:
 * --------------
 * This class contains messages.
 * 
 * Parameters:
 * -------------
 * codeOfAlert: It's private integer value that is assigned into each alert. We can reac any alert through the code of alert.
 * nameOfAccount: It's name of account.
 * topic: It's the topic of messages
 * detailOfTopic: It's detail of topic.
 * 
 * Returns:
 * -------------
 * None.
 */
