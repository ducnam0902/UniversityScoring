package university.server.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Falcuty {
	@Id
	private String falcutyId;
	private String falcutyName;
	private String address;
	private String phone;
	private Date FoundedDay;
	public Falcuty() {
		super();
	}
	public Falcuty(String falcutyId, String falcutyName, String address, String phone, Date foundedDay) {
		super();
		this.falcutyId = falcutyId;
		this.falcutyName = falcutyName;
		this.address = address;
		this.phone = phone;
		FoundedDay = foundedDay;
	}
	public Date getFoundedDay() {
		return FoundedDay;
	}
	public void setFoundedDay(Date foundedDay) {
		FoundedDay = foundedDay;
	}
	public String getFalcutyId() {
		return falcutyId;
	}
	public void setFalcutyId(String falcutyId) {
		this.falcutyId = falcutyId;
	}
	public String getFalcutyName() {
		return falcutyName;
	}
	
	public void setFalcutyName(String falcutyName) {
		this.falcutyName = falcutyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
