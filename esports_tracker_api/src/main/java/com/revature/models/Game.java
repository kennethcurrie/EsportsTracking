package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="game")
@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="game_id")
	private int gameId;
	
	@Column(name="game_name")
	@NotNull
	private String gameName;
	
	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameName=" + gameName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gameId;
		result = prime * result + ((gameName == null) ? 0 : gameName.hashCode());
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
		Game other = (Game) obj;
		if (gameId != other.gameId)
			return false;
		if (gameName == null) {
			if (other.gameName != null)
				return false;
		} else if (!gameName.equals(other.gameName))
			return false;
		return true;
	}

	public Game(int gameId, String gameName) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
	}

	public int getGameId() {
		return gameId;
	}
	
	public String getGameName() {
		return gameName;
	}
	
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
