package HibernateConn;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TaskManagement")
public class GetTask {
	private String TaskName;
	@Id
	private int TaskId;
	@Temporal(TemporalType.DATE)
	private Date DueDate;
	private Date StartDate;
	private String Priority;
	private String Status;

	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public int getTaskId() {
		return TaskId;
	}
	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "GetTask [TaskName=" + TaskName + ", TaskId=" + TaskId + ", DueDate=" + DueDate + ", StartDate="
				+ StartDate + ", Priority=" + Priority + ", Status=" + Status + "]";
	}
	
}
