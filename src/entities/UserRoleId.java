package entities;
// Generated Aug 23, 2017 10:05:46 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserRoleId generated by hbm2java
 */
@Embeddable
public class UserRoleId implements java.io.Serializable {

	private int userid;
	private int roleid;

	public UserRoleId() {
	}

	public UserRoleId(int userid, int roleid) {
		this.userid = userid;
		this.roleid = roleid;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "roleid", nullable = false)
	public int getRoleid() {
		return this.roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleId))
			return false;
		UserRoleId castOther = (UserRoleId) other;

		return (this.getUserid() == castOther.getUserid()) && (this.getRoleid() == castOther.getRoleid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserid();
		result = 37 * result + this.getRoleid();
		return result;
	}

}
