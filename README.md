# PiShockTheSpire

Source code for the PiShockTheSpire mod.

> [!Note]
> This repository is merely informative. You can download this mod directly from the Steam Workshop.


## Description

Unofficial, fan-made, beta PiShock integration with Slay The Spire.

Trigger a PiShock discharge every* time you take damage while playing.
The power output and duration of the discharge will rely on the amount of damage taken relative to your Max HP and numbers of hits taken. Dying or abandoning a run will trigger a max intensity-duration discharge.

Feel free to adjust the range of intensity and time of the zaps in the configuration file for a more pleasurable experience!

In an immense act of piety, you will also be granted a Safeword at the start of each combat to disable zaps for one turn. Think carefully of when you should use it!

... and don't upgrade it, or you will find yourself with a shocking surprise between your hands ;3c

*(While in combat, damage taken during your turn will not trigger a discharge. Discharges will trigger at the end of the enemy turn unless you played a non upgraded Safeword that turn).


## Setup
### Via Steam Workshop
#### Step 1 - Enable the mod :
- 1.1) Subscribe to PiShock The Spire (You will also need to subscribe to the STSLib, BaseMod and ModTheSpire dependencies).

- 1.2) Run Slay The Spire with Mods, enable BaseMod, StSLib and PiShockTheSpire.

- 1.3) If everything runs properly, the mod is enabled! Close the game and move onto Step 2.

#### Step 2 - Link your PiShock with Slay The Spire:
- 2.1) Open your Slay The Spire local files (You can locate them by right clicking Slay the Spire in your game library, and then hovering over "Manage >", then clicking at "Browse local files".

- 2.2) Localize the file 'pishockconfig.txt' and open it. (If you cant locate it, make sure you run the game with PiShockTheSpire enabled at least once - Step 1.2).

- 2.3) Edit the file with your PiShock Username, API code, and your Sharecode for this play session (For your Sharecode, use just the code, not the full link). If you have tweaked with the Slay The Spire official Twitch integration before, this file works in similar fashion to 'twitchconfig.txt'. A properly configured file should look similar to this:

```TOML
username=puppy73
apikey=5c678926-d19e-4f86-42ad-21f5a76126db
sharecode=17519CD8GAP
```
- 2.4) You can also configure the listed parameters to adjust the zap power and duration range to your liking. Make sure these ranges are within your sharecode safety limits, or you will not get zapped on requests overstepping these. You will also not get zapped if the values introduced here do not make sense (e.g: maxPower being smaller than minPower).

#### Step 3 - Enjoy!:
- If your 'pishockconfig.txt' file has been properly setup, you will get rewarded with a juicy zap every time you take unwanted damage! Enjoy a more tense, electrifying StS experience!

### Outside Steam workshop
> [!CAUTION]
> This is a workaround. While it should work, I'm not actively supporting this method. Use the Steam Workshop method if you can.
- Follow [this guide](https://github.com/kiooeht/ModTheSpire/wiki#playing-mods).
- You will also need to download the [ModTheSpire](https://steamcommunity.com/sharedfiles/filedetails/?id=1605060445), [BaseMod](https://steamcommunity.com/sharedfiles/filedetails/?id=1605833019) and [StSLib](https://steamcommunity.com/sharedfiles/filedetails/?id=1609158507) dependencies.
- Add pishockthespire.jar to your mod file. You can download it from the [releases](https://github.com/Yahlunna/PiShockTheSpire/releases) page. There is no need to download the source code to install the mod, the .jar file will suffice.