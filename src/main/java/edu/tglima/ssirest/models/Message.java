package edu.tglima.ssirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Message() {}
	
	public Message(String email, String msgText, String name, String phone) {
		this.createdDate = new Date();
		this.wasRead = false;
		this.email = email;
		this.msgText = msgText;
		this.name = name;
		this.phone= phone;
	}
	
	@PrePersist
	public void onPrePersist(){
		if (this.wasRead == null) {
			this.wasRead = false;
		}
		if (this.createdDate == null) {
			this.createdDate = new Date();
		}
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	private Boolean wasRead;
	
	@Size(min = 4, max = 100, message="O nome deve conter entre 4 e 100 caracteres")
	private String name;
	
	@Email(message="O e-mail informado não é válido!")
	private String email;
	
	
	@Size(min = 5, max = 250, message="A mensagem de texto deve conter entre 5 e 250 caracteres")
	private String msgText;
	
	@Size(min = 15, max = 16, message="O telefone deve conter entre 15 e 16 caracteres")
	private String phone;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Boolean getWasRead() {
		return wasRead;
	}

	public void setWasRead(Boolean wasRead) {
		this.wasRead = wasRead;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsgText() {
		return msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
