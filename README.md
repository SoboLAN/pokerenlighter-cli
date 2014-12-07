# Poker Enlighter CLI

## Description

**Poker Enlighter CLI** is a command-line interface that sits on top of **Poker Enlighter Simulator**.

This allows accessing and using the simulation functionality via the command-line.

The **Usage** chapter contains a detailed explanation of how to use this and what each parameter means.  

## Website

You can find everything about this project on its website: http://pokerenlighter.javafling.org/ .

## License

Poker Enlighter CLI is published under the LGPL v2.1 license, a copy of which is present in the project root.

## Contributions

I do accept both bug reports and pull requests of interesting features and fixes.

## Usage

Note: The same instructions can also be found on the Developer Guide page: http://pokerenlighter.javafling.org/developers.php .

A typical command looks like this:

	java -jar poker_enlighther_cli.jar
	--simtype=equity
	--pokertype=texas
	--rounds=100000
	--player1=random
	--player2=AsKd
	--player3=21
	[--flop=As8dJh]
	[--turn=9s]
	[--river=3c]
	[--out=<fname>]
	[--report=10]
	[--help]
	[--version]

The parameters that are enclosed with brackets are optional. All others have to be specified.

1. **simtype**: the simulation type. Acceptable values: 
	- equity

2. **pokertype**: the poker type. Acceptable values:
    - texas (Texas Hold'em)
    - omaha (Omaha)
    - omaha-hilo (Omaha Hi/Lo)
    - fomaha (5-Card Omaha)
    - fomaha-hilo (5-Card Omaha Hi/Lo)

3. **rounds**: how many rounds of simulation to execute. Acceptable value is any strictly positive integer.

4. **playerX**: definition of a player. The "X" specifies the player ID e.g. player1, player2 etc. It's recommended to give IDs like 1, 2, 3 etc. because that's what you'll see in the results. If you use different IDs, the simulator will just convert them to 1, 2, 3 for you, so that would make it more confusing. You have to specify AT LEAST 2 players. The possible values a player definition can have is:
    - random (random hand)
    - cards (for example "AdJs" or "KhTsAsQc" or something like that)
    - range (for example "19" or "12" or "55"). These are percentages. It has to be a strictly positive integer less than or equal to 100).

5. **flop** (optional): the flop cards. You have to specify 3 cards here e.g. "Js7dKs".
6. **turn** (optional): the turn card. You can specify this only if you specify the flop too. E.g. "8d".
7. **river** (optional): the river card. You can specify this only if you specify the turn too. E.g. "Qh".
8. **out** (optional): the name of the file where the results should be exported to. The results will be in XML format. If no file is specified, results will not be exported.
9. **report** (optional). How often the progress is reported to the standard output. Must be a strictly positive integer less than 100 and it must be one of 100's divisors. So, the acceptable values are : 2, 5, 10, 20, 25, 50.
10. **help**: This can be specified alone if you want, like: `java -jar poker_enlighter_cli.jar --help`. It will print help instructions to standard output.
11. **version**: This can be specified alone if you want, like: `java -jar poker_enlighter_cli.jar --version`. It will print version and copyright information to standard output.
