
public class Actor {
	private int actor_Id;
	private String actorName;
	private long salary;
	private String industry;
	public Actor(int actor_Id, String actorName, long salary, String industry) {
		super();
		this.actor_Id = actor_Id;
		this.actorName = actorName;
		this.salary = salary;
		this.industry = industry;
	}
	public int getActor_Id() {
		return actor_Id;
	}
	public void setActor_Id(int actor_Id) {
		this.actor_Id = actor_Id;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	@Override
	public String toString() {
		return "Actor [actor_Id=" + actor_Id + ", actorName=" + actorName + ", salary=" + salary + ", industry="
				+ industry + "]";
	}
	
	
}
