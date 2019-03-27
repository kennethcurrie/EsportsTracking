package com.revature.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "match_history")
public class MatchHistory {

	@Id
	@Column(name = "match_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchId;

	@ManyToOne
	@JoinColumn(name = "creator_id", referencedColumnName = "site_user_id" )
	private SiteUser creator;

	@ManyToOne
	@JoinColumn(name = "team_a_id", referencedColumnName = "team_id" )
	private Team teamA;

	@ManyToOne
	@JoinColumn(name = "team_b_id", referencedColumnName = "team_id" )
	private Team teamB;

	@ManyToOne
	@JoinColumn(name = "team_winner_id", referencedColumnName = "team_id" )
	private Team teamWinner;

	@Column(name = "match_date")
	private Date matchDate;

	@ManyToOne
	@JoinColumn(name = "game_id", referencedColumnName = "game_id" )
	private Game game;

	@Column(name = "match_details")
	private String matchDetails;

	public MatchHistory() {
		super();
	}

	public MatchHistory(int matchId, SiteUser creator, Team teamA, Team teamB, Team teamWinner, Date matchDate,
			Game game, String matchDetails) {
		super();
		this.matchId = matchId;
		this.creator = creator;
		this.teamA = teamA;
		this.teamB = teamB;
		this.teamWinner = teamWinner;
		this.matchDate = matchDate;
		this.game = game;
		this.matchDetails = matchDetails;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public SiteUser getCreator() {
		return creator;
	}

	public void setCreator(SiteUser creator) {
		this.creator = creator;
	}

	public Team getTeamA() {
		return teamA;
	}

	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	public Team getTeamB() {
		return teamB;
	}

	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}

	public Team getTeamWinner() {
		return teamWinner;
	}

	public void setTeamWinner(Team teamWinner) {
		this.teamWinner = teamWinner;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getMatchDetails() {
		return matchDetails;
	}

	public void setMatchDetails(String matchDetails) {
		this.matchDetails = matchDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((game == null) ? 0 : game.hashCode());
		result = prime * result + ((matchDate == null) ? 0 : matchDate.hashCode());
		result = prime * result + ((matchDetails == null) ? 0 : matchDetails.hashCode());
		result = prime * result + matchId;
		result = prime * result + ((teamA == null) ? 0 : teamA.hashCode());
		result = prime * result + ((teamB == null) ? 0 : teamB.hashCode());
		result = prime * result + ((teamWinner == null) ? 0 : teamWinner.hashCode());
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
		MatchHistory other = (MatchHistory) obj;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (game == null) {
			if (other.game != null)
				return false;
		} else if (!game.equals(other.game))
			return false;
		if (matchDate == null) {
			if (other.matchDate != null)
				return false;
		} else if (!matchDate.equals(other.matchDate))
			return false;
		if (matchDetails == null) {
			if (other.matchDetails != null)
				return false;
		} else if (!matchDetails.equals(other.matchDetails))
			return false;
		if (matchId != other.matchId)
			return false;
		if (teamA == null) {
			if (other.teamA != null)
				return false;
		} else if (!teamA.equals(other.teamA))
			return false;
		if (teamB == null) {
			if (other.teamB != null)
				return false;
		} else if (!teamB.equals(other.teamB))
			return false;
		if (teamWinner == null) {
			if (other.teamWinner != null)
				return false;
		} else if (!teamWinner.equals(other.teamWinner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MatchHistory [matchId=" + matchId + ", creator=" + creator + ", teamA=" + teamA + ", teamB=" + teamB
				+ ", teamWinner=" + teamWinner + ", matchDate=" + matchDate + ", game=" + game + ", matchDetails="
				+ matchDetails + "]";
	}

	
}
