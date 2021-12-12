package aybeklerApp.aybekler.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="muco")
@AllArgsConstructor
@NoArgsConstructor
public class Muco {
	
	@Id
	/* Common Variable */
	@Column(name="userid")
	private int userId;
	
	public Muco() {
		
	}

	public Muco(int userId) {
		super();
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
