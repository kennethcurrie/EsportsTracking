package com.revature.models;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Table(name="team")
@Entity
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="team_id")
  private int teamId;
  
  @NotNull
  @Column(name="team_name")
  private String teamName;

public Team() {
	super();
}

public Team(int teamId, @NotNull String teamName) {
	super();
	this.teamId = teamId;
	this.teamName = teamName;
}

public int getTeamId() {
	return teamId;
}

public void setTeamId(int teamId) {
	this.teamId = teamId;
}

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + teamId;
	result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
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
	Team other = (Team) obj;
	if (teamId != other.teamId)
		return false;
	if (teamName == null) {
		if (other.teamName != null)
			return false;
	} else if (!teamName.equals(other.teamName))
		return false;
	return true;
}

@Override
public String toString() {
	return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
}
  
  
  
}
