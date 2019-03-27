package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@Column(name = "player_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;

	@NotNull
	@Column(name = "player_handle")
	private String playerHandle;

	//@ManyToOne
	//@JoinColumn(name = "team_id")
	@NotNull
	@Column(name = "team_id")
	private String teamId;

	public Player() {
		super();
	}

	public Player( String playerHandle, String teamId) {
		super();
		this.playerHandle = playerHandle;
		this.teamId = teamId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerHandle() {
		return playerHandle;
	}

	public void setPlayerHandle(String playerHandle) {
		this.playerHandle = playerHandle;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerHandle == null) ? 0 : playerHandle.hashCode());
		result = prime * result + playerId;
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
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
		Player other = (Player) obj;
		if (playerHandle == null) {
			if (other.playerHandle != null)
				return false;
		} else if (!playerHandle.equals(other.playerHandle))
			return false;
		if (playerId != other.playerId)
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerHandle=" + playerHandle + ", teamId=" + teamId + "]";
	}
	
	
}
