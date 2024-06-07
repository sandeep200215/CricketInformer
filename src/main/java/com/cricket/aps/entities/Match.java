package com.cricket.aps.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "cricket_matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int match_id;
    private String teamHeading;

    private String matchNumberVenue;
    private String battingTeam;
    private String BattingTeamScore;
    private String bowlTeam;
    private String liveLink;
    private String TextComplete;
    private String BowlTeamScore;
    private String LiveText;
    private String MatchLink;

    @Enumerated
    private MatchStatus MatchStatus;
    private Date date = new Date();

    public Match(int match_id, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlTeam, String liveLink, String textComplete, String bowlTeamScore, String liveText, String matchLink, com.cricket.aps.entities.MatchStatus matchStatus, Date date) {
        this.match_id = match_id;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        BattingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.liveLink = liveLink;
        TextComplete = textComplete;
        BowlTeamScore = bowlTeamScore;
        LiveText = liveText;
        MatchLink = matchLink;
        MatchStatus = matchStatus;
        this.date = date;
    }

    public Match() {
    }

    public String getTextComplete() {
        return TextComplete;
    }

    public void setTextComplete(String textComplete) {
        TextComplete = textComplete;
    }

    public String getBowlTeamScore() {
        return BowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        BowlTeamScore = bowlTeamScore;
    }

    public String getLiveText() {
        return LiveText;
    }

    public void setLiveText(String liveText) {
        LiveText = liveText;
    }

    public String getMatchLink() {
        return MatchLink;
    }

    public void setMatchLink(String matchLink) {
        MatchLink = matchLink;
    }

    MatchStatus getMatchStatus() {
        return MatchStatus;
    }

    public void setMatchStatus(com.cricket.aps.entities.MatchStatus matchStatus) {
        MatchStatus = matchStatus;
    }

    // set match Status according to textcompleted
    public void setLiveStatus() {
        if (TextComplete.isBlank())
            this.MatchStatus = MatchStatus.LIVE;
        else
            this.MatchStatus = MatchStatus.COMPLETED;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return BattingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        BattingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getLiveLink() {
        return liveLink;
    }

    public void setLiveLink(String liveLink) {
        this.liveLink = liveLink;
    }

    public String getTextComplex() {
        return TextComplete;
    }

    public void setTextComplex(String textComplex) {
        this.TextComplete = textComplex;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
