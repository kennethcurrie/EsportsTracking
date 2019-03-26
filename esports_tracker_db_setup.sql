--drop schema if exists esport_tracker;
CREATE SCHEMA esport_tracker;
SET search_path to esport_tracker;

drop table if exists match_history;
drop table if exists player;
drop table if exists game;
drop table if exists team;
drop table if exists site_user;

create table site_user (
	site_user_id 	serial 	primary key,
	username		text 	not null unique,
	password_hash	text 	not null,
	salt 			text	not null
);
create table team (
	team_id			serial 	primary key,
	team_name		text 	not null
);
create table game(
	game_id			serial 	primary key,
	game_name		text 	not null unique
);

create table player(
	player_id			serial 	primary key,
	player_handle		text 	not null,
	team_id				integer	references team(team_id)	
);
create table match_history(
	match_id			serial 	primary key,
	creator_id			integer not null references site_user(site_user_id),
	team_a_id			integer not null references team(team_id),
	team_b_id			integer not null references team(team_id),
	team_winner_id		integer	references team(team_id),
	match_date			timestamp,
	game_id				integer references game(game_id),
	match_details		text
);






