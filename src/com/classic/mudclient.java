package com.classic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import org.custom.Constants;
import org.custom.Custom;

public final class mudclient extends GameWindowMiddleMan
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static char[] aCharArray4 = { '[', ']', '#' };
	private int anInt843;
	private int maybe_cameraHeight;
	private boolean aBool50;
	private int anInt849;
	private boolean maybe_isApplet;
	private int wildY;
	private final int maybe_windowWidth = 512;
	private int anInt854;
	private final int anInt855;
	private final int tileSize;
	private int lastPlayerCount;
	private final int anInt860;
	private int anInt863;
	private int anInt864;
	private int lastWildYSubtract;
	private int areaX;
	private int anInt868;
	private int anInt873;
	private final Mob[] lastPlayerArray;
	private boolean lastLoadedNull;
	private int anInt876;
	private final int[] mouseClickY;
	private boolean aBool53 = false;
	private final int windowHeight;
	private int anInt880;
	private int anInt882;
	private final Mob[] mobArray;
	private int anInt885;
	private int anInt886;
	private int anInt887;
	private int anInt888;
	private Camera gameCamera;
	private final int[] anIntArray155;
	private GameImageMiddleMan gameGraphics;
	private int anInt893;
	private int wildX;
	private boolean memoryError;
	private int mouseClickCount;
	private int loggedIn;
	private int wildYSubtract;
	private int anInt903;
	private final Mob[] playerArray;
	private final int[] mouseClickX;
	private Graphics aGraphics2;
	private int anInt906;
	private int anInt907;
	private boolean isMembers;
	private int anInt910;
	private int anInt912;
	private int anInt914;
	private int wildYMultiplier;
	private int anInt916;
	private EngineHandle engineHandle;
	private int anInt918;
	private Mob ourPlayer;
	private int anInt921;
	private int anInt922;
	private int anInt923;
	private int anInt925;
	private int anInt926;
	private int areaY;
	private int actionPictureType;
	private boolean isVeterans;
	private int anInt930;
	private int anInt931;
	private int playerCount;
	private int anInt933;
	private final int[] anIntArray157;
	private int anInt935;
	private int anInt936;
	private int anInt937;
	private int anInt938;
	private final String[] aStringArray45;
	private final int[] anIntArray158;
	private int anInt939;
	private final Mob[] lastNpcArray;
	private int anInt940;
	private String privateMessageTarget;
	private boolean showShop;
	private int anInt941;
	private int anInt942;
	private final int[] anIntArray159;
	private int anInt943;
	private Menu characterDesignMenu;
	private final int[] anIntArray160;
	private int anInt944;
	private final boolean[] aBoolArray11;
	private int anInt945;
	private final boolean[] aBoolArray12;
	private int anInt946;
	private final int[] anIntArray161;
	private int anInt947;
	private final boolean[] aBoolArray13;
	private final int anInt948;
	private Class29 aClass29_1;
	private final int[] npcCombatModelArray1;
	private final int[] wallObjectDirection;
	private boolean configSoundEffects;
	private final int[] anIntArray164;
	private int systemUpdate;
	private final int[] characterTopBottomColors;
	private Menu gameMenu;
	private final String[] questListArray;
	private final int[] inventoryItemsCount;
	private int anInt950;
	private int anInt951;
	private int anInt952;
	private boolean aBool59;
	private int anInt953;
	private int anInt954;
	private boolean aBool60;
	private boolean aBool61;
	private boolean aBool62;
	private final int[] wallObjectY;
	private int anInt955;
	private int anInt956;
	private int wallObjectCount;
	private int anInt958;
	private boolean aBool63;
	private boolean showCharacterLookScreen;
	private String aString30;
	private boolean aBool65;
	private final int[] npcCombatModelArray2;
	private final int[] anIntArray169;
	private int shopUnknown3;
	private boolean aBool66;
	private boolean aBool67;
	private final int[] objectY;
	private boolean aBool68;
	private int anInt960;
	private int anInt961;
	private final String[] aStringArray47;
	private boolean aBool69;
	private int anInt962;
	private final int[] objectRotation;
	private int[] anIntArray172;
	private int welcomeRecoverySetDays;
	private int anInt964;
	private int anInt965;
	private Menu spellMenu;
	private final boolean[] aBoolArray14;
	private int anInt966;
	private int anInt967;
	private int anInt968;
	private int anInt969;
	private final int[] anIntArray173;
	private final int[] anIntArray174;
	private String aString31;
	private int logoutTimeout;
	private int anInt971;
	private final Model[] objectModelArray;
	private int selectedShopItemIndex;
	private final String[] skillArrayLong;
	private String[] aStringArray49;
	private final int anInt973;
	private final int[] groundItemObjectVar;
	private int[] wallObjectX;
	private int[] anIntArray177;
	private int anInt974;
	private int anInt975;
	private int messagesTab;
	private final int[] objectType;
	private int anInt977;
	private int anInt978;
	private boolean aBool70;
	private AClass4_Sub2 anAClass4_Sub2_1;
	private Mob[] npcArray;
	private final int[] shopItems;
	private int wildernessType;
	private final int[] anIntArray180;
	private final int[] anIntArray181;
	private int anInt980;
	private int anInt981;
	private int anInt982;
	private int anInt983;
	private int anInt984;
	private int anInt985;
	private boolean aBool71;
	private int anInt986;
	private final int[] anIntArray182;
	private int anInt987;
	private int welcomeLastLoggedInDays;
	private int anInt989;
	private final int[] anIntArray183;
	private final int[] anIntArray184;
	private int anInt990;
	private boolean aBool72;
	private int anInt991;
	private int anInt992;
	private boolean aBool73;
	private boolean aBool74;
	private int unreadMessages;
	private int anInt994;
	private final int[] anIntArray185;
	private int anInt995;
	private Menu aClass10_4;
	private int anInt996;
	private boolean aBool75;
	private int anInt997;
	private int anInt998;
	private int anInt999;
	private final int[] anIntArray186;
	private final int[] anIntArray187;
	private int playerAliveTimeout;
	private boolean aBool76;
	private final Mob[] npcRecordArray;
	private int sectionY;
	private String aString32;
	private final int[] anIntArray188;
	private int anInt1002;
	private int menuMagicPrayersSelected;
	private String aString33;
	private int[] anIntArray189;
	private final int[] wallObjectType;
	private int anInt1004;
	private int anInt1005;
	private boolean aBool77;
	private final int[] objectX;
	private int anInt1006;
	private final int[] groundItemX;
	private int lastNpcCount;
	private Menu menuLogin;
	private int anInt1008;
	private final int[] anIntArray193;
	private boolean notInWilderness;
	private Class29 aClass29_2;
	private boolean aBool79;
	private String aString35;
	private String aString36;
	private final int[] inventoryItems;
	private final boolean aBool80;
	private final int[] anIntArray195;
	private String aString37;
	private final int[] walkModel;
	private int anInt1009;
	private int serverIndex;
	private boolean aBool81;
	private int anInt1011;
	private int anInt1012;
	private final int[][] npcAnimationArray;
	private int shopUnknown1;
	private final int[] characterSkinColors;
	private final int[] anIntArray198;
	private final Model[] wallObjectModelArray;
	private boolean aBool82;
	private int anInt1014;
	private final String[] equipmentStatusName;
	private final Model[] modelCache;
	private int inventoryCount;
	private final int[] groundItemY;
	private int anInt1016;
	private int anInt1017;
	private int param_referid;
	private int chatHandle;
	private Menu aClass10_6;
	private final int[] anIntArray200;
	private int anInt1020;
	private int welcomeLastLoggedInIp;
	private final int[] groundItemType;
	private byte[] soundData;
	private final int[] anIntArray202;
	private int objectCount;
	private final int[] anIntArray203;
	private int anInt1023;
	private int shopUnknown2;
	private Class29 aClass29_3;
	private final int[] anIntArray204;
	private boolean configMouseButtons;
	private int anInt1025;
	private int anInt1026;
	private final int[] wearing;
	private int anInt1027;
	private int anInt1028;
	private boolean aBool84;
	private final int[] anIntArray206;
	private int anInt1029;
	private int sectionX;
	private int anInt1031;
	private int anInt1032;
	private boolean aBool85;
	private String aString38;
	private int anInt1033;
	private int anInt1034;
	private boolean configAutoCameraAngle;
	private final int[] anIntArray207;
	private int maybe_loginScreenNumber;
	private int anInt1036;
	private final int[] anIntArray208;
	private int anInt1037;
	private int anInt1038;
	private int npcCount;
	private final int[] anIntArray209;
	private int anInt1040;
	private int anInt1041;
	private final int[] anIntArray210;
	private int anInt1042;
	private boolean aBool87;
	private int spellMenuHandle;
	private int anInt1044;
	private final int[] characterHairColors;
	private int anInt1045;
	private final int[] anIntArray212;
	private final int[] anIntArray213;
	private boolean showServerMessageBox;
	private int anInt1047;
	private final int[] anIntArray214;
	private final int[] anIntArray215;
	private int anInt1048;
	private int anInt1049;
	private final int[] anIntArray216;
	private int anInt1050;
	private int combatTimeout;
	private String aString40;
	private Menu aClass10_7;
	private boolean aBool89;
	private int anInt1052;
	private int anInt1053;
	private int anInt1054;
	private final int[] anIntArray217;
	private int anInt1055;
	private int anInt1056;
	private int anInt1057;
	private boolean aBool90;
	private boolean showWelcomeBox;
	private int anInt1058;
	private final int[] anIntArray218;
	private final String[] skillArray;
	private final int[] shopItemCount;
	private final int[] anIntArray220;
	private int inputBoxType;
	private int anInt1060;
	private int anInt1061;
	private int groundItemCount;
	private boolean aBool92;
	private int anInt1063;
	private boolean showSkipTutorial;
	private AudioUnknown aClass37_1;
	private int anInt1064;
	private final int[] anIntArray221;
	static int[] messagesTimeout = new int[100];
	protected static String[] aStringArray43 = { "Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?" };
	static String[] aStringArray31 = { "Please enter the number of items to deposit", "and press enter" };

	private void method490()
	{
		final int i = this.anInt720;
		final int i_0_ = this.anInt694;
		final int i_1_ = (anInt941 - i) + -maybe_windowWidth;
		final int i_2_ = ((-windowHeight - 12) + anInt1023) - i_0_;
		if ((i > 0) || (i_1_ > 0) || (0 < i_0_) || (0 < i_2_))
		{
			try
			{
				Container container;
				if (maybe_isApplet)
				{
					if (Class27.anApplet1 == null)
					{
						container = this;
					}
					else
					{
						container = Class27.anApplet1;
					}
				}
				else
				{
					container = Class38.gameFrame;
				}
				final Graphics graphics = container.getGraphics();
				if (graphics != null)
				{
					graphics.setColor(Color.black);
					if (0 < i)
					{
						graphics.fillRect(0, 0, i, anInt1023);
					}
					if (0 < i_0_)
					{
						graphics.fillRect(0, 0, anInt941, i_0_);
					}
					if (0 < i_1_)
					{
						graphics.fillRect(-i_1_ + anInt941, 0, i_1_, anInt1023);
					}
					if (0 < i_2_)
					{
						graphics.fillRect(0, anInt1023 - i_2_, anInt941, i_2_);
					}
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
	}

	private void sendLogout()
	{
		if (loggedIn != 0)
		{
			if (combatTimeout > 450)
			{
				displayMessage(0, "You can't logout during combat!", 0, null, -109, "@cya@", null, false);
			}
			else if (combatTimeout > 0)
			{
				displayMessage(0, "You can't logout for 10 seconds after combat", 0, null, -29, "@cya@", null, false);
			}
			else
			{
				streamClass.createPacket(Constants.CPacketID_RequestLogout);
				streamClass.finishPacket();
				logoutTimeout = 1000;
			}
		}
	}

	private String method492(final int i, final byte i_4_)
	{
		final Class20 class20 = GameFrame.aClass32_4.method222(i, -29661);
		while (class20.anInt216 == 0)
		{
			Isaac.unknownSleep(i_4_ ^ ~0x7b, 50L);
		}
		if (i_4_ != -66)
		{
			return null;
		}
		if ((class20.anInt216 == 1) && (class20.socket != null))
		{
			return (String) class20.socket;
		}
		return PacketConstruction.method115(i, i_4_ + 151);
	}

	private void drawWelcomeBox(final int i)
	{
		int i_5_ = 65;
		if (welcomeRecoverySetDays != 201)
		{
			i_5_ += 60;
		}
		if (unreadMessages > 0)
		{
			i_5_ += 30;
		}
		if (welcomeLastLoggedInIp != 0)
		{
			i_5_ += 45;
		}
		gameGraphics.method321(-(i_5_ / 2) + 167, 0, i_5_, 400, 56, i);
		int i_6_ = -(i_5_ / 2) + 167;
		i_6_ += 20;
		gameGraphics.method362(i_5_, 56, 400, 16777215, -(i_5_ / 2) + 167);
		gameGraphics.drawText(16776960, 255, 4,
		        new StringBuilder().append("Welcome to RuneScape ").append(ourPlayer.maybe_accountName).toString(), i_6_, 256);
		i_6_ += 30;
		String string;
		if (welcomeLastLoggedInDays != 0)
		{
			if (welcomeLastLoggedInDays != 1)
			{
				string = new StringBuilder().append(welcomeLastLoggedInDays).append(" days ago").toString();
			}
			else
			{
				string = "yesterday";
			}
		}
		else
		{
			string = "earlier today";
		}
		if (welcomeLastLoggedInIp != 0)
		{
			gameGraphics.drawText(16777215, 255, 1,
			        new StringBuilder().append("You last logged in ").append(string).toString(), i_6_, 256);
			if (aString36 == null)
			{
				aString36 = method492(welcomeLastLoggedInIp, (byte) -66);
			}
			i_6_ += 15;
			gameGraphics.drawText(16777215, 255, 1,
			        new StringBuilder().append("from: ").append(aString36).toString(), i_6_, 256);
			i_6_ += 15;
			i_6_ += 15;
		}
		if (unreadMessages > 0)
		{
			if (unreadMessages == 1)
			{
				gameGraphics.drawText(16777215, 255, 1,
				        "You have @yel@0@whi@ unread messages in your message-centre", i_6_, 256);
			}
			else
			{
				gameGraphics.drawText(16777215, i ^ 0xfe, 1, new StringBuilder().append("You have @gre@")
				        .append(unreadMessages - 1).append(" unread messages @whi@in your message-centre").toString(), i_6_,
				        256);
			}
			i_6_ += 15;
			i_6_ += 15;
		}
		if (welcomeRecoverySetDays != 201)
		{
			if (welcomeRecoverySetDays == 200)
			{
				gameGraphics.drawText(16744448, 255, 1, "You have not yet set any password recovery questions.",
				        i_6_, 256);
				i_6_ += 15;
				gameGraphics.drawText(16744448, 255, 1,
				        "We strongly recommend you do so now to secure your account.", i_6_, 256);
				i_6_ += 15;
				gameGraphics.drawText(16744448, 255, 1,
				        "Do this from the 'account management' area on our front webpage", i_6_, 256);
				i_6_ += 15;
			}
			else
			{
				if (welcomeRecoverySetDays != 0)
				{
					if (welcomeRecoverySetDays == 1)
					{
						string = "Yesterday";
					}
					else
					{
						string = new StringBuilder().append(welcomeRecoverySetDays).append(" days ago").toString();
					}
				}
				else
				{
					string = "Earlier today";
				}
				gameGraphics.drawText(16744448, i ^ 0xfe, 1,
				        new StringBuilder().append(string).append(" you changed your recovery questions").toString(),
				        i_6_, 256);
				i_6_ += 15;
				gameGraphics.drawText(16744448, 255, 1,
				        "If you do not remember making this change then cancel it immediately", i_6_, 256);
				i_6_ += 15;
				gameGraphics.drawText(16744448, 255, 1,
				        "Do this from the 'account management' area on our front webpage", i_6_, 256);
				i_6_ += 15;
			}
			i_6_ += 15;
		}
		int i_7_ = 16777215;
		if ((this.mouseY > (i_6_ - 12)) && (i_6_ >= this.mouseY) && (106 < this.mouseX) && (this.mouseX < 406))
		{
			i_7_ = 16711680;
		}
		gameGraphics.drawText(i_7_, 255, 1, "Click here to close window", i_6_, 256);
		if (anInt887 == 1)
		{
			if (i_7_ == 16711680)
			{
				showWelcomeBox = false;
			}
			if (((86 > this.mouseX) || (426 < this.mouseX))
			        && (((-(i_5_ / 2) + 167) > this.mouseY) || (this.mouseY > ((i_5_ / 2) + 167))))
			{
				showWelcomeBox = false;
			}
		}
		anInt887 = 0;
	}

	private void method494(final byte i, final String string)
	{
		if (i != -83)
		{
			welcomeRecoverySetDays = -50;
		}
		final String string_8_ = Class43.method298(string);
		if (string_8_ != null)
		{
			for (int i_9_ = 0; i_9_ < GameWindowMiddleMan.ignoreListCount; i_9_++)
			{
				if (string_8_.equals(Class43.method298((Camera.aStringArray28[i_9_]))))
				{
					GameWindowMiddleMan.ignoreListCount--;
					for (int i_10_ = i_9_; GameWindowMiddleMan.ignoreListCount > i_10_; i_10_++)
					{
						GameWindowMiddleMan.ignoreListNames[i_10_] = GameWindowMiddleMan.ignoreListNames[i_10_ + 1];
						Camera.aStringArray28[i_10_] = Camera.aStringArray28[i_10_ + 1];
						EngineHandle.aStringArray7[i_10_] = EngineHandle.aStringArray7[i_10_ + 1];
						Class3.aStringArray4[i_10_] = Class3.aStringArray4[i_10_];
					}
					streamClass.createPacket(241);
					streamClass.aClass27_Sub1_Sub1_1.method389(0, string);
					streamClass.finishPacket();
					break;
				}
			}
		}
	}

	private void loadSounds()
	{
		try
		{
			soundData = unpackData("Sound effects", 90, 10);
			AudioUnknown.method231(22050, false, 1);
			Container container;
			if (Class38.gameFrame == null)
			{
				if (Class27.anApplet1 != null)
				{
					container = Class27.anApplet1;
				}
				else
				{
					container = this;
				}
			}
			else
			{
				container = Class38.gameFrame;
			}
			aClass37_1 = AudioUnknown.method242(GameFrame.aClass32_4, container, 0, 22050);
			anAClass4_Sub2_1 = new AClass4_Sub2();
			aClass37_1.method232(anAClass4_Sub2_1);
		}
		catch (final Throwable throwable)
		{
			System.out.println(new StringBuilder().append("Unable to init sounds:").append(throwable).toString());
		}
	}

	private void drawServerMessageBox(final int i)
	{
		final int i_11_ = 400;
		int i_12_ = 100;
		if (aBool74)
		{
			i_12_ = 450;
			i_12_ = 300;
		}
		gameGraphics.method321(-(i_12_ / 2) + 167, 0, i_12_, i_11_, -(i_11_ / 2) + 256, i + 2);
		if (i != -1)
		{
			method524(81, 12, 82);
		}
		gameGraphics.method362(i_12_, -(i_11_ / 2) + 256, i_11_, 16777215, -(i_12_ / 2) + 167);
		gameGraphics.method333(187 - (i_12_ / 2), i_11_ + -40, 1, 16777215, aString38, 256, true);
		final int i_13_ = (i_12_ / 2) + 157;
		int i_14_ = 16777215;
		if ((this.mouseY > (i_13_ - 12)) && (this.mouseY <= i_13_) && (106 < this.mouseX)
		        && (this.mouseX < 406))
		{
			i_14_ = 16711680;
		}
		gameGraphics.drawText(i_14_, 255, 1, "Click here to close window", i_13_, 256);
		if (anInt887 == 1)
		{
			if (i_14_ == 16711680)
			{
				showServerMessageBox = false;
			}
			if ((((256 - (i_11_ / 2)) > this.mouseX) || (((i_11_ / 2) + 256) < this.mouseX))
			        && ((this.mouseY < (167 - (i_12_ / 2))) || ((167 - -(i_12_ / 2)) < this.mouseY)))
			{
				showServerMessageBox = false;
			}
		}
		anInt887 = 0;
	}

	private void method498(final int i)
	{
		final Mob class15 = playerArray[i];
		final String string = class15.maybe_displayName;
		int i_40_ = (-sectionY - wildY) + -areaY + 2203;
		if ((areaX + sectionX + wildX) >= 2640)
		{
			i_40_ = -50;
		}
		String string_41_ = "";
		int i_42_ = 0;
		if ((ourPlayer.level > 0) && (0 < class15.level))
		{
			i_42_ = (ourPlayer.level + -class15.level);
		}
		if (0 > i_42_)
		{
			string_41_ = "@or1@";
		}
		if (i_42_ < -3)
		{
			string_41_ = "@or2@";
		}
		if (i_42_ < -6)
		{
			string_41_ = "@or3@";
		}
		if (-9 > i_42_)
		{
			string_41_ = "@red@";
		}
		if (0 < i_42_)
		{
			string_41_ = "@gr1@";
		}
		if (3 < i_42_)
		{
			string_41_ = "@gr2@";
		}
		if (i_42_ > 6)
		{
			string_41_ = "@gr3@";
		}
		if (9 < i_42_)
		{
			string_41_ = "@gre@";
		}
		string_41_ = new StringBuilder().append(" ").append(string_41_).append("(level-").append(class15.level)
		        .append(")").toString();
		if (0 > anInt940)
		{
			if (anInt989 >= 0)
			{
				aClass29_1.method195(new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
				        class15.serverIndex,
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(), 0, anInt989,
				        810);
			}
			else
			{
				if ((0 >= i_40_) || (2203 <= ((((class15.currentY + -64) / tileSize) - -wildY) + areaY)))
				{
					if (isMembers)
					{
						aClass29_1.method196("Duel with", 2806,
						        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(),
						        class15.serverIndex);
					}
				}
				else
				{
					aClass29_1.method196("Attack", (i_42_ >= 0) && (5 > i_42_) ? 805 : 2805,
					        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(),
					        class15.serverIndex);
				}
				aClass29_1.method196("Trade with", 2810,
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(), class15.serverIndex);
				aClass29_1.method196("Follow", 2820,
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString(), class15.serverIndex);
				aClass29_1.method208(2833, class15.maybe_accountName, class15.maybe_displayName, (byte) -31, "Report abuse",
				        new StringBuilder().append("@whi@").append(string).append(string_41_).toString());
			}
		}
		else if ((EntityHandler.spelldef_type[anInt940] == 1) || (EntityHandler.spelldef_type[anInt940] == 2))
		{
			aClass29_1.method195(
			        new StringBuilder().append("Cast ").append(EntityHandler.spelldef_name[anInt940]).append(" on")
			                .toString(),
			        class15.serverIndex, new StringBuilder().append("@whi@").append(string).append(string_41_).toString(),
			        0, anInt940, 800);
		}
	}

	@Override
	void handleMenuKeyDown(final int key)
	{
		if(Custom.EXISTS)
		{
			switch(Custom.lastKey)
			{
				case 33: // Page up
					gameMenu.updateText(Custom.lastMessage, chatHandle);
				break;
				
				case 34: // Page down
					gameMenu.updateText("", chatHandle);
				break;
			}
		}
		
		if (loggedIn == 0)
		{
			if ((maybe_loginScreenNumber == 0) && (aClass10_7 != null))
			{
				aClass10_7.keyDown(key);
			}
			if ((maybe_loginScreenNumber == 2) && (menuLogin != null))
			{
				menuLogin.keyDown(key);
			}
		}
		if (loggedIn == 1)
		{
			if (showCharacterLookScreen)
			{
				characterDesignMenu.keyDown(key);
			}
			else if ((inputBoxType == 0) && (anInt994 == 0) && !aBool69 && (anInt971 == 0))
			{
				gameMenu.keyDown(key);
			}
		}
	}

	@Override
	void addMouseClick(final int mouseY, final int mouseX, final int button)
	{
		mouseClickX[mouseClickCount] = mouseX;
		mouseClickY[mouseClickCount] = mouseY;
		mouseClickCount = (mouseClickCount + 1) & 0x1fff;
		for (int i = 10; i < 4000; ++i)
		{
			final int pID = 0x1fff & (-i + mouseClickCount);
			if ((mouseX == mouseClickX[pID]) && (mouseClickY[pID] == mouseY))
			{
				boolean hasInteracted = false;
				for (int j = 1; i > j; ++j)
				{
					final int sID = (mouseClickCount - j) & 0x1fff;
					final int psID = (pID - j) & 0x1fff;
					if ((mouseX != mouseClickX[psID]) || (mouseClickY[psID] != mouseY))
					{
						hasInteracted = true;
					}
					if ((mouseClickX[sID] != mouseClickX[psID])
					        || (mouseClickY[sID] != mouseClickY[psID]))
					{
						break;
					}
					if ((j == (i - 1)) && hasInteracted && (combatTimeout == 0) && (logoutTimeout == 0))
					{
						sendLogout();
						return;
					}
				}
			}
		}
	}

	private void method499(final int i)
	{
		if (this.aString26.length() > 0)
		{
			aString33 = this.aString26.trim();
			anInt1048 = 0;
			anInt994 = 2;
		}
		else
		{
			int i_52_ = 0;
			if ((accountFlags2 < 2) && (7 > accountFlags1))
			{
				if (accountFlags1 >= 5)
				{
					i_52_ = 1;
				}
			}
			else
			{
				i_52_ = 2;
			}
			final int i_53_ = gameGraphics.method315(1);
			final int i_54_ = gameGraphics.method315(4);
			final int i_55_ = 400;
			final int i_56_ = 70 - -(i_52_ > 0 ? i_53_ - -5 : 0);
			final int i_57_ = -(i_55_ / 2) + 256;
			final int i_58_ = -(i_56_ / 2) + 180;
			gameGraphics.method321(i_58_, 0, i_56_, i_55_, i_57_, 1);
			gameGraphics.method362(i_56_, i_57_, i_55_, 16777215, i_58_);
			gameGraphics.drawText(16776960, i + 3900, 1, "Enter the name of the player you wish to report:",
			        i_53_ + i_58_ + 5, 256);
			final int i_59_ = i_53_ + 2;
			gameGraphics.drawText(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(), i_54_ + (i_58_ - -i_59_) + 5 + 3,
			        256);
			int i_60_ = ((i_59_ + i_58_ + 5 + 3) - -i_54_) + i_53_ + 2;
			int i_61_ = 16777215;
			if (0 < i_52_)
			{
				String string = aBool76 ? "[X]" : "[ ]";
				if (1 < i_52_)
				{
					string = new StringBuilder().append(string).append(" Mute player").toString();
				}
				else
				{
					string = new StringBuilder().append(string).append(" Suggest mute").toString();
				}
				final int i_62_ = gameGraphics.method328(string, i ^ 0xe46, 1);
				if ((this.mouseX > (-(i_62_ / 2) + 256)) && (this.mouseX < ((i_62_ / 2) + 256))
				        && (this.mouseY > (-i_53_ + i_60_)) && (this.mouseY < i_60_))
				{
					i_61_ = 16776960;
					if (anInt887 != 0)
					{
						aBool76 = !aBool76;
						anInt887 = 0;
					}
				}
				gameGraphics.drawText(i_61_, 255, 1, string, i_60_, 256);
				i_60_ = i_60_ + i_53_ + 10;
			}
			i_61_ = 16777215;
			if ((this.mouseX > 210) && (228 > this.mouseX) && (this.mouseY > (-i_53_ + i_60_))
			        && (this.mouseY < i_60_))
			{
				if (anInt887 != 0)
				{
					this.aString26 = this.aString27;
					anInt887 = 0;
				}
				i_61_ = 16776960;
			}
			gameGraphics.method324("OK", i ^ i, 1, i_61_, 210, i_60_);
			i_61_ = 16777215;
			if ((this.mouseX > 264) && (304 > this.mouseX) && ((-i_53_ + i_60_) < this.mouseY)
			        && (this.mouseY < i_60_))
			{
				i_61_ = 16776960;
				if (anInt887 != 0)
				{
					anInt994 = 0;
					anInt887 = 0;
				}
			}
			gameGraphics.method324("Cancel", 0, 1, i_61_, 264, i_60_);
			if ((anInt887 == 1) && ((i_57_ > this.mouseX) || ((i_55_ + i_57_) < this.mouseX)
			        || (i_58_ > this.mouseY) || (this.mouseY > (i_58_ - -i_56_))))
			{
				anInt887 = 0;
				anInt994 = 0;
			}
		}
	}

	private void method500()
	{
		if (((0x1 & anInt933) != 1) || !method541(anInt933))
		{
			if (((0x1 & anInt933) == 0) && method541(anInt933))
			{
				if (method541((anInt933 - -1) & 0x7))
				{
					anInt933 = (anInt933 + 1) & 0x7;
				}
				else if (method541(0x7 & (anInt933 + 7)))
				{
					anInt933 = 0x7 & (anInt933 + 7);
				}
			}
			else
			{
				final int[] is = { 1, -1, 2, -2, 3, -3, 4 };
				for (int i = 0; i < 7; i++)
				{
					if (method541((anInt933 - (-is[i] - 8)) & 0x7))
					{
						anInt933 = ((anInt933 - -is[i]) + 8) & 0x7;
						break;
					}
				}
				if (((anInt933 & 0x1) == 0) && method541(anInt933))
				{
					if (method541(0x7 & (anInt933 + 1)))
					{
						anInt933 = 0x7 & (anInt933 + 1);
					}
					else if (method541(0x7 & (anInt933 + 7)))
					{
						anInt933 = (anInt933 + 7) & 0x7;
					}
				}
			}
		}
	}

	private void method502(final String string, final int i)
	{
		if (i >= (GameWindowMiddleMan.ignoreListCount ^ 0xffffffff))
		{
			displayMessage(0, "Ignore list full", 0, null, i + 80, null, null, false);
		}
		else
		{
			final String string_66_ = Class43.method298(string);
			if (string_66_ != null)
			{
				for (int i_67_ = 0; GameWindowMiddleMan.ignoreListCount > i_67_; i_67_++)
				{
					if (string_66_.equals(Class43.method298((GameWindowMiddleMan.ignoreListNames[i_67_]))))
					{
						displayMessage(0,
						        new StringBuilder().append(string).append(" is already on your ignore list").toString(),
						        0, null, -22, null, null, false);
						return;
					}
					if ((EngineHandle.aStringArray7[i_67_] != null)
					        && string_66_.equals(Class43.method298((EngineHandle.aStringArray7[i_67_]))))
					{
						displayMessage(0,
						        new StringBuilder().append(string).append(" is already on your ignore list").toString(),
						        0, null, -93, null, null, false);
						return;
					}
				}
				for (int i_68_ = 0; i_68_ < GameWindowMiddleMan.friendsCount; i_68_++)
				{
					if (string_66_.equals(Class43.method298((GameWindowMiddleMan.friendsListNames[i_68_]))))
					{
						displayMessage(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your friends list first").toString(),
						        0, null, -18, null, null, false);
						return;
					}
					if ((RuntimeException_Sub1.aStringArray41[i_68_] != null) && (string_66_
					        .equals(Class43.method298((RuntimeException_Sub1.aStringArray41[i_68_])))))
					{
						displayMessage(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your friends list first").toString(),
						        0, null, -8, null, null, false);
						return;
					}
				}
				if (string_66_.equals(Class43.method298(ourPlayer.maybe_accountName)))
				{
					displayMessage(0, "You can't add yourself to your ignore list", 0, null, -38, null, null, false);
				}
				else
				{
					streamClass.createPacket(132);
					streamClass.aClass27_Sub1_Sub1_1.method389(i ^ ~0x64, string);
					streamClass.finishPacket();
				}
			}
		}
	}

	private void method503(final int i, final int i_69_, final int i_70_)
	{
		boolean bool = false;
		int i_71_ = 0;
		final int i_72_ = inventoryItems[i_69_];
		for (int i_73_ = 0; i_73_ < anInt1049; i_73_++)
		{
			if (i_72_ == anIntArray180[i_73_])
			{
				if (EntityHandler.itemdef_isUnstackable[i_72_] == 0)
				{
					if (0 > i)
					{
						for (int i_74_ = 0; anInt1036 > i_74_; i_74_++)
						{
							if (anIntArray164[i_73_] < inventoryItemsCount[i_69_])
							{
								anIntArray164[i_73_]++;
							}
							bool = true;
						}
					}
					else
					{
						anIntArray164[i_73_] += i;
						bool = true;
						if (anIntArray164[i_73_] > inventoryItemsCount[i_69_])
						{
							anIntArray164[i_73_] = inventoryItemsCount[i_69_];
						}
					}
				}
				else
				{
					i_71_++;
				}
			}
		}
		final int i_75_ = inventoryCount(i_72_);
		if (i_70_ == 2)
		{
			if (i_71_ >= i_75_)
			{
				bool = true;
			}
			if (EntityHandler.itemdef_isQuest[i_72_] == 1)
			{
				displayMessage(0, "This object cannot be traded with other players", 0, null, -17, null, null, false);
				bool = true;
			}
			if (!bool)
			{
				if (0 <= i)
				{
					for (int i_76_ = 0; (i > i_76_) && (12 > anInt1049) && (i_71_ < i_75_); i_76_++)
					{
						anIntArray180[anInt1049] = i_72_;
						anIntArray164[anInt1049] = 1;
						anInt1049++;
						bool = true;
						i_71_++;
						if ((i_76_ == 0) && (EntityHandler.itemdef_isUnstackable[i_72_] == 0))
						{
							anIntArray164[anInt1049 + -1] = (i <= inventoryItemsCount[i_69_] ? i : inventoryItemsCount[i_69_]);
							break;
						}
					}
				}
				else if (12 > anInt1049)
				{
					anIntArray180[anInt1049] = i_72_;
					anIntArray164[anInt1049] = 1;
					anInt1049++;
					bool = true;
				}
			}
			if (bool)
			{
				streamClass.createPacket(46);
				streamClass.aClass27_Sub1_Sub1_1.put(anInt1049);
				for (int i_77_ = 0; i_77_ < anInt1049; i_77_++)
				{
					streamClass.aClass27_Sub1_Sub1_1.putShort(anIntArray180[i_77_]);
					streamClass.aClass27_Sub1_Sub1_1.putInt(anIntArray164[i_77_]);
				}
				streamClass.finishPacket();
				aBool68 = false;
				aBool67 = false;
			}
		}
	}

	void drawNpc(final int i, final int i_78_, final int i_79_, final int i_80_, final int i_81_, int i_82_, final int i_84_)
	{
		final Mob class15 = npcArray[i_78_];
		int i_85_ = (class15.currentSprite - -((anInt843 - -16) / 32)) & 0x7;
		boolean bool = false;
		int i_86_ = i_85_;
		if (i_86_ != 5)
		{
			if (i_86_ == 6)
			{
				bool = true;
				i_86_ = 2;
			}
			else if (i_86_ == 7)
			{
				i_86_ = 1;
				bool = true;
			}
		}
		else
		{
			i_86_ = 3;
			bool = true;
		}
		int i_87_ = (i_86_ * 3) + walkModel[((class15.stepFrame / (EntityHandler.npcdef_walkModel[class15.type])) % 4)];
		if (class15.currentSprite == 8)
		{
			i_82_ -= ((i_79_ * EntityHandler.npcdef_combatSprite[class15.type]) / 100);
			i_86_ = 5;
			i_85_ = 2;
			bool = false;
			i_87_ = npcCombatModelArray1[(anInt930 / ((EntityHandler.npcdef_combatModel[class15.type]) - 1)) % 8] + (i_86_ * 3);
		}
		else if (class15.currentSprite == 9)
		{
			i_82_ += ((i_79_ * EntityHandler.npcdef_combatSprite[class15.type]) / 100);
			i_86_ = 5;
			bool = true;
			i_85_ = 2;
			i_87_ = (i_86_ * 3) + npcCombatModelArray2[(anInt930 / (EntityHandler.npcdef_combatModel[(class15.type)])) % 8];
		}
		for (int i_88_ = 0; i_88_ < 12; i_88_++)
		{
			final int i_89_ = npcAnimationArray[i_85_][i_88_];
			final int i_90_ = (EntityHandler.npcdef_sprites[class15.type][i_89_]);
			if (0 <= i_90_)
			{
				int i_91_ = 0;
				int i_92_ = 0;
				int i_93_ = i_87_;
				if (bool && (1 <= i_86_) && (i_86_ <= 3) && (EntityHandler.animationdef_hasF[i_90_] == 1))
				{
					i_93_ += 15;
				}
				if ((i_86_ != 5) || (EntityHandler.animationdef_hasA[i_90_] == 1))
				{
					final int i_94_ = i_93_ - -EntityHandler.animationdef_number[i_90_];
					final int i_95_ = (gameGraphics.anIntArray125[i_94_]);
					final int i_96_ = (gameGraphics.anIntArray122[i_94_]);
					final int i_97_ = (gameGraphics.anIntArray125[EntityHandler.animationdef_number[i_90_]]);
					if ((i_95_ != 0) && (i_96_ != 0) && (i_97_ != 0))
					{
						i_92_ = (i_81_ * i_92_) / i_96_;
						i_91_ = (i_91_ * i_84_) / i_95_;
						final int i_98_ = (i_84_ * (gameGraphics.anIntArray125[i_94_])) / i_97_;
						i_91_ -= (i_98_ + -i_84_) / 2;
						int i_99_ = EntityHandler.animationdef_color[i_90_];
						int i_100_ = 0;
						if (i_99_ != 1)
						{
							if (i_99_ == 2)
							{
								i_99_ = (EntityHandler.npcdef_topColor[class15.type]);
								i_100_ = (EntityHandler.npcdef_skinColor[class15.type]);
							}
							else if (i_99_ == 3)
							{
								i_100_ = (EntityHandler.npcdef_skinColor[class15.type]);
								i_99_ = (EntityHandler.npcdef_bottomColor[class15.type]);
							}
						}
						else
						{
							i_99_ = (EntityHandler.npcdef_hairColor[class15.type]);
							i_100_ = (EntityHandler.npcdef_skinColor[class15.type]);
						}
						gameGraphics.method348(bool, i_100_, -118, i_81_, i_92_ + i_80_, i_98_, i, i_94_, i_99_,
						        i_91_ + i_82_);
					}
				}
			}
		}
		if (class15.anInt165 > 0)
		{
			anIntArray158[anInt978] = gameGraphics.method328(class15.aString8, -100, 1) / 2;
			if (anIntArray158[anInt978] > 150)
			{
				anIntArray158[anInt978] = 150;
			}
			anIntArray187[anInt978] = ((gameGraphics.method328(class15.aString8, -126, 1) / 300)
			        * gameGraphics.method315(1));
			anIntArray195[anInt978] = i_82_ - -(i_84_ / 2);
			anIntArray203[anInt978] = i_80_;
			aStringArray47[anInt978++] = class15.aString8;
		}
		if ((class15.currentSprite == 8) || (class15.currentSprite == 9) || (class15.anInt145 != 0))
		{
			if (0 < class15.anInt145)
			{
				int i_101_ = i_82_;
				if (class15.currentSprite != 8)
				{
					if (class15.currentSprite == 9)
					{
						i_101_ += (i_79_ * 20) / 100;
					}
				}
				else
				{
					i_101_ -= (i_79_ * 20) / 100;
				}
				final int i_102_ = ((class15.anInt143 * 30) / class15.anInt148);
				anIntArray216[anInt977] = i_101_ + (i_84_ / 2);
				anIntArray173[anInt977] = i_80_;
				anIntArray202[anInt977++] = i_102_;
			}
			if (150 < class15.anInt145)
			{
				int i_103_ = i_82_;
				if (class15.currentSprite != 8)
				{
					if (class15.currentSprite == 9)
					{
						i_103_ = ((i_79_ * 10) / 100) + i_103_;
					}
				}
				else
				{
					i_103_ -= (i_79_ * 10) / 100;
				}
				gameGraphics.drawPicture(anInt935 + 12, (i_80_ + -12) - -(i_81_ / 2), i_103_ - (-(i_84_ / 2) - -12));
				gameGraphics.drawText(16777215, 255, 3,
				        new StringBuilder().append("").append(class15.anInt157).toString(), ((i_81_ / 2) - -5) + i_80_,
				        ((i_84_ / 2) - 1) + i_103_);
			}
		}
	}

	private Model method506(final boolean bool, final int i, final int i_104_, final int i_105_, final int i_106_,
	        final int i_107_)
	{
		int i_108_ = i_105_;
		int i_109_ = i_106_;
		int i_110_ = i_105_;
		int i_111_ = i_106_;
		final int i_112_ = EntityHandler.wallobjectdef_modelVar2[i_104_];
		final int i_113_ = EntityHandler.wallobjectdef_modelVar3[i_104_];
		final int i_114_ = EntityHandler.wallobjectdef_height[i_104_];
		final Model class23 = new Model(4, 1);
		if (i_107_ == 0)
		{
			i_110_ = i_105_ + 1;
		}
		if (i_107_ == 1)
		{
			i_111_ = i_106_ + 1;
		}
		if (i_107_ == 2)
		{
			i_108_ = i_105_ - -1;
			i_111_ = i_106_ + 1;
		}
		i_108_ *= tileSize;
		i_109_ *= tileSize;
		if (i_107_ == 3)
		{
			i_111_ = i_106_ + 1;
			i_110_ = i_105_ - -1;
		}
		i_111_ *= tileSize;
		i_110_ *= tileSize;
		final int i_115_ = class23.method161(-engineHandle.getAveragedElevation(i_109_, i_108_), i_108_, i_109_);
		final int i_116_ = class23.method161(-engineHandle.getAveragedElevation(i_109_, i_108_) + -i_114_, i_108_,
		        i_109_);
		final int i_117_ = class23.method161(-engineHandle.getAveragedElevation(i_111_, i_110_) - i_114_, i_110_,
		        i_111_);
		final int i_118_ = class23.method161(-engineHandle.getAveragedElevation(i_111_, i_110_), i_110_, i_111_);
		final int[] is = { i_115_, i_116_, i_117_, i_118_ };
		class23.method144(is, i_113_, i_112_, -1062, 4);
		class23.method151(-50, 60, 256, 24, bool, -10, -50);
		if ((i_105_ >= 0) && (i_106_ >= 0) && (96 > i_105_) && (96 > i_106_))
		{
			gameCamera.addModel(class23);
		}
		class23.anInt288 = i + 10000;
		return class23;
	}

	private void resetLoginVars()
	{
		loginPassword = "";
		loginUsername = "";
		loggedIn = 0;
		maybe_loginScreenNumber = 0;
		playerCount = 0;
		npcCount = 0;
	}

	private void drawChatMessageTabs()
	{
		gameGraphics.drawPicture(anInt935 + 23, windowHeight + -4, 0);
		int i_119_ = Class34.method227(false, 200, 200, 255);
		if (messagesTab == 0)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt1056 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		gameGraphics.drawText(i_119_, 255, 0, "All messages", windowHeight + 6, 54);
		i_119_ = Class34.method227(false, 200, 200, 255);
		if (messagesTab == 1)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt986 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		gameGraphics.drawText(i_119_, 255, 0, "Chat history", windowHeight + 6, 155);
		i_119_ = Class34.method227(false, 200, 200, 255);
		if (messagesTab == 2)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt943 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		gameGraphics.drawText(i_119_, 255, 0, "Quest history", windowHeight + 6, 255);
		i_119_ = Class34.method227(false, 200, 200, 255);
		if (messagesTab == 3)
		{
			i_119_ = Class34.method227(false, 200, 255, 50);
		}
		if (15 < (anInt981 % 30))
		{
			i_119_ = Class34.method227(false, 50, 255, 50);
		}
		gameGraphics.drawText(i_119_, 255, 0, "Private history", windowHeight + 6, 355);
		gameGraphics.drawText(16777215, 255, 0, "Report abuse", windowHeight - -6, 457);
	}

	@Override
	void method477(final Runnable runnable)
	{
		GameFrame.aClass32_4.method218(1, runnable);
	}

	private void method509(final int i, final int i_120_, final int i_121_, final int i_122_)
	{
		gameGraphics.method318(i_122_, -13292, i_121_, i_120_);
		gameGraphics.method318(i_122_ + -1, -13292, i_121_, i_120_);
		gameGraphics.method318(i_122_ + 1, -13292, i_121_, i_120_);
		gameGraphics.method318(i_122_, i + -13290, i_121_ + -1, i_120_);
		if (i != -2)
		{
			inventoryCount(-25);
		}
		gameGraphics.method318(i_122_, i ^ 0x33ea, i_121_ + 1, i_120_);
	}

	private boolean method510(final String string, final String string_123_, final int i)
	{
		final String string_124_ = Class43.method298(string_123_);
		if (string_124_ == null)
		{
			return false;
		}
		if (string_124_.equals(Class43.method298((ourPlayer.maybe_accountName))))
		{
			return false;
		}
		if (i >= -90)
		{
			return true;
		}
		boolean bool = false;
		boolean bool_125_ = false;
		for (int i_126_ = 0; i_126_ < GameWindowMiddleMan.friendsCount; i_126_++)
		{
			if (string_124_.equals(Class43.method298((GameWindowMiddleMan.friendsListNames[i_126_]))))
			{
				if ((0x4 & GameWindowMiddleMan.friendsListOnlineStatus[i_126_]) != 0)
				{
					bool_125_ = true;
				}
				bool = true;
				break;
			}
		}
		if (!bool)
		{
			boolean bool_127_ = false;
			for (int i_128_ = 0; GameWindowMiddleMan.ignoreListCount > i_128_; i_128_++)
			{
				if (string_124_.equals(Class43.method298((Camera.aStringArray28[i_128_]))))
				{
					bool_127_ = true;
					break;
				}
			}
			if (!bool_127_)
			{
				aClass29_1.method208(2831, string_123_, string, (byte) -125, "Add friend",
				        new StringBuilder().append("@whi@").append(string).toString());
				aClass29_1.method208(2832, string_123_, string, (byte) -93, "Add ignore",
				        new StringBuilder().append("@whi@").append(string).toString());
			}
		}
		else if (bool_125_)
		{
			aClass29_1.method208(2830, string_123_, string, (byte) -59, "Message",
			        new StringBuilder().append("@whi@").append(string).toString());
		}
		aClass29_1.method208(2833, string_123_, string, (byte) -80, "Report abuse",
		        new StringBuilder().append("@whi@").append(string).toString());
		return true;
	}

	void drawPlayer(final int i, final int i_129_, int i_130_, final int i_131_, final int i_132_, final int i_134_,
	        final int i_135_)
	{
		final Mob mob = playerArray[i];
		if (mob.colorBottomType != 255)
		{
			int wantedAnimDir = 0x7 & (mob.currentSprite + ((anInt843 + 16) / 32));
			boolean mirrorX = false;
			int actualAnimDir = wantedAnimDir;
			if (actualAnimDir != 5)
			{
				if (actualAnimDir != 6)
				{
					if (actualAnimDir == 7)
					{
						mirrorX = true;
						actualAnimDir = 1;
					}
				}
				else
				{
					actualAnimDir = 2;
					mirrorX = true;
				}
			}
			else
			{
				mirrorX = true;
				actualAnimDir = 3;
			}
			int spriteOffset = ((actualAnimDir * 3) + walkModel[(mob.stepFrame / 6) % 4]);
			if (mob.currentSprite != 8)
			{
				if (mob.currentSprite == 9)
				{
					mirrorX = true;
					wantedAnimDir = 2;
					i_130_ += (i_131_ * 5) / 100;
					actualAnimDir = 5;
					spriteOffset = (actualAnimDir * 3) - -npcCombatModelArray2[(anInt930 / 6) % 8];
				}
			}
			else
			{
				i_130_ -= (i_131_ * 5) / 100;
				mirrorX = false;
				actualAnimDir = 5;
				wantedAnimDir = 2;
				spriteOffset = npcCombatModelArray1[(anInt930 / 5) % 8] + (actualAnimDir * 3);
			}
			for (int i_139_ = 0; i_139_ < 12; i_139_++)
			{
				final int animIndex = npcAnimationArray[wantedAnimDir][i_139_];
				final int animId = mob.animationCount[animIndex] - 1;
				if (animId >= 0)
				{
					int spriteOffsetX = 0;
					int spriteOffsetY = 0;
					int mySpriteOffset = spriteOffset;
					if (mirrorX && (actualAnimDir >= 1) && (3 >= actualAnimDir))
					{
						if (EntityHandler.animationdef_hasF[animId] != 1)
						{
							if ((animIndex == 4) && (actualAnimDir == 1))
							{
								spriteOffsetY = -3;
								spriteOffsetX = -22;
								mySpriteOffset = (walkModel[((mob.stepFrame / 6) + 2) % 4]) + (actualAnimDir * 3);
							}
							else if ((animIndex != 4) || (actualAnimDir != 2))
							{
								if ((animIndex != 4) || (actualAnimDir != 3))
								{
									if ((animIndex != 3) || (actualAnimDir != 1))
									{
										if ((animIndex != 3) || (actualAnimDir != 2))
										{
											if ((animIndex == 3) && (actualAnimDir == 3))
											{
												mySpriteOffset = ((walkModel[(((mob.stepFrame) / 6) + 2) % 4])
												        + (actualAnimDir * 3));
												spriteOffsetY = 5;
												spriteOffsetX = -26;
											}
										}
										else
										{
											spriteOffsetX = 0;
											spriteOffsetY = 8;
											mySpriteOffset = ((actualAnimDir * 3)
											        - -(walkModel[(((mob.stepFrame) / 6) + 2) % 4]));
										}
									}
									else
									{
										mySpriteOffset = (walkModel[((mob.stepFrame / 6) + 2) % 4]) + (actualAnimDir * 3);
										spriteOffsetX = 22;
										spriteOffsetY = 3;
									}
								}
								else
								{
									spriteOffsetX = 26;
									spriteOffsetY = -5;
									mySpriteOffset = (walkModel[((mob.stepFrame / 6) + 2) % 4]) + (actualAnimDir * 3);
								}
							}
							else
							{
								spriteOffsetY = -8;
								spriteOffsetX = 0;
								mySpriteOffset = (walkModel[((mob.stepFrame / 6) + 2) % 4]) + (actualAnimDir * 3);
							}
						}
						else
						{
							mySpriteOffset += 15;
						}
					}
					if ((actualAnimDir != 5) || (EntityHandler.animationdef_hasA[animId] == 1))
					{
						final int sprite = mySpriteOffset + EntityHandler.animationdef_number[animId];
						final int i_146_ = gameGraphics.anIntArray125[sprite];
						final int i_147_ = gameGraphics.anIntArray122[sprite];
						final int i_148_ = (gameGraphics.anIntArray125[EntityHandler.animationdef_number[animId]]);
						if ((i_146_ != 0) && (i_147_ != 0) && (i_148_ != 0))
						{
							spriteOffsetX = (i_132_ * spriteOffsetX) / i_146_;
							spriteOffsetY = (spriteOffsetY * i_129_) / i_147_;
							final int i_149_ = (i_132_ * i_146_) / i_148_;
							spriteOffsetX -= (i_149_ + -i_132_) / 2;
							int colorMask1 = EntityHandler.animationdef_color[animId];
							final int i_151_ = characterSkinColors[mob.colorSkinType];
							if (colorMask1 == 1)
							{
								colorMask1 = (characterHairColors[mob.colorHairType]);
							}
							else if (colorMask1 == 2)
							{
								colorMask1 = (characterTopBottomColors[mob.colorTopType]);
							}
							else if (colorMask1 == 3)
							{
								colorMask1 = (characterTopBottomColors[mob.colorBottomType]);
							}
							gameGraphics.method348(mirrorX, i_151_, -107, i_129_, i_135_ - -spriteOffsetY, i_149_, i_134_,  sprite, colorMask1, i_130_ - -spriteOffsetX);
						}
					}
				}
			}
			if (0 < mob.anInt165)
			{
				anIntArray158[anInt978] = gameGraphics.method328(mob.aString8, -100, 1) / 2;
				if (150 < anIntArray158[anInt978])
				{
					anIntArray158[anInt978] = 150;
				}
				anIntArray187[anInt978] = ((gameGraphics.method328(mob.aString8, -106, 1) / 300) * gameGraphics.method315(1));
				anIntArray195[anInt978] = i_130_ + (i_132_ / 2);
				anIntArray203[anInt978] = i_135_;
				aStringArray47[anInt978++] = mob.aString8;
			}
			if (0 < mob.anInt168)
			{
				anIntArray217[anInt960] = i_130_ - -(i_132_ / 2);
				anIntArray218[anInt960] = i_135_;
				anIntArray169[anInt960] = i_131_;
				anIntArray213[anInt960++] = mob.anInt162;
			}
			if ((mob.currentSprite == 8) || (mob.currentSprite == 9) || (mob.anInt145 != 0))
			{
				if (mob.anInt145 > 0)
				{
					int i_152_ = i_130_;
					if (mob.currentSprite != 8)
					{
						if (mob.currentSprite == 9)
						{
							i_152_ += (i_131_ * 20) / 100;
						}
					}
					else
					{
						i_152_ -= (i_131_ * 20) / 100;
					}
					final int i_153_ = ((mob.anInt143 * 30) / mob.anInt148);
					anIntArray216[anInt977] = (i_132_ / 2) + i_152_;
					anIntArray173[anInt977] = i_135_;
					anIntArray202[anInt977++] = i_153_;
				}
				if (150 < mob.anInt145)
				{
					int i_154_ = i_130_;
					if (mob.currentSprite == 8)
					{
						i_154_ -= (i_131_ * 10) / 100;
					}
					else if (mob.currentSprite == 9)
					{
						i_154_ = ((i_131_ * 10) / 100) + i_154_;
					}
					gameGraphics.drawPicture(anInt935 + 11, i_135_ + (i_129_ / 2) + -12, (i_132_ / 2) + i_154_ + -12);
					gameGraphics.drawText(16777215, 255, 3, new StringBuilder().append("").append(mob.anInt157).toString(),  i_135_ + (i_129_ / 2) + 5, (i_154_ - -(i_132_ / 2)) + -1);
				}
			}
			if ((mob.skull == 1) && (mob.anInt168 == 0))
			{
				int i_155_ = i_130_ + (i_132_ / 2) + i_134_;
				if (mob.currentSprite == 8)
				{
					i_155_ -= (i_131_ * 20) / 100;
				}
				else if (mob.currentSprite == 9)
				{
					i_155_ += (i_131_ * 20) / 100;
				}
				final int i_156_ = (i_131_ * 16) / 100;
				final int i_157_ = (i_131_ * 16) / 100;
				gameGraphics.spriteClip1(i_156_, (i_135_ + -((i_131_ * 10) / 100) + -(i_157_ / 2)), anInt935 + 13, i_155_ - (i_156_ / 2), i_157_);
			}
		}
	}

	private Mob addNpc(final int y, final int serverIndex, final int type, final int sprite, final int x)
	{
		if (npcRecordArray[serverIndex] == null)
		{
			npcRecordArray[serverIndex] = new Mob();
			npcRecordArray[serverIndex].serverIndex = serverIndex;
		}
		final Mob mob = npcRecordArray[serverIndex];
		boolean foundExisting = false;
		for (int index = 0; index < lastNpcCount; index++)
		{
			if (serverIndex == lastNpcArray[index].serverIndex)
			{
				foundExisting = true;
				break;
			}
		}
		if (!foundExisting)
		{
			mob.serverIndex = serverIndex;
			mob.waypointsX[0] = mob.currentX = x;
			mob.waypointCurrentIndex = 0;
			mob.waypointEndSprite = 0;
			mob.type = type;
			mob.nextSprite = mob.currentSprite = sprite;
			mob.waypointsY[0] = mob.currentY = y;
			mob.stepFrame = 0;
		}
		else
		{
			mob.type = type;
			mob.nextSprite = sprite;
			int i_164_ = mob.waypointCurrentIndex;
			if ((mob.waypointsX[i_164_] != x) || (mob.waypointsY[i_164_] != y))
			{
				mob.waypointCurrentIndex = i_164_ = (i_164_ - -1) % 10;
				mob.waypointsX[i_164_] = x;
				mob.waypointsY[i_164_] = y;
			}
		}
		npcArray[npcCount++] = mob;
		return mob;
	}

	@Override
	protected void displayMessage(final int i, final String string, final int i_165_, final String string_166_,
	        final int i_167_, final String string_168_, final String string_169_, final boolean bool)
	{
		if (((i_165_ == 1) || (i_165_ == 4) || (i_165_ == 6)) && (string_169_ != null) && !bool)
		{
			final String string_170_ = Class43.method298(string_169_);
			if (string_170_ == null)
			{
				return;
			}
			for (int i_171_ = 0; i_171_ < GameWindowMiddleMan.ignoreListCount; i_171_++)
			{
				if (string_170_.equals(Class43.method298((Camera.aStringArray28[i_171_]))))
				{
					return;
				}
			}
		}
		String string_172_ = CameraModel.aStringArray20[i_165_];
		if (string_168_ != null)
		{
			string_172_ = string_168_;
		}
		if (messagesTab != 0)
		{
			if ((i_165_ == 0) || (i_165_ == 7))
			{
				anInt1056 = 200;
			}
			if ((i_165_ == 4) && (messagesTab != 1))
			{
				anInt986 = 200;
			}
			if ((i_165_ == 3) && (messagesTab != 2))
			{
				anInt943 = 200;
			}
			if (((i_165_ == 5) || (i_165_ == 1) || (i_165_ == 2)) && (messagesTab != 3))
			{
				anInt981 = 200;
			}
			if ((i_165_ == 0) && (messagesTab != 0))
			{
				messagesTab = 0;
			}
			if (((i_165_ == 5) || (i_165_ == 1) || (i_165_ == 2)) && (messagesTab != 3) && (messagesTab != 0))
			{
				messagesTab = 0;
			}
		}
		if (i_167_ >= -6)
		{
			removeFromFriends(null);
		}
		for (int i_173_ = 99; i_173_ > 0; i_173_--)
		{
			ByteBuffer.anIntArray142[i_173_] = ByteBuffer.anIntArray142[i_173_ + -1];
			mudclient.messagesTimeout[i_173_] = mudclient.messagesTimeout[i_173_ + -1];
			GameImage.anIntArray126[i_173_] = GameImage.anIntArray126[i_173_ + -1];
			Class13.aStringArray13[i_173_] = Class13.aStringArray13[i_173_ + -1];
			Class27.aStringArray23[i_173_] = Class27.aStringArray23[i_173_ + -1];
			Class2.aStringArray3[i_173_] = Class2.aStringArray3[i_173_ + -1];
			CameraModel.aStringArray21[i_173_] = CameraModel.aStringArray21[i_173_ + -1];
		}
		ByteBuffer.anIntArray142[0] = i_165_;
		mudclient.messagesTimeout[0] = 300;
		GameImage.anIntArray126[0] = i;
		Class13.aStringArray13[0] = string_166_;
		Class27.aStringArray23[0] = string_169_;
		Class2.aStringArray3[0] = string;
		CameraModel.aStringArray21[0] = string_172_;
		final String string_174_ = new StringBuilder().append(string_172_)
		        .append(Class13.method110(string, string_166_, i_165_)).toString();
		if (i_165_ == 4)
		{
			if ((gameMenu.anIntArray24[anInt1052] + -4) != gameMenu.anIntArray23[anInt1052])
			{
				gameMenu.method88(anInt1052, string_174_, i, false, string_169_, string_166_);
			}
			else
			{
				gameMenu.method88(anInt1052, string_174_, i, true, string_169_, string_166_);
			}
		}
		if (i_165_ == 3)
		{
			if ((gameMenu.anIntArray24[anInt987] + -4) != gameMenu.anIntArray23[anInt987])
			{
				gameMenu.method88(anInt987, string_174_, 0, false, null, null);
			}
			else
			{
				gameMenu.method88(anInt987, string_174_, 0, true, null, null);
			}
		}
		if ((i_165_ == 1) || (i_165_ == 2))
		{
			int i_175_ = i;
			if (i_165_ != 1)
			{
				i_175_ = 0;
			}
			if ((gameMenu.anIntArray24[anInt990] + -4) != gameMenu.anIntArray23[anInt990])
			{
				gameMenu.method88(anInt990, string_174_, i_175_, false, string_169_, string_166_);
			}
			else
			{
				gameMenu.method88(anInt990, string_174_, i_175_, true, string_169_, string_166_);
			}
		}
	}

	private void method514(final int i)
	{
		if (((messagesTab == 1) && gameMenu.method81(anInt1052))
		        || ((messagesTab == 3) && gameMenu.method81(anInt990)))
		{
			final int i_176_ = messagesTab == 1 ? anInt1052 : anInt990;
			final int i_177_ = gameMenu.method90(i_176_, (byte) 52);
			if (((i_177_ >> 16) == 2) || (configMouseButtons && ((i_177_ >> 16) == 1)))
			{
				final int i_178_ = i_177_ & 0xffff;
				final String string = gameMenu.method89(13789, i_176_, i_178_);
				final String string_179_ = gameMenu.method99(i_178_, i_176_);
				if (method510(string_179_, string, -99))
				{
					return;
				}
			}
		}
		if (messagesTab == 0)
		{
			for (int i_180_ = 0; 100 > i_180_; i_180_++)
			{
				if ((mudclient.messagesTimeout[i_180_] > 0) && ((ByteBuffer.anIntArray142[i_180_] == 4)
				        || (ByteBuffer.anIntArray142[i_180_] == 1) || (ByteBuffer.anIntArray142[i_180_] == 5)
				        || (ByteBuffer.anIntArray142[i_180_] == 6)))
				{
					final String string = new StringBuilder().append(CameraModel.aStringArray21[i_180_])
					        .append(Class13.method110(Class2.aStringArray3[i_180_], (Class13.aStringArray13[i_180_]),
					                (ByteBuffer.anIntArray142[i_180_])))
					        .toString();
					if ((this.mouseX > 7) && (this.mouseX < (gameGraphics.method328(string, -126, 1) + 7))
					        && (this.mouseY > (-(i_180_ * 12) + windowHeight + -30))
					        && (this.mouseY < (-(i_180_ * 12) + windowHeight + -18))
					        && ((anInt887 == 2) || (configMouseButtons && (anInt887 == 1)))
					        && method510(Class13.aStringArray13[i_180_], Class27.aStringArray23[i_180_], -126))
					{
						return;
					}
				}
			}
		}
		aBool82 = false;
		int i_181_ = -1;
		for (int i_182_ = 0; objectCount > i_182_; i_182_++)
		{
			aBoolArray13[i_182_] = false;
		}
		for (int i_183_ = 0; i_183_ < wallObjectCount; i_183_++)
		{
			aBoolArray14[i_183_] = false;
		}
		final int i_184_ = gameCamera.method282(-1);
		final Model[] class23s = gameCamera.method295(i + -28238);
		if (i == 10000)
		{
			final int[] is = gameCamera.method266();
			for (int i_185_ = 0; (i_184_ > i_185_) && (aClass29_1.method198() <= 200); i_185_++)
			{
				int i_186_ = is[i_185_];
				final Model class23 = class23s[i_185_];
				if ((65535 >= class23.anIntArray60[i_186_])
				        || ((200000 <= class23.anIntArray60[i_186_]) && (300000 >= class23.anIntArray60[i_186_])))
				{
					if (class23 == gameCamera.aClass23_3)
					{
						final int i_187_ = class23.anIntArray60[i_186_] % 10000;
						final int i_188_ = class23.anIntArray60[i_186_] / 10000;
						if (i_188_ == 1)
						{
							method498(i_187_);
						}
						else if (i_188_ != 2)
						{
							if (i_188_ == 3)
							{
								String string = "";
								int i_189_ = -1;
								final int i_190_ = (npcArray[i_187_].type);
								if (EntityHandler.npcdef_attackable[i_190_] > 0)
								{
									final int i_191_ = ((EntityHandler.npcdef_defense[i_190_] + EntityHandler.npcdef_strength[i_190_]
									        + EntityHandler.npcdef_attack[i_190_] + (EntityHandler.npcdef_hits[i_190_]))
									        / 4);
									final int i_192_ = ((anIntArray200[1] + anIntArray200[2]
									        + ((anIntArray200[3] + anIntArray200[0]) - -27)) / 4);
									i_189_ = -i_191_ + i_192_;
									string = "@yel@";
									if (i_189_ < 0)
									{
										string = "@or1@";
									}
									if (i_189_ < -3)
									{
										string = "@or2@";
									}
									if (-6 > i_189_)
									{
										string = "@or3@";
									}
									if (-9 > i_189_)
									{
										string = "@red@";
									}
									if (0 < i_189_)
									{
										string = "@gr1@";
									}
									if (i_189_ > 3)
									{
										string = "@gr2@";
									}
									if (i_189_ > 6)
									{
										string = "@gr3@";
									}
									if (9 < i_189_)
									{
										string = "@gre@";
									}
									string = new StringBuilder().append(" ").append(string).append("(level-")
									        .append(i_191_).append(")").toString();
								}
								if (anInt940 >= 0)
								{
									if (EntityHandler.spelldef_type[anInt940] == 2)
									{
										aClass29_1.method195(new StringBuilder().append("Cast ")
										        .append(EntityHandler.spelldef_name[anInt940]).append(" on").toString(),
										        npcArray[i_187_].serverIndex,
										        new StringBuilder().append("@yel@").append(
										                EntityHandler.npcdef_name[(npcArray[i_187_].type)])
										                .toString(),
										        0, anInt940, 700);
									}
								}
								else if (0 > anInt989)
								{
									if (0 < EntityHandler.npcdef_attackable[i_190_])
									{
										aClass29_1.method196("Attack", 0 > i_189_ ? 2715 : 715,
										        new StringBuilder().append("@yel@").append(
										                EntityHandler.npcdef_name[(npcArray[i_187_].type)])
										                .append(string).toString(),
										        (npcArray[i_187_]).serverIndex);
									}
									aClass29_1.method196("Talk-to", 720,
									        new StringBuilder().append("@yel@")
									                .append(EntityHandler.npcdef_name[(npcArray[i_187_].type)])
									                .toString(),
									        (npcArray[i_187_].serverIndex));
									if (!EntityHandler.npcdef_command[i_190_].equals(""))
									{
										aClass29_1.method196(EntityHandler.npcdef_command[i_190_], 725,
										        new StringBuilder().append("@yel@").append(
										                EntityHandler.npcdef_name[(npcArray[i_187_].type)])
										                .toString(),
										        (npcArray[i_187_]).serverIndex);
									}
									aClass29_1.method196("Examine", 3700,
									        new StringBuilder().append("@yel@")
									                .append(EntityHandler.npcdef_name[(npcArray[i_187_].type)])
									                .toString(),
									        (npcArray[i_187_].type));
								}
								else
								{
									aClass29_1.method195(
									        new StringBuilder()
									                .append("Use ").append(aString30).append(" with").toString(),
									        (npcArray[i_187_].serverIndex),
									        new StringBuilder().append("@yel@")
									                .append(EntityHandler.npcdef_name[(npcArray[i_187_].type)])
									                .toString(),
									        0, anInt989, 710);
								}
							}
						}
						else if (0 > anInt940)
						{
							if (0 > anInt989)
							{
								aClass29_1.method193(groundItemType[i_187_],
								        new StringBuilder().append("@lre@")
								                .append(EntityHandler.itemdef_name[groundItemType[i_187_]]).toString(),
								        "Take", 220, groundItemY[i_187_], 2743, groundItemX[i_187_]);
								aClass29_1.method196("Examine", 3200,
								        new StringBuilder().append("@lre@")
								                .append(EntityHandler.itemdef_name[(groundItemType[i_187_])]).toString(),
								        groundItemType[i_187_]);
							}
							else
							{
								aClass29_1.method185(
								        new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
								        new StringBuilder().append("@lre@")
								                .append(EntityHandler.itemdef_name[groundItemType[i_187_]]).toString(),
								        groundItemType[i_187_], groundItemY[i_187_], 210, anInt989,
								        groundItemX[i_187_]);
							}
						}
						else if (EntityHandler.spelldef_type[anInt940] == 3)
						{
							aClass29_1.method185(
							        new StringBuilder().append("Cast ").append(EntityHandler.spelldef_name[anInt940])
							                .append(" on").toString(),
							        new StringBuilder().append("@lre@")
							                .append(EntityHandler.itemdef_name[groundItemType[i_187_]]).toString(),
							        groundItemType[i_187_], groundItemY[i_187_], 200, anInt940, groundItemX[i_187_]);
						}
					}
					else if ((class23 == null) || (10000 > class23.anInt288))
					{
						if ((class23 != null) && (class23.anInt288 >= 0))
						{
							final int i_193_ = class23.anInt288;
							final int i_194_ = objectType[i_193_];
							if (!aBoolArray13[i_193_])
							{
								if (anInt940 >= 0)
								{
									if (EntityHandler.spelldef_type[anInt940] == 5)
									{
										aClass29_1.method213(true, 400, objectRotation[i_193_],
										        new StringBuilder().append("@cya@")
										                .append(EntityHandler.objectdef_name[i_194_]).toString(),
										        objectY[i_193_], objectType[i_193_], objectX[i_193_],
										        anInt940,
										        new StringBuilder().append("Cast ")
										                .append(EntityHandler.spelldef_name[anInt940]).append(" on")
										                .toString());
									}
								}
								else if (anInt989 >= 0)
								{
									aClass29_1.method213(true, 410, objectRotation[i_193_],
									        new StringBuilder().append("@cya@").append(EntityHandler.objectdef_name[i_194_])
									                .toString(),
									        objectY[i_193_], objectType[i_193_], objectX[i_193_],
									        anInt989, new StringBuilder().append("Use ").append(aString30)
									                .append(" with").toString());
								}
								else
								{
									if (!EntityHandler.objectdef_command1[i_194_].equalsIgnoreCase("WalkTo"))
									{
										aClass29_1.method185(EntityHandler.objectdef_command1[i_194_],
										        new StringBuilder().append("@cya@")
										                .append(EntityHandler.objectdef_name[i_194_]).toString(),
										        objectRotation[i_193_], objectY[i_193_], 420,
										        objectType[i_193_], objectX[i_193_]);
									}
									if (!EntityHandler.objectdef_command2[i_194_].equalsIgnoreCase("Examine"))
									{
										aClass29_1.method185(EntityHandler.objectdef_command2[i_194_],
										        new StringBuilder().append("@cya@")
										                .append(EntityHandler.objectdef_name[i_194_]).toString(),
										        objectRotation[i_193_], objectY[i_193_], 2400,
										        objectType[i_193_], objectX[i_193_]);
									}
									aClass29_1.method196(
									        "Examine", 3400, new StringBuilder().append("@cya@")
									                .append(EntityHandler.objectdef_name[i_194_]).toString(),
									        i_194_);
								}
								aBoolArray13[i_193_] = true;
							}
						}
						else
						{
							if (0 <= i_186_)
							{
								i_186_ = (class23.anIntArray60[i_186_] + -200000);
							}
							if (i_186_ >= 0)
							{
								i_181_ = i_186_;
							}
						}
					}
					else
					{
						final int i_195_ = class23.anInt288 + -10000;
						final int i_196_ = wallObjectType[i_195_];
						if (!aBoolArray14[i_195_])
						{
							if (anInt940 >= 0)
							{
								if (EntityHandler.spelldef_type[anInt940] == 4)
								{
									aClass29_1.method185(new StringBuilder().append("Cast ")
									        .append(EntityHandler.spelldef_name[anInt940]).append(" on").toString(),
									        new StringBuilder().append("@cya@").append(EntityHandler.wallobjectdef_name[i_196_])
									                .toString(),
									        wallObjectDirection[i_195_], wallObjectY[i_195_], 300, anInt940,
									        wallObjectX[i_195_]);
								}
							}
							else if (0 <= anInt989)
							{
								aClass29_1.method185(
								        new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
								        new StringBuilder().append("@cya@").append(EntityHandler.wallobjectdef_name[i_196_])
								                .toString(),
								        wallObjectDirection[i_195_], wallObjectY[i_195_], 310, anInt989,
								        wallObjectX[i_195_]);
							}
							else
							{
								if (!EntityHandler.wallobjectdef_command1[i_196_].equalsIgnoreCase("WalkTo"))
								{
									aClass29_1.method193(wallObjectDirection[i_195_],
									        new StringBuilder().append("@cya@").append(EntityHandler.wallobjectdef_name[i_196_])
									                .toString(),
									        (EntityHandler.wallobjectdef_command1[i_196_]), 320, wallObjectY[i_195_], 2743,
									        wallObjectX[i_195_]);
								}
								if (!EntityHandler.wallobjectdef_command2[i_196_].equalsIgnoreCase("Examine"))
								{
									aClass29_1.method193(wallObjectDirection[i_195_],
									        new StringBuilder().append("@cya@").append(EntityHandler.wallobjectdef_name[i_196_])
									                .toString(),
									        EntityHandler.wallobjectdef_command2[i_196_], 2300, wallObjectY[i_195_], 2743,
									        wallObjectX[i_195_]);
								}
								aClass29_1.method196(
								        "Examine", 3300, new StringBuilder().append("@cya@")
								                .append(EntityHandler.wallobjectdef_name[i_196_]).toString(),
								        i_196_);
							}
							aBoolArray14[i_195_] = true;
						}
					}
				}
			}
			if ((0 <= anInt940) && (EntityHandler.spelldef_type[anInt940] <= 1))
			{
				aClass29_1.method196(new StringBuilder().append("Cast ").append(EntityHandler.spelldef_name[anInt940])
				        .append(" on self").toString(), 1000, "", anInt940);
			}
			if (i_181_ != -1)
			{
				final int i_197_ = i_181_;
				aBool82 = true;
				anInt1032 = engineHandle.anIntArray14[i_197_] + areaX;
				anInt958 = engineHandle.anIntArray11[i_197_] + areaY;
				if (0 > anInt940)
				{
					if (anInt989 < 0)
					{
						aClass29_1.method195("Walk here", engineHandle.anIntArray14[i_197_], "", 0,
						        engineHandle.anIntArray11[i_197_], 920);
					}
				}
				else if (EntityHandler.spelldef_type[anInt940] == 6)
				{
					aClass29_1.method193(anInt940, "",
					        new StringBuilder().append("Cast ").append(EntityHandler.spelldef_name[anInt940])
					                .append(" on ground").toString(),
					        900, engineHandle.anIntArray11[i_197_], i ^ 0x2da7, engineHandle.anIntArray14[i_197_]);
				}
			}
		}
	}

	void method515(final int i, final int i_199_, final int i_200_, final int i_202_, final int i_203_)
	{
		final int i_205_ = anIntArray214[i_199_];
		final int i_206_ = anIntArray208[i_199_];
		if (i_205_ == 0)
		{
			final int i_207_ = (i_206_ * 1280) + 255;
			gameGraphics.method329(i - -(i_202_ / 2), (i_206_ * 2) + 20, i_207_, (i_200_ / 2) + i_203_,
			        -(i_206_ * 5) + 255, (byte) 33);
		}
		if (i_205_ == 1)
		{
			final int i_208_ = (i_206_ * 1280) + 16711680;
			gameGraphics.method329((i_202_ / 2) + i, i_206_ + 10, i_208_, i_203_ - -(i_200_ / 2),
			        -(i_206_ * 5) + 255, (byte) 33);
		}
	}

	private void method516(final String[] strings, final int i, final boolean bool)
	{
		method578("", bool, i, strings);
	}

	private void method517(final boolean bool)
	{
		int i = gameGraphics.menuDefaultWidth + -248;
		gameGraphics.drawPicture(anInt935 + 1, 3, i);
		for (int i_212_ = 0; i_212_ < anInt973; i_212_++)
		{
			final int i_213_ = i - -((i_212_ % 5) * 49);
			final int i_214_ = ((i_212_ / 5) * 34) + 36;
			if ((inventoryCount <= i_212_) || (wearing[i_212_] != 1))
			{
				gameGraphics.method327(i_213_, i_214_, 49, 128, 108, Class34.method227(false, 181, 181, 181), 34);
			}
			else
			{
				gameGraphics.method327(i_213_, i_214_, 49, 128, 118, 16711680, 34);
			}
			if (inventoryCount > i_212_)
			{
				gameGraphics.method348(false, 0, -89, 32, i_214_, 48, 0,
				        (EntityHandler.itemdef_sprite[inventoryItems[i_212_]]) + anInt863,
				        (EntityHandler.itemdef_color[inventoryItems[i_212_]]), i_213_);
				if (EntityHandler.itemdef_isUnstackable[inventoryItems[i_212_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(inventoryItemsCount[i_212_]).toString(),
					        0, 1, 16776960, i_213_ + 1, i_214_ - -10);
				}
			}
		}
		for (int i_215_ = 1; i_215_ <= 4; i_215_++)
		{
			gameGraphics.method319(0, (anInt973 / 5) * 34, 36, i + (i_215_ * 49));
		}
		for (int i_216_ = 1; ((anInt973 / 5) + -1) >= i_216_; i_216_++)
		{
			gameGraphics.method341(245, (i_216_ * 34) + 36, i, 0);
		}
		if (bool)
		{
			i = 248 - (gameGraphics.menuDefaultWidth - this.mouseX);
			final int i_217_ = this.mouseY + -36;
			if ((i >= 0) && (i_217_ >= 0) && (i < 248) && (i_217_ < ((anInt973 / 5) * 34)))
			{
				final int i_218_ = (i / 49) - -((i_217_ / 34) * 5);
				if (inventoryCount > i_218_)
				{
					final int i_219_ = inventoryItems[i_218_];
					if (0 > anInt940)
					{
						if (0 > anInt989)
						{
							if (wearing[i_218_] != 1)
							{
								if (EntityHandler.itemdef_wearableId[i_219_] != 0)
								{
									String string;
									if ((0x18 & EntityHandler.itemdef_wearableId[i_219_]) != 0)
									{
										string = "Wield";
									}
									else
									{
										string = "Wear";
									}
									aClass29_1.method196(
									        string, 630, new StringBuilder().append("@lre@")
									                .append(EntityHandler.itemdef_name[i_219_]).toString(),
									        i_218_);
								}
							}
							else
							{
								aClass29_1.method196("Remove", 620, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_219_]).toString(), i_218_);
							}
							if (!EntityHandler.itemdef_command[i_219_].equals(""))
							{
								aClass29_1
								        .method196(EntityHandler.itemdef_command[i_219_], 640,
								                new StringBuilder().append("@lre@")
								                        .append(EntityHandler.itemdef_name[i_219_]).toString(),
								                i_218_);
							}
							aClass29_1.method196("Use", 650, new StringBuilder().append("@lre@")
							        .append(EntityHandler.itemdef_name[i_219_]).toString(), i_218_);
							aClass29_1.method196("Drop", 660, new StringBuilder().append("@lre@")
							        .append(EntityHandler.itemdef_name[i_219_]).toString(), i_218_);
							aClass29_1.method196("Examine", 3600, new StringBuilder().append("@lre@")
							        .append(EntityHandler.itemdef_name[i_219_]).toString(), i_219_);
						}
						else
						{
							aClass29_1.method195(
							        new StringBuilder().append("Use ").append(aString30).append(" with").toString(),
							        i_218_, new StringBuilder().append("@lre@").append(EntityHandler.itemdef_name[i_219_])
							                .toString(),
							        0, anInt989, 610);
						}
					}
					else if (EntityHandler.spelldef_type[anInt940] == 3)
					{
						aClass29_1.method195(
						        new StringBuilder().append("Cast ").append(EntityHandler.spelldef_name[anInt940])
						                .append(" on").toString(),
						        i_218_,
						        new StringBuilder().append("@lre@").append(EntityHandler.itemdef_name[i_219_]).toString(),
						        0, anInt940, 600);
					}
				}
			}
		}
	}

	private void drawOptionsMenu(final boolean flag)
	{
		int i_220_ = gameGraphics.menuDefaultWidth + -199;
		int i_221_ = 36;
		gameGraphics.drawPicture(anInt935 + 6, 3, i_220_ - 49);
		int i_222_ = 196;
		gameGraphics.method327(i_220_, 36, i_222_, 160, 100, Class34.method227(false, 181, 181, 181), 65);
		gameGraphics.method327(i_220_, 101, i_222_, 160, 86, Class34.method227(false, 201, 201, 201), 65);
		gameGraphics.method327(i_220_, 166, i_222_, 160, 85, Class34.method227(false, 181, 181, 181), 95);
		gameGraphics.method327(i_220_, 261, i_222_, 160, 125, Class34.method227(false, 201, 201, 201), !showSkipTutorial ? 40 : 55);
		int i_224_ = i_220_ + 3;
		int i_225_ = i_221_ + 15;
		gameGraphics.method324("Game options - click to toggle", 0, 1, 0, i_224_, i_225_);
		i_225_ += 15;
		if (!configAutoCameraAngle)
		{
			gameGraphics.method324("Camera angle mode - @red@Manual", 0, 1, 16777215, i_224_, i_225_);
		}
		else
		{
			gameGraphics.method324("Camera angle mode - @gre@Auto", 0, 1, 16777215, i_224_, i_225_);
		}
		i_225_ += 15;
		if (!configMouseButtons)
		{
			gameGraphics.method324("Mouse buttons - @gre@Two", 0, 1, 16777215, i_224_, i_225_);
		}
		else
		{
			gameGraphics.method324("Mouse buttons - @red@One", 0, 1, 16777215, i_224_, i_225_);
		}
		i_225_ += 15;
		if (isMembers)
		{
			if (configSoundEffects)
			{
				gameGraphics.method324("Sound effects - @red@off", 0, 1, 16777215, i_224_, i_225_);
			}
			else
			{
				gameGraphics.method324("Sound effects - @gre@on", 0, 1, 16777215, i_224_, i_225_);
			}
		}
		i_225_ += 15;
		gameGraphics.method324("To change your contact details,", 0, 0, 16777215, i_224_, i_225_);
		i_225_ += 15;
		gameGraphics.method324("password, recovery questions, etc..", 0, 0, 16777215, i_224_, i_225_);
		i_225_ += 15;
		gameGraphics.method324("please select 'account management'", 0, 0, 16777215, i_224_, i_225_);
		i_225_ += 15;
		if (param_referid != 0)
		{
			if (param_referid == 1)
			{
				gameGraphics.method324("from the link below the gamewindow", 0, 0, 16777215, i_224_, i_225_);
			}
			else
			{
				gameGraphics.method324("from the runescape front webpage", 0, 0, 16777215, i_224_, i_225_);
			}
		}
		else
		{
			gameGraphics.method324("from the runescape.com front page", 0, 0, 16777215, i_224_, i_225_);
		}
		i_225_ += 15;
		i_225_ += 5;
		gameGraphics.method324("Privacy settings. Will be applied to", 0, 1, 0, i_220_ + 3, i_225_);
		i_225_ += 15;
		gameGraphics.method324("all people not on your friends list", 0, 1, 0, i_220_ + 3, i_225_);
		i_225_ += 15;
		if (blockChatMessages == 0)
		{
			gameGraphics.method324("Block chat messages: @red@<off>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		else
		{
			gameGraphics.method324("Block chat messages: @gre@<on>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		i_225_ += 15;
		if (blockPrivateMessages == 0)
		{
			gameGraphics.method324("Block private messages: @red@<off>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		else
		{
			gameGraphics.method324("Block private messages: @gre@<on>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		i_225_ += 15;
		if (blockTradeRequests != 0)
		{
			gameGraphics.method324("Block trade requests: @gre@<on>", 0, 1, 16777215, i_220_ - -3, i_225_);
		}
		else
		{
			gameGraphics.method324("Block trade requests: @red@<off>", 0, 1, 16777215, i_220_ + 3, i_225_);
		}
		i_225_ += 15;
		if (isMembers)
		{
			if (blockDuelRequests == 0)
			{
				gameGraphics.method324("Block duel requests: @red@<off>", 0, 1, 16777215, i_220_ + 3, i_225_);
			}
			else
			{
				gameGraphics.method324("Block duel requests: @gre@<on>", 0, 1, 16777215, i_220_ + 3, i_225_);
			}
		}
		i_225_ += 15;
		if (showSkipTutorial)
		{
			int i_226_ = 16777215;
			i_225_ += 5;
			if ((this.mouseX > i_224_) && ((i_224_ - -i_222_) > this.mouseX) && ((i_225_ + -12) < this.mouseY)
			        && (this.mouseY < (i_225_ + 4)))
			{
				i_226_ = 16776960;
			}
			gameGraphics.method324("Skip the tutorial", 0, 1, i_226_, i_224_, i_225_);
			i_225_ += 15;
		}
		i_225_ += 5;
		gameGraphics.method324("Always logout when you finish", 0, 1, 0, i_224_, i_225_);
		int i_227_ = 16777215;
		i_225_ += 15;
		if ((this.mouseX > i_224_) && (this.mouseX < (i_222_ + i_224_)) && (this.mouseY > (i_225_ + -12))
		        && (this.mouseY < (i_225_ + 4)))
		{
			i_227_ = 16776960;
		}
		gameGraphics.method324("Click here to logout", 0, 1, i_227_, i_220_ + 3, i_225_);
		if (flag)
		{
			i_220_ = (this.mouseX + -gameGraphics.menuDefaultWidth + 199);
			i_221_ = this.mouseY + -36;
			if ((0 <= i_220_) && (i_221_ >= 0) && (196 > i_220_) && (i_221_ < 265))
			{
				final int i_228_ = gameGraphics.menuDefaultWidth - 199;
				final int i_229_ = 36;
				i_224_ = i_228_ + 3;
				i_222_ = 196;
				i_225_ = i_229_ + 30;
				if ((this.mouseX > i_224_) && ((i_222_ + i_224_) > this.mouseX) && (this.mouseY > (i_225_ - 12))
				        && (this.mouseY < (i_225_ + 4)) && (anInt887 == 1))
				{
					configAutoCameraAngle = !configAutoCameraAngle;
					streamClass.createPacket(111);
					streamClass.aClass27_Sub1_Sub1_1.put(0);
					streamClass.aClass27_Sub1_Sub1_1.put(!configAutoCameraAngle ? 0 : 1);
					streamClass.finishPacket();
				}
				i_225_ += 15;
				if ((i_224_ < this.mouseX) && (this.mouseX < (i_222_ + i_224_)) && (this.mouseY > (i_225_ - 12))
				        && ((i_225_ + 4) > this.mouseY) && (anInt887 == 1))
				{
					configMouseButtons = !configMouseButtons;
					streamClass.createPacket(111);
					streamClass.aClass27_Sub1_Sub1_1.put(2);
					streamClass.aClass27_Sub1_Sub1_1.put(configMouseButtons ? 1 : 0);
					streamClass.finishPacket();
				}
				i_225_ += 15;
				if (isMembers && (i_224_ < this.mouseX) && ((i_224_ - -i_222_) > this.mouseX)
				        && (this.mouseY > (i_225_ + -12)) && ((i_225_ + 4) > this.mouseY) && (anInt887 == 1))
				{
					configSoundEffects = !configSoundEffects;
					streamClass.createPacket(111);
					streamClass.aClass27_Sub1_Sub1_1.put(3);
					streamClass.aClass27_Sub1_Sub1_1.put(!configSoundEffects ? 0 : 1);
					streamClass.finishPacket();
				}
				i_225_ += 15;
				i_225_ += 15;
				i_225_ += 15;
				i_225_ += 15;
				i_225_ += 15;
				boolean bool_230_ = false;
				i_225_ += 35;
				if ((this.mouseX > i_224_) && (this.mouseX < (i_224_ + i_222_)) && (this.mouseY > (i_225_ + -12))
				        && ((i_225_ - -4) > this.mouseY) && (anInt887 == 1))
				{
					bool_230_ = true;
					blockChatMessages = 1 - blockChatMessages;
				}
				i_225_ += 15;
				if ((this.mouseX > i_224_) && ((i_224_ + i_222_) > this.mouseX) && (this.mouseY > (i_225_ + -12))
				        && ((i_225_ + 4) > this.mouseY) && (anInt887 == 1))
				{
					blockPrivateMessages = 1 - blockPrivateMessages;
					bool_230_ = true;
				}
				i_225_ += 15;
				if ((this.mouseX > i_224_) && ((i_224_ - -i_222_) > this.mouseX) && ((i_225_ - 12) < this.mouseY)
				        && (this.mouseY < (i_225_ - -4)) && (anInt887 == 1))
				{
					bool_230_ = true;
					blockTradeRequests = -blockTradeRequests + 1;
				}
				i_225_ += 15;
				if (isMembers && (this.mouseX > i_224_) && (this.mouseX < (i_222_ + i_224_))
				        && (this.mouseY > (i_225_ - 12)) && ((i_225_ + 4) > this.mouseY) && (anInt887 == 1))
				{
					blockDuelRequests = -blockDuelRequests + 1;
					bool_230_ = true;
				}
				i_225_ += 15;
				if (bool_230_)
				{
					method592(blockChatMessages, blockDuelRequests, blockPrivateMessages, blockTradeRequests);
				}
				if (showSkipTutorial)
				{
					i_225_ += 5;
					if ((this.mouseX > i_224_) && (this.mouseX < (i_222_ + i_224_))
					        && (this.mouseY > (i_225_ + -12)) && ((i_225_ + 4) > this.mouseY) && (anInt887 == 1))
					{
						method516(aStringArray43, 9, false);
						anInt939 = 0;
					}
					i_225_ += 15;
				}
				i_225_ += 20;
				if ((this.mouseX > i_224_) && (this.mouseX < (i_224_ - -i_222_)) && ((i_225_ + -12) < this.mouseY)
				        && ((i_225_ - -4) > this.mouseY) && (anInt887 == 1))
				{
					sendLogout();
				}
				anInt887 = 0;
			}
		}
	}

	private void method520()
	{
		characterDesignMenu.method85(this.mouseDownButton, this.mouseY, this.lastMouseDownButton, this.mouseX);
		if (characterDesignMenu.method81(anInt968))
		{
			do
			{
				anInt1047 = ((anInt1047 + -1) - -EntityHandler.animationdef_count) % EntityHandler.animationdef_count;
			}
			while (((EntityHandler.animationdef_genderModel[anInt1047] & 0x3) != 1)
			        || ((EntityHandler.animationdef_genderModel[anInt1047] & (anInt1028 * 4)) == 0));
		}
		if (characterDesignMenu.method81(anInt974))
		{
			do
			{
				anInt1047 = (anInt1047 + 1) % EntityHandler.animationdef_count;
			}
			while (((EntityHandler.animationdef_genderModel[anInt1047] & 0x3) != 1)
			        || (((anInt1028 * 4) & EntityHandler.animationdef_genderModel[anInt1047]) == 0));
		}
		if (characterDesignMenu.method81(anInt991))
		{
			anInt999 = ((characterHairColors.length + anInt999) - 1) % characterHairColors.length;
		}
		if (characterDesignMenu.method81(anInt954))
		{
			anInt999 = (anInt999 + 1) % characterHairColors.length;
		}
		if (characterDesignMenu.method81(anInt996) || characterDesignMenu.method81(anInt956))
		{
			for (anInt1028 = -anInt1028 + 3; (((EntityHandler.animationdef_genderModel[anInt1047] & 0x3) != 1)
			        || ((EntityHandler.animationdef_genderModel[anInt1047] & (anInt1028 * 4)) == 0)); anInt1047 = (anInt1047 + 1)
			                % EntityHandler.animationdef_count)
			{
				/* empty */
			}
			for (/**/; (((0x3 & EntityHandler.animationdef_genderModel[anInt962]) != 2)
			        || (((anInt1028 * 4) & EntityHandler.animationdef_genderModel[anInt962]) == 0)); anInt962 = (anInt962 + 1)
			                % EntityHandler.animationdef_count)
			{
				/* empty */
			}
		}
		if (characterDesignMenu.method81(anInt969))
		{
			anInt1057 = (((anInt1057 - -characterTopBottomColors.length) + -1) % characterTopBottomColors.length);
		}
		if (characterDesignMenu.method81(anInt945))
		{
			anInt1057 = (anInt1057 + 1) % characterTopBottomColors.length;
		}
		if (characterDesignMenu.method81(anInt1020))
		{
			anInt961 = (((anInt961 + -1) - -characterSkinColors.length) % characterSkinColors.length);
		}
		if (characterDesignMenu.method81(anInt966))
		{
			anInt961 = (anInt961 + 1) % characterSkinColors.length;
		}
		if (characterDesignMenu.method81(anInt947))
		{
			anInt965 = ((characterTopBottomColors.length + (anInt965 - 1)) % characterTopBottomColors.length);
		}
		if (characterDesignMenu.method81(anInt1044))
		{
			anInt965 = (anInt965 + 1) % characterTopBottomColors.length;
		}
		if (characterDesignMenu.method81(anInt1029))
		{
			streamClass.createPacket(Constants.CPacketID_RequestNewAppearance);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt1028);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt1047);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt962);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt948);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt999);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt1057);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt965);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt961);
			streamClass.finishPacket();
			gameGraphics.method331();
			showCharacterLookScreen = false;
		}
	}

	private void drawGameWindowsMenus()
	{
		boolean bool = false;
		if (logoutTimeout == 0)
		{
			if (!showWelcomeBox)
			{
				if (showServerMessageBox)
				{
					drawServerMessageBox(-1);
				}
				else if (wildernessType == 1)
				{
					drawWildernessWarningBox();
				}
				else if (!aBool81 || (combatTimeout != 0))
				{
					if (showShop && (combatTimeout == 0))
					{
						method546();
					}
					else if (aBool89)
					{
						method543();
					}
					else if (!aBool84)
					{
						if (aBool92)
						{
							method579(-14534);
						}
						else if (aBool72)
						{
							method555();
						}
						else if (anInt994 != 1)
						{
							if (anInt994 != 2)
							{
								if (inputBoxType == 0)
								{
									bool = true;
								}
								else
								{
									drawInputBox();
								}
							}
							else
							{
								method588(15);
							}
						}
						else
						{
							method499(-3645);
						}
					}
					else
					{
						method528(1);
					}
				}
				else
				{
					method567(1);
				}
			}
			else
			{
				drawWelcomeBox(1);
			}
		}
		else
		{
			drawLoggingOutBox(137);
		}
		if (anInt971 != 0)
		{
			method535(-72);
		}
		if (bool)
		{
			if (aBool70)
			{
				method562(8409088);
			}
			if ((ourPlayer.currentSprite == 8) || (ourPlayer.currentSprite == 9))
			{
				method595((byte) -2);
			}
			method596();
			final boolean bool_241_ = !aBool70 && !aBool61;
			if (bool_241_)
			{
				aClass29_1.method190();
			}
			if ((anInt939 == 0) && bool_241_)
			{
				method514(10000);
			}
			if (anInt939 == 1)
			{
				method517(bool_241_);
			}
			if (anInt939 == 2)
			{
				method577(bool_241_, -20183);
			}
			if (anInt939 == 3)
			{
				method556(false, bool_241_);
			}
			if (anInt939 == 4)
			{
				method594(2, bool_241_);
			}
			if (anInt939 == 5)
			{
				drawFriendsWindow((byte) -103, bool_241_);
			}
			if (anInt939 == 6)
			{
				drawOptionsMenu(bool_241_);
			}
			if (!aBool61 && !aBool70)
			{
				method590(0);
			}
			if (aBool61 && !aBool70)
			{
				method534(16508);
			}
		}
		anInt887 = 0;
	}

	private void method523(final int i, final int i_243_, final int i_244_)
	{
		final int i_245_ = anIntArray180[i_243_];
		final int i_246_ = 0 <= i ? i : anInt1036;
		if (EntityHandler.itemdef_isUnstackable[i_245_] != 0)
		{
			int i_247_ = 0;
			for (int i_248_ = 0; (i_248_ < anInt1049) && (i_246_ > i_247_); i_248_++)
			{
				if (i_245_ == anIntArray180[i_248_])
				{
					anInt1049--;
					i_247_++;
					for (int i_249_ = i_248_; anInt1049 > i_249_; i_249_++)
					{
						anIntArray180[i_249_] = anIntArray180[i_249_ + 1];
						anIntArray164[i_249_] = anIntArray164[i_249_ - -1];
					}
					i_248_--;
				}
			}
		}
		else
		{
			anIntArray164[i_243_] -= i_246_;
			if (anIntArray164[i_243_] <= 0)
			{
				anInt1049--;
				for (int i_250_ = i_243_; anInt1049 > i_250_; i_250_++)
				{
					anIntArray180[i_250_] = anIntArray180[i_250_ + 1];
					anIntArray164[i_250_] = anIntArray164[i_250_ + 1];
				}
			}
		}
		streamClass.createPacket(46);
		streamClass.aClass27_Sub1_Sub1_1.put(anInt1049);
		int i_251_ = 0;
		if (i_244_ != 348)
		{
			drawInputBox();
		}
		for (/**/; anInt1049 > i_251_; i_251_++)
		{
			streamClass.aClass27_Sub1_Sub1_1.putShort(anIntArray180[i_251_]);
			streamClass.aClass27_Sub1_Sub1_1.putInt(anIntArray164[i_251_]);
		}
		streamClass.finishPacket();
		aBool67 = false;
		aBool68 = false;
	}

	private void method524(final int i, final int i_252_, final int i_253_)
	{
		boolean bool = false;
		int i_254_ = 0;
		final int i_255_ = inventoryItems[i_252_];
		for (int i_256_ = i; i_256_ < anInt1061; i_256_++)
		{
			if (i_255_ == anIntArray182[i_256_])
			{
				if (EntityHandler.itemdef_isUnstackable[i_255_] == 0)
				{
					if (i_253_ < 0)
					{
						for (int i_257_ = 0; i_257_ < anInt1036; i_257_++)
						{
							bool = true;
							if (inventoryItemsCount[i_252_] > anIntArray198[i_256_])
							{
								anIntArray198[i_256_]++;
							}
						}
					}
					else
					{
						anIntArray198[i_256_] += i_253_;
						if (anIntArray198[i_256_] > inventoryItemsCount[i_252_])
						{
							anIntArray198[i_256_] = inventoryItemsCount[i_252_];
						}
						bool = true;
					}
				}
				else
				{
					i_254_++;
				}
			}
		}
		final int i_258_ = inventoryCount(i_255_);
		if (i_258_ <= i_254_)
		{
			bool = true;
		}
		if (EntityHandler.itemdef_isQuest[i_255_] == 1)
		{
			displayMessage(0, "This object cannot be added to a duel offer", 0, null, -100, null, null, false);
			bool = true;
		}
		if (!bool)
		{
			if (0 > i_253_)
			{
				if (8 > anInt1061)
				{
					anIntArray182[anInt1061] = i_255_;
					anIntArray198[anInt1061] = 1;
					bool = true;
					anInt1061++;
				}
			}
			else
			{
				for (int i_259_ = 0; (i_259_ < i_253_) && (8 > anInt1061) && (i_254_ < i_258_); i_259_++)
				{
					anIntArray182[anInt1061] = i_255_;
					anIntArray198[anInt1061] = 1;
					bool = true;
					i_254_++;
					anInt1061++;
					if ((i_259_ == 0) && (EntityHandler.itemdef_isUnstackable[i_255_] == 0))
					{
						anIntArray198[anInt1061 + -1] = (inventoryItemsCount[i_252_] >= i_253_ ? i_253_
						        : inventoryItemsCount[i_252_]);
						break;
					}
				}
			}
		}
		if (bool)
		{
			streamClass.createPacket(33);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt1061);
			for (int i_260_ = 0; i_260_ < anInt1061; i_260_++)
			{
				streamClass.aClass27_Sub1_Sub1_1.putShort(anIntArray182[i_260_]);
				streamClass.aClass27_Sub1_Sub1_1.putInt(anIntArray198[i_260_]);
			}
			streamClass.finishPacket();
			aBool75 = false;
			aBool59 = false;
		}
	}

	private void method525(final byte i)
	{
		if (i == -73)
		{
			for (int i_261_ = 0; i_261_ < anInt978; i_261_++)
			{
				final int i_262_ = gameGraphics.method315(1);
				final int i_263_ = anIntArray195[i_261_];
				int i_264_ = anIntArray203[i_261_];
				final int i_265_ = anIntArray158[i_261_];
				final int i_266_ = anIntArray187[i_261_];
				boolean bool = true;
				while (bool)
				{
					bool = false;
					for (int i_267_ = 0; i_261_ > i_267_; i_267_++)
					{
						if (((i_264_ + i_266_) > (-i_262_ + anIntArray203[i_267_]))
						        && ((-i_262_ + i_264_) < (anIntArray203[i_267_] + anIntArray187[i_267_]))
						        && ((anIntArray158[i_267_] + anIntArray195[i_267_]) > (-i_265_ + i_263_))
						        && ((-anIntArray158[i_267_] + anIntArray195[i_267_]) < (i_265_ + i_263_))
						        && ((-i_262_ + (anIntArray203[i_267_] - i_266_)) < i_264_))
						{
							bool = true;
							i_264_ = anIntArray203[i_267_] - i_262_ - i_266_;
						}
					}
				}
				anIntArray203[i_261_] = i_264_;
				gameGraphics.method333(i_264_, 300, 1, 16776960, aStringArray47[i_261_], i_263_, false);
			}
			for (int i_268_ = 0; i_268_ < anInt960; i_268_++)
			{
				final int i_269_ = anIntArray217[i_268_];
				final int i_270_ = anIntArray218[i_268_];
				final int i_271_ = anIntArray169[i_268_];
				final int i_272_ = anIntArray213[i_268_];
				final int i_273_ = (i_271_ * 39) / 100;
				final int i_274_ = (i_271_ * 27) / 100;
				final int i_275_ = -i_274_ + i_270_;
				gameGraphics.method311(i_269_ - (i_273_ / 2), i_273_, i_274_, 85, anInt935 + 9, i_275_);
				final int i_276_ = (i_271_ * 36) / 100;
				final int i_277_ = (i_271_ * 24) / 100;
				gameGraphics.method348(false, 0, i + -34, i_277_, (i_274_ / 2) + i_275_ + -(i_277_ / 2), i_276_, 0,
				        (EntityHandler.itemdef_sprite[i_272_] + anInt863), EntityHandler.itemdef_color[i_272_],
				        i_269_ + -(i_276_ / 2));
			}
			for (int i_278_ = 0; i_278_ < anInt977; i_278_++)
			{
				final int i_279_ = anIntArray216[i_278_];
				final int i_280_ = anIntArray173[i_278_];
				final int i_281_ = anIntArray202[i_278_];
				gameGraphics.method327(i_279_ + -15, i_280_ - 3, i_281_, 192, i ^ ~0x28, 65280, 5);
				gameGraphics.method327(i_279_ + i_281_ + -15, i_280_ + -3, -i_281_ + 30, 192, 111, 16711680, 5);
			}
		}
	}

	private boolean hasRequiredRunes(final int i, final int i_283_)
	{
		if ((i_283_ != 31)
		        || (!isWearing(197) && !isWearing(615) && !isWearing(682)))
		{
			if ((i_283_ != 32)
			        || (!isWearing(102) && !isWearing(616) && !isWearing(683)))
			{
				if ((i_283_ != 33)
				        || (!isWearing(101) && !isWearing(617) && !isWearing(684)))
				{
					if ((i_283_ == 34) && (isWearing(103) || isWearing(618)
					        || isWearing(685)))
					{
						return true;
					}
				}
				else
				{
					return true;
				}
			}
			else
			{
				return true;
			}
		}
		else
		{
			return true;
		}
		if (inventoryCount(i_283_) >= i)
		{
			return true;
		}
		return false;
	}

	private void drawInputBox()
	{
		if (anInt887 != 0)
		{
			anInt887 = 0;
			if ((inputBoxType == 1) && ((this.mouseX < 106) || (this.mouseY < 145) || (406 < this.mouseX)
			        || (215 < this.mouseY)))
			{
				inputBoxType = 0;
				return;
			}
			if ((inputBoxType == 2)
			        && ((this.mouseX < 6) || (145 > this.mouseY) || (506 < this.mouseX) || (215 < this.mouseY)))
			{
				inputBoxType = 0;
				return;
			}
			if ((inputBoxType == 3) && ((this.mouseX < 106) || (145 > this.mouseY) || (406 < this.mouseX)
			        || (215 < this.mouseY)))
			{
				inputBoxType = 0;
				return;
			}
			if ((236 < this.mouseX) && (this.mouseX < 276) && (193 < this.mouseY) && (213 > this.mouseY))
			{
				inputBoxType = 0;
				return;
			}
		}
		int i = 145;
		if (inputBoxType == 1)
		{
			gameGraphics.method321(i, 0, 70, 300, 106, 1);
			gameGraphics.method362(70, 106, 300, 16777215, i);
			i += 20;
			gameGraphics.drawText(16777215, 255, 4, "Enter name to add to friends list", i, 256);
			i += 20;
			gameGraphics.drawText(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(), i, 256);
			final String string = Class43.method298(ourPlayer.maybe_accountName);
			if ((string != null) && (0 < this.aString26.length()))
			{
				final String string_284_ = this.aString26.trim();
				inputBoxType = 0;
				this.aString26 = "";
				this.aString27 = "";
				if ((0 < string_284_.length()) && !string.equals(Class43.method298(string_284_)))
				{
					addToFriendsList(string_284_);
				}
			}
		}
		if (inputBoxType == 2)
		{
			gameGraphics.method321(i, 0, 70, 500, 6, 1);
			gameGraphics.method362(70, 6, 500, 16777215, i);
			i += 20;
			gameGraphics.drawText(16777215, 255, 4,
			        new StringBuilder().append("Enter message to send to ").append(privateMessageTarget).toString(), i, 256);
			i += 20;
			gameGraphics.drawText(16777215, 255, 4,
			        new StringBuilder().append(this.inputMessage).append("*").toString(), i, 256);
			if (this.enteredMessage.length() > 0)
			{
				final String string = this.enteredMessage;
				this.inputMessage = "";
				inputBoxType = 0;
				this.enteredMessage = "";
				sendPrivateMessage(string, privateMessageTarget);
			}
		}
		if (inputBoxType == 3)
		{
			gameGraphics.method321(i, 0, 70, 300, 106, 1);
			gameGraphics.method362(70, 106, 300, 16777215, i);
			i += 20;
			gameGraphics.drawText(16777215, 255, 4, "Enter name to add to ignore list", i, 256);
			i += 20;
			gameGraphics.drawText(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(), i, 256);
			final String string = Class43.method298(ourPlayer.maybe_accountName);
			if ((string != null) && (this.aString26.length() > 0))
			{
				final String string_285_ = this.aString26.trim();
				inputBoxType = 0;
				this.aString26 = "";
				this.aString27 = "";
				if ((string_285_.length() > 0) && !string.equals(Class43.method298(string_285_)))
				{
					method502(string_285_, -101);
				}
			}
		}
		int i_286_ = 16777215;
		if ((236 < this.mouseX) && (this.mouseX < 276) && (this.mouseY > 193) && (213 > this.mouseY))
		{
			i_286_ = 16776960;
		}
		gameGraphics.drawText(i_286_, 255, 1, "Cancel", 208, 256);
	}

	private void method528(final int i)
	{
		int i_287_ = -1;
		if ((anInt887 != 0) && aBool87)
		{
			i_287_ = aClass29_2.method197(this.mouseX, this.mouseY, anInt1058, anInt944);
		}
		if (i_287_ < 0)
		{
			if (anInt971 == 0)
			{
				if ((anInt887 == 1) && (anInt1036 == 0))
				{
					anInt1036 = 1;
				}
				final int i_288_ = this.mouseX + -22;
				final int i_289_ = this.mouseY + -36;
				if ((i_288_ >= 0) && (i_289_ >= 0) && (i_288_ < 468) && (i_289_ < 262))
				{
					if (anInt1036 > 0)
					{
						if ((i_288_ > 216) && (30 < i_289_) && (i_288_ < 462) && (i_289_ < 235))
						{
							final int i_290_ = (((i_288_ - 217) / 49) + (((i_289_ + -31) / 34) * 5));
							if ((0 <= i_290_) && (inventoryCount > i_290_))
							{
								method503(-1, i_290_, 2);
							}
						}
						if ((i_288_ > 8) && (30 < i_289_) && (i_288_ < 205) && (i_289_ < 133))
						{
							final int i_291_ = ((i_288_ + -9) / 49) + (((i_289_ + -31) / 34) * 4);
							if ((0 <= i_291_) && (anInt1049 > i_291_))
							{
								method523(-1, i_291_, 348);
							}
						}
						if ((217 <= i_288_) && (i_289_ >= 238) && (i_288_ <= 286) && (259 >= i_289_))
						{
							aBool68 = true;
							streamClass.createPacket(55);
							streamClass.finishPacket();
						}
						if ((394 <= i_288_) && (238 <= i_289_) && (i_288_ < 463) && (i_289_ < 259))
						{
							aBool84 = false;
							streamClass.createPacket(230);
							streamClass.finishPacket();
						}
						anInt1036 = 0;
						anInt887 = 0;
					}
					if (anInt887 == 2)
					{
						if ((216 < i_288_) && (i_289_ > 30) && (462 > i_288_) && (235 > i_289_))
						{
							final int i_292_ = aClass29_1.method207();
							final int i_293_ = aClass29_1.method210(i + -1);
							anInt955 = this.mouseX + -(i_292_ / 2);
							anInt984 = this.mouseY + -7;
							aBool61 = true;
							if (anInt984 < 0)
							{
								anInt984 = 0;
							}
							if (anInt955 < 0)
							{
								anInt955 = 0;
							}
							if (510 < (i_292_ + anInt955))
							{
								anInt955 = -i_292_ + 510;
							}
							if ((anInt984 - -i_293_) > 315)
							{
								anInt984 = -i_293_ + 315;
							}
							final int i_294_ = (((i_288_ + -217) / 49) + (((i_289_ + -31) / 34) * 5));
							if ((i_294_ >= 0) && (inventoryCount > i_294_))
							{
								final int i_295_ = inventoryItems[i_294_];
								aBool87 = true;
								aClass29_2.method190();
								aClass29_2.method195("Offer 1", i_295_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_295_]).toString(), 0, 1, 1);
								aClass29_2.method195("Offer 5", i_295_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_295_]).toString(), 0, 5, 1);
								aClass29_2.method195("Offer 10", i_295_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_295_]).toString(), 0, 10, 1);
								aClass29_2.method195("Offer All", i_295_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_295_]).toString(), i ^ 0x1, -1, 1);
								aClass29_2.method195("Offer X", i_295_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_295_]).toString(), 0, -2, 1);
								final int i_296_ = aClass29_2.method207();
								final int i_297_ = aClass29_2.method210(0);
								anInt1058 = this.mouseY + -7;
								anInt944 = this.mouseX + -(i_296_ / 2);
								if (anInt1058 < 0)
								{
									anInt1058 = 0;
								}
								if (anInt944 < 0)
								{
									anInt944 = 0;
								}
								if (510 < (i_296_ + anInt944))
								{
									anInt944 = -i_296_ + 510;
								}
								if ((anInt1058 - -i_297_) > 315)
								{
									anInt1058 = 315 - i_297_;
								}
							}
						}
						if ((i_288_ > 8) && (30 < i_289_) && (i_288_ < 205) && (133 > i_289_))
						{
							final int i_298_ = (((i_288_ + -9) / 49) - -(((i_289_ - 31) / 34) * 4));
							if ((i_298_ >= 0) && (anInt1049 > i_298_))
							{
								final int i_299_ = anIntArray180[i_298_];
								aBool87 = true;
								aClass29_2.method190();
								aClass29_2.method195("Remove 1", i_299_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_299_]).toString(), 0, 1, 2);
								aClass29_2.method195("Remove 5", i_299_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_299_]).toString(), 0, 5, 2);
								aClass29_2.method195("Remove 10", i_299_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_299_]).toString(), 0, 10, 2);
								aClass29_2.method195("Remove All", i_299_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_299_]).toString(), 0, -1, 2);
								aClass29_2.method195("Remove X", i_299_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_299_]).toString(), 0, -2, 2);
								final int i_300_ = aClass29_2.method207();
								final int i_301_ = aClass29_2.method210(0);
								anInt944 = this.mouseX - (i_300_ / 2);
								anInt1058 = this.mouseY - 7;
								if (anInt1058 < 0)
								{
									anInt1058 = 0;
								}
								if (0 > anInt944)
								{
									anInt944 = 0;
								}
								if (315 < (i_301_ + anInt1058))
								{
									anInt1058 = -i_301_ + 315;
								}
								if (510 < (i_300_ + anInt944))
								{
									anInt944 = -i_300_ + 510;
								}
							}
						}
						anInt887 = 0;
					}
					if (aBool87)
					{
						final int i_302_ = aClass29_2.method207();
						final int i_303_ = aClass29_2.method210(0);
						if ((this.mouseX < (anInt944 + -10)) || (this.mouseY < (anInt1058 - 10))
						        || (this.mouseX > (i_302_ + anInt944 + 10))
						        || (this.mouseY > ((anInt1058 - -i_303_) + 10)))
						{
							aBool87 = false;
						}
					}
				}
				else if (anInt887 != 0)
				{
					aBool84 = false;
					streamClass.createPacket(230);
					streamClass.finishPacket();
				}
			}
		}
		else
		{
			anInt887 = 0;
			aBool87 = false;
			final int i_304_ = aClass29_2.method203(0, i_287_);
			final int i_305_ = aClass29_2.method214(i_287_);
			int i_306_ = -1;
			int i_307_ = 0;
			if (i_304_ == 1)
			{
				for (int i_308_ = 0; inventoryCount > i_308_; i_308_++)
				{
					if (i_305_ == inventoryItems[i_308_])
					{
						if (i_306_ < 0)
						{
							i_306_ = i_308_;
						}
						if (EntityHandler.itemdef_isUnstackable[i_305_] == 0)
						{
							i_307_ = inventoryItemsCount[i_308_];
							break;
						}
						i_307_++;
					}
				}
			}
			else
			{
				for (int i_309_ = 0; i_309_ < anInt1049; i_309_++)
				{
					if (i_305_ == anIntArray180[i_309_])
					{
						if (0 > i_306_)
						{
							i_306_ = i_309_;
						}
						if (EntityHandler.itemdef_isUnstackable[i_305_] == 0)
						{
							i_307_ = anIntArray164[i_309_];
							break;
						}
						i_307_++;
					}
				}
			}
			if (i_306_ >= 0)
			{
				int i_310_ = aClass29_2.method186(i_287_);
				if (i_310_ == -2)
				{
					anInt980 = i_306_;
					if (i_304_ == 1)
					{
						method516(AClass1_Sub1.aStringArray38, 1, true);
					}
					else
					{
						method516(PacketConstruction.aStringArray14, 2, true);
					}
				}
				else
				{
					if (i_310_ == -1)
					{
						i_310_ = i_307_;
					}
					if (i_304_ == 1)
					{
						method503(i_310_, i_306_, 2);
					}
					else
					{
						method523(i_310_, i_306_, i ^ 0x15d);
					}
				}
			}
		}
		if (aBool84)
		{
			final int i_311_ = 22;
			final int i_312_ = 36;
			gameGraphics.method321(i_312_, 192, 12, 468, i_311_, 1);
			final int i_313_ = 10000536;
			gameGraphics.method327(i_311_, i_312_ + 12, 468, 160, i + 85, i_313_, 18);
			gameGraphics.method327(i_311_, i_312_ + 30, 8, 160, 73, i_313_, 248);
			gameGraphics.method327(i_311_ - -205, i_312_ + 30, 11, 160, i + 73, i_313_, 248);
			gameGraphics.method327(i_311_ - -462, i_312_ + 30, 6, 160, 114, i_313_, 248);
			gameGraphics.method327(i_311_ + 8, i_312_ - -133, 197, 160, 84, i_313_, 22);
			gameGraphics.method327(i_311_ - -8, i_312_ + 258, 197, 160, i ^ 0x5a, i_313_, 20);
			gameGraphics.method327(i_311_ - -216, i_312_ + 235, 246, 160, 103, i_313_, 43);
			final int i_314_ = 13684944;
			gameGraphics.method327(i_311_ + 8, i_312_ - -30, 197, 160, i + 122, i_314_, 103);
			gameGraphics.method327(i_311_ + 8, i_312_ + 155, 197, 160, 121, i_314_, 103);
			gameGraphics.method327(i_311_ + 216, i_312_ + 30, 246, 160, 73, i_314_, 205);
			for (int i_315_ = 0; 4 > i_315_; i_315_++)
			{
				gameGraphics.method341(197, (i_312_ - -(i_315_ * 34)) + 30, i_311_ + 8, 0);
			}
			for (int i_316_ = 0; i_316_ < 4; i_316_++)
			{
				gameGraphics.method341(197, i_312_ + (i_316_ * 34) + 155, i_311_ - -8, 0);
			}
			for (int i_317_ = 0; i_317_ < 7; i_317_++)
			{
				gameGraphics.method341(246, i_312_ + (i_317_ * 34) + 30, i_311_ - -216, 0);
			}
			for (int i_318_ = 0; i_318_ < 6; i_318_++)
			{
				if (i_318_ < 5)
				{
					gameGraphics.method319(0, 103, i_312_ - -30, (i_311_ + 8) - -(i_318_ * 49));
				}
				if (i_318_ < 5)
				{
					gameGraphics.method319(0, 103, i_312_ + 155, i_311_ - (-(i_318_ * 49) + -8));
				}
				gameGraphics.method319(0, 205, i_312_ + 30, (i_311_ + 216) - -(i_318_ * 49));
			}
			gameGraphics.method324(new StringBuilder().append("Trading with: ").append(aString40).toString(), 0, 1,
			        16777215, i_311_ + i, i_312_ - -10);
			gameGraphics.method324("Your Offer", i ^ 0x1, 4, 16777215, i_311_ + 9, i_312_ + 27);
			gameGraphics.method324("Opponent's Offer", 0, 4, 16777215, i_311_ - -9, i_312_ - -152);
			gameGraphics.method324("Your Inventory", 0, 4, 16777215, i_311_ + 216, i_312_ - -27);
			if (!aBool68)
			{
				gameGraphics.drawPicture(anInt935 + 25, i_312_ + 238, i_311_ + 217);
			}
			gameGraphics.drawPicture(anInt935 + 26, i_312_ + 238, i_311_ + 394);
			if (aBool67)
			{
				gameGraphics.drawText(16777215, 255, 1, "Other player", i_312_ + 246, i_311_ + 341);
				gameGraphics.drawText(16777215, 255, 1, "has accepted", i_312_ + 256, i_311_ - -341);
			}
			if (aBool68)
			{
				gameGraphics.drawText(16777215, 255, 1, "Waiting for", i_312_ - -246, (i_311_ + 35) - -217);
				gameGraphics.drawText(16777215, 255, 1, "other player", i_312_ + 256, i_311_ + 217 + 35);
			}
			for (int i_319_ = 0; i_319_ < inventoryCount; i_319_++)
			{
				final int i_320_ = i_311_ + ((i_319_ % 5) * 49) + 217;
				final int i_321_ = i_312_ + ((i_319_ / 5) * 34) + 31;
				gameGraphics.method348(false, 0, -101, 32, i_321_, 48, 0,
				        (anInt863 - -(EntityHandler.itemdef_sprite[inventoryItems[i_319_]])),
				        (EntityHandler.itemdef_color[inventoryItems[i_319_]]), i_320_);
				if (EntityHandler.itemdef_isUnstackable[inventoryItems[i_319_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(inventoryItemsCount[i_319_]).toString(),
					        0, 1, 16776960, i_320_ + 1, i_321_ + 10);
				}
			}
			for (int i_322_ = 0; anInt1049 > i_322_; i_322_++)
			{
				final int i_323_ = (i_311_ - -((i_322_ % 4) * 49)) + 9;
				final int i_324_ = (i_312_ - -((i_322_ / 4) * 34)) + 31;
				gameGraphics.method348(false, 0, i + -85, 32, i_324_, 48, 0,
				        (EntityHandler.itemdef_sprite[anIntArray180[i_322_]]) + anInt863,
				        (EntityHandler.itemdef_color[anIntArray180[i_322_]]), i_323_);
				if (EntityHandler.itemdef_isUnstackable[anIntArray180[i_322_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(anIntArray164[i_322_]).toString(),
					        0, 1, 16776960, i_323_ + 1, i_324_ - -10);
				}
				if ((i_323_ < this.mouseX) && ((i_323_ + 48) > this.mouseX) && (this.mouseY > i_324_)
				        && (this.mouseY < (i_324_ + 32)))
				{
					gameGraphics.method324(
					        new StringBuilder().append(EntityHandler.itemdef_name[anIntArray180[i_322_]]).append(": @whi@")
					                .append(EntityHandler.itemdef_description[anIntArray180[i_322_]]).toString(),
					        0, 1, 16776960, i_311_ + 8, i_312_ - -273);
				}
			}
			for (int i_325_ = 0; i_325_ < anInt1026; i_325_++)
			{
				final int i_326_ = (9 - -i_311_) + ((i_325_ % 4) * 49);
				final int i_327_ = i_312_ + ((i_325_ / 4) * 34) + 156;
				gameGraphics.method348(false, 0, -65, 32, i_327_, 48, 0,
				        (EntityHandler.itemdef_sprite[anIntArray181[i_325_]]) + anInt863,
				        (EntityHandler.itemdef_color[anIntArray181[i_325_]]), i_326_);
				if (EntityHandler.itemdef_isUnstackable[anIntArray181[i_325_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(anIntArray209[i_325_]).toString(),
					        i ^ 0x1, 1, 16776960, i_326_ + 1, i_327_ - -10);
				}
				if ((this.mouseX > i_326_) && ((i_326_ + 48) > this.mouseX) && (this.mouseY > i_327_)
				        && (this.mouseY < (i_327_ + 32)))
				{
					gameGraphics.method324(
					        new StringBuilder().append(EntityHandler.itemdef_name[anIntArray181[i_325_]]).append(": @whi@")
					                .append(EntityHandler.itemdef_description[anIntArray181[i_325_]]).toString(),
					        0, 1, 16776960, i_311_ + 8, i_312_ - -273);
				}
			}
			if (aBool87)
			{
				aClass29_2.method204(anInt944, anInt1058, this.mouseX, this.mouseY);
			}
		}
	}

	@Override
	protected final void resetIntVars()
	{
		loggedIn = 0;
		maybe_loginScreenNumber = 0;
		logoutTimeout = 0;
		systemUpdate = 0;
	}

	void drawGroundItem(final int i, final int i_328_, final int i_329_, final int i_330_, final int i_331_,
	        final int i_332_)
	{
		final int i_333_ = EntityHandler.itemdef_sprite[i_328_] + anInt863;
		final int i_334_ = EntityHandler.itemdef_color[i_328_];
		gameGraphics.method348(false, 0, -90, i_329_, i_330_, i_332_, 0, i_333_, i_334_, i_331_);
	}

	private void method531(final int i)
	{
		final int i_335_ = 0;
		final int i_336_ = 50;
		final int i_337_ = 50;
		engineHandle.method11((i_336_ * 48) + 23, i_335_, (i_337_ * 48) - -23);
		engineHandle.method29(modelCache);
		int i_338_ = 9728;
		int i_339_ = 1100;
		int i_340_ = 6400;
		gameCamera.anInt465 = 1;
		gameCamera.anInt426 = 4000;
		gameCamera.anInt464 = 4100;
		gameCamera.anInt437 = 4100;
		int i_341_ = 888;
		gameCamera.setCamera(-engineHandle.getAveragedElevation(i_340_, i_338_), i_338_, i_341_, 912, i_340_, i_339_ * 2, 0);
		gameCamera.finishCamera();
		gameGraphics.method343(i ^ ~0x4a678d54);
		gameGraphics.method343(-1248297852);
		gameGraphics.method321(0, 0, 6, 512, 0, 1);
		for (int i_342_ = 6; i_342_ >= 1; i_342_--)
		{
			gameGraphics.method325(512, 0, i_342_, 0, i_342_, 8);
		}
		gameGraphics.method321(194, 0, 20, 512, 0, 1);
		for (int i_343_ = 6; 1 <= i_343_; i_343_--)
		{
			gameGraphics.method325(512, 0, i_343_, 0, 194 - i_343_, 8);
		}
		gameGraphics.drawPicture(anInt935 + 10, 15, 15);
		gameGraphics.method353(0, 200, 0, 512, anInt893);
		gameGraphics.method306(anInt893);
		i_339_ = 1100;
		i_341_ = 888;
		i_338_ = 9216;
		i_340_ = 9216;
		gameCamera.anInt437 = 4100;
		gameCamera.anInt426 = 4000;
		gameCamera.anInt465 = 1;
		gameCamera.anInt464 = 4100;
		gameCamera.setCamera(-engineHandle.getAveragedElevation(i_340_, i_338_), i_338_, i_341_, 912, i_340_, i_339_ * 2, 0);
		gameCamera.finishCamera();
		gameGraphics.method343(i ^ ~0x4a678d54);
		gameGraphics.method343(-1248297852);
		gameGraphics.method321(0, 0, 6, 512, 0, 1);
		for (int i_344_ = 6; 1 <= i_344_; i_344_--)
		{
			gameGraphics.method325(512, 0, i_344_, 0, i_344_, 8);
		}
		gameGraphics.method321(194, 0, 20, 512, 0, 1);
		for (int i_345_ = 6; i_345_ >= 1; i_345_--)
		{
			gameGraphics.method325(512, 0, i_345_, 0, -i_345_ + 194, 8);
		}
		gameGraphics.drawPicture(anInt935 + 10, 15, 15);
		gameGraphics.method353(0, 200, 0, 512, anInt893 + 1);
		gameGraphics.method306(anInt893 + 1);
		i_340_ = 10368;
		i_338_ = 11136;
		for (int i_346_ = 0; i_346_ < 64; i_346_++)
		{
			gameCamera.removeModel((engineHandle.aClass23ArrayArray2[0][i_346_]));
			gameCamera.removeModel((engineHandle.aClass23ArrayArray1[1][i_346_]));
			gameCamera.removeModel((engineHandle.aClass23ArrayArray2[1][i_346_]));
			gameCamera.removeModel((engineHandle.aClass23ArrayArray1[2][i_346_]));
			gameCamera.removeModel((engineHandle.aClass23ArrayArray2[2][i_346_]));
		}
		i_341_ = 376;
		i_339_ = 500;
		gameCamera.anInt437 = 4100;
		gameCamera.anInt465 = 1;
		gameCamera.anInt464 = 4100;
		gameCamera.anInt426 = 4000;
		gameCamera.setCamera(-engineHandle.getAveragedElevation(i_340_, i_338_), i_338_, i_341_, 912, i_340_, i_339_ * 2, 0);
		gameCamera.finishCamera();
		gameGraphics.method343(-1248297852);
		gameGraphics.method343(i + -1248301483);
		gameGraphics.method321(0, 0, 6, 512, 0, 1);
		if (i == 3631)
		{
			for (int i_347_ = 6; 1 <= i_347_; i_347_--)
			{
				gameGraphics.method325(512, 0, i_347_, 0, i_347_, 8);
			}
			gameGraphics.method321(194, 0, 20, 512, 0, i ^ 0xe2e);
			for (int i_348_ = 6; 1 <= i_348_; i_348_--)
			{
				gameGraphics.method325(512, 0, i_348_, 0, 194, 8);
			}
			gameGraphics.drawPicture(anInt935 + 10, 15, 15);
			gameGraphics.method353(0, 200, 0, 512, anInt935 + 10);
			gameGraphics.method306(anInt935 + 10);
		}
	}

	private void drawFriendsWindow(final byte i, final boolean bool)
	{
		int i_349_ = gameGraphics.menuDefaultWidth - 199;
		gameGraphics.drawPicture(anInt935 - -5, 3, i_349_ + -49);
		int i_350_ = 36;
		final int i_351_ = 196;
		final int i_352_ = 182;
		int i_354_;
		int i_353_ = i_354_ = Class34.method227(false, 160, 160, 160);
		if (anInt1042 == 0)
		{
			i_353_ = Class34.method227(false, 220, 220, 220);
		}
		else
		{
			i_354_ = Class34.method227(false, 220, 220, 220);
		}
		gameGraphics.method327(i_349_, i_350_, i_351_ / 2, 128, i + 172, i_353_, 24);
		if (i != -103)
		{
			wallObjectX = null;
		}
		gameGraphics.method327((i_351_ / 2) + i_349_, i_350_, i_351_ / 2, 128, 93, i_354_, 24);
		gameGraphics.method327(i_349_, i_350_ + 24, i_351_, 128, i + 187, Class34.method227(false, 220, 220, 220),
		        i_352_ + -24);
		gameGraphics.method341(i_351_, i_350_ - -24, i_349_, 0);
		gameGraphics.method319(0, 24, i_350_ - 0, (i_351_ / 2) + i_349_);
		gameGraphics.method341(i_351_, i_352_ + (i_350_ - 16), i_349_, 0);
		gameGraphics.drawText(0, 255, 4, "Friends", i_350_ + 16, i_349_ + (i_351_ / 4));
		gameGraphics.drawText(0, 255, 4, "Ignore", i_350_ - -16, (i_349_ + (i_351_ / 4)) - -(i_351_ / 2));
		aClass10_4.resetListTextCount(0, anInt951);
		if (anInt1042 == 0)
		{
			for (int index = 0; index < GameWindowMiddleMan.friendsCount; index++)
			{
				String string;
				if ((0x2 & GameWindowMiddleMan.friendsListOnlineStatus[index]) == 0)
				{
					if ((0x4 & GameWindowMiddleMan.friendsListOnlineStatus[index]) == 0)
					{
						string = "@red@";
					}
					else
					{
						string = "@yel@";
					}
				}
				else
				{
					string = "@gre@";
				}
				String string_356_ = GameWindowMiddleMan.friendsListNames[index];
				int i_357_ = 0;
				final int i_358_ = GameWindowMiddleMan.friendsListNames[index].length();
				for (/**/; gameGraphics.method328(string_356_, -123, 1) > 120; string_356_ = new StringBuilder()
				        .append(GameWindowMiddleMan.friendsListNames[index].substring(0, -i_357_ + i_358_)).append("...").toString())
				{
					i_357_++;
				}
				aClass10_4.method68(null, anInt951, null, 0, index, 0, new StringBuilder().append(string)
				        .append(string_356_).append("~439~@whi@Remove         WWWWWWWWWW").toString());
			}
		}
		if (anInt1042 == 1)
		{
			for (int i_359_ = 0; i_359_ < GameWindowMiddleMan.ignoreListCount; i_359_++)
			{
				String string = GameWindowMiddleMan.ignoreListNames[i_359_];
				int i_360_ = 0;
				final int i_361_ = GameWindowMiddleMan.ignoreListNames[i_359_].length();
				for (/**/; gameGraphics.method328(string, -117, 1) > 120; string = new StringBuilder()
				        .append(GameWindowMiddleMan.ignoreListNames[i_359_].substring(0, -i_360_ + i_361_)).append("...").toString())
				{
					i_360_++;
				}
				aClass10_4.method68(null, anInt951, null, 0, i_359_, i + 103, new StringBuilder().append("@yel@")
				        .append(string).append("~439~@whi@Remove         WWWWWWWWWW").toString());
			}
		}
		aClass10_4.drawMenu(-6);
		anInt997 = -1;
		anInt1016 = -1;
		if (anInt1042 == 0)
		{
			final int i_362_ = aClass10_4.method92(anInt951);
			if ((i_362_ >= 0) && (489 > this.mouseX))
			{
				if (this.mouseX <= 429)
				{
					anInt1016 = i_362_;
				}
				else
				{
					anInt1016 = -(2 - -i_362_);
				}
			}
			gameGraphics.drawText(16777215, i + 358, 1, "Click a name to send a message", i_350_ - -35,
			        (i_351_ / 2) + i_349_);
			int i_363_;
			if ((i_349_ >= this.mouseX) || ((i_349_ + i_351_) <= this.mouseX)
			        || (this.mouseY <= (i_352_ + i_350_ + -16)) || (this.mouseY >= (i_350_ + i_352_)))
			{
				i_363_ = 16777215;
			}
			else
			{
				i_363_ = 16776960;
			}
			gameGraphics.drawText(i_363_, i ^ ~0x99, 1, "Click here to add a friend", i_352_ + i_350_ + -3,
			        (i_351_ / 2) + i_349_);
		}
		if (anInt1042 == 1)
		{
			final int i_364_ = aClass10_4.method92(anInt951);
			if ((i_364_ >= 0) && (489 > this.mouseX))
			{
				if (429 < this.mouseX)
				{
					anInt997 = -(i_364_ + 2);
				}
				else
				{
					anInt997 = i_364_;
				}
			}
			gameGraphics.drawText(16777215, 255, 1, "Blocking messages from:", i_350_ + 35, (i_351_ / 2) + i_349_);
			int i_365_;
			if ((i_349_ < this.mouseX) && ((i_349_ + i_351_) > this.mouseX)
			        && ((i_352_ + i_350_ + -16) < this.mouseY) && (this.mouseY < (i_352_ + i_350_)))
			{
				i_365_ = 16776960;
			}
			else
			{
				i_365_ = 16777215;
			}
			gameGraphics.drawText(i_365_, 255, 1, "Click here to add a name", i_352_ + i_350_ + -3,
			        i_349_ - -(i_351_ / 2));
		}
		if (bool)
		{
			i_349_ = (-gameGraphics.menuDefaultWidth - (-199 - this.mouseX));
			i_350_ = this.mouseY + -36;
			if ((0 <= i_349_) && (i_350_ >= 0) && (i_349_ < 196) && (182 > i_350_))
			{
				aClass10_4.method85(this.mouseDownButton, i_350_ + 36, this.lastMouseDownButton, (gameGraphics.menuDefaultWidth + i_349_ + -199));
				if ((24 >= i_350_) && (anInt887 == 1))
				{
					if ((98 <= i_349_) || (anInt1042 != 1))
					{
						if ((i_349_ > 98) && (anInt1042 == 0))
						{
							anInt1042 = 1;
							aClass10_4.method101(anInt951);
						}
					}
					else
					{
						anInt1042 = 0;
						aClass10_4.method101(anInt951);
					}
				}
				if ((anInt887 == 1) && (anInt1042 == 0))
				{
					final int i_366_ = aClass10_4.method92(anInt951);
					if ((0 <= i_366_) && (489 > this.mouseX))
					{
						if (429 < this.mouseX)
						{
							removeFromFriends(GameWindowMiddleMan.friendsListNames[i_366_]);
						}
						else if ((0x4 & GameWindowMiddleMan.friendsListOnlineStatus[i_366_]) != 0)
						{
							inputBoxType = 2;
							privateMessageTarget = GameWindowMiddleMan.friendsListNames[i_366_];
							this.inputMessage = "";
							this.enteredMessage = "";
						}
					}
				}
				if ((anInt887 == 1) && (anInt1042 == 1))
				{
					final int i_367_ = aClass10_4.method92(anInt951);
					if ((0 <= i_367_) && (489 > this.mouseX) && (429 < this.mouseX))
					{
						method494((byte) -83, Camera.aStringArray28[i_367_]);
					}
				}
				if ((i_350_ > 166) && (anInt887 == 1) && (anInt1042 == 0))
				{
					this.aString27 = "";
					inputBoxType = 1;
					this.aString26 = "";
				}
				if ((166 < i_350_) && (anInt887 == 1) && (anInt1042 == 1))
				{
					this.aString26 = "";
					this.aString27 = "";
					inputBoxType = 3;
				}
				anInt887 = 0;
			}
		}
	}

	@Override
	void method473()
	{
		if (this.aBool37)
		{
			method599(-17269);
			this.aBool37 = false;
		}
		if (lastLoadedNull)
		{
			final Graphics graphics = getGraphics();
			if (graphics != null)
			{
				graphics.translate(this.anInt720, this.anInt694);
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 512, 356);
				graphics.setFont(new Font("Helvetica", 1, 16));
				graphics.setColor(Color.yellow);
				int i = 35;
				graphics.drawString("Sorry, an error has occured whilst loading RuneScape", 30, i);
				graphics.setColor(Color.white);
				i += 50;
				graphics.drawString("To fix this try the following (in order):", 30, i);
				graphics.setColor(Color.white);
				i += 50;
				graphics.setFont(new Font("Helvetica", 1, 12));
				graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, i);
				i += 30;
				graphics.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, i);
				i += 30;
				graphics.drawString("3: Try using a different game-world", 30, i);
				i += 30;
				graphics.drawString("4: Try rebooting your computer", 30, i);
				i += 30;
				graphics.drawString("5: Try selecting a different version of Java from the play-game menu", 30, i);
				changeThreadSleepModifier(1);
			}
		}
		else if (aBool50)
		{
			final Graphics graphics = getGraphics();
			if (graphics != null)
			{
				graphics.translate(this.anInt720, this.anInt694);
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 512, 356);
				graphics.setFont(new Font("Helvetica", 1, 20));
				graphics.setColor(Color.white);
				graphics.drawString("Error - unable to load game!", 50, 50);
				graphics.drawString("To play RuneScape make sure you play from", 50, 100);
				graphics.drawString("http://www.runescape.com", 50, 150);
				changeThreadSleepModifier(1);
			}
		}
		else if (memoryError)
		{
			final Graphics graphics = getGraphics();
			if (graphics != null)
			{
				graphics.translate(this.anInt720, this.anInt694);
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 512, 356);
				graphics.setFont(new Font("Helvetica", 1, 20));
				graphics.setColor(Color.white);
				graphics.drawString("Error - out of memory!", 50, 50);
				graphics.drawString("Close ALL unnecessary programs", 50, 100);
				graphics.drawString("and windows before loading the game", 50, 150);
				graphics.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
				changeThreadSleepModifier(1);
			}
		}
		else
		{
			try
			{
				if (gameGraphics != null)
				{
					if (loggedIn == 0)
					{
						gameGraphics.drawStringShadows = false;
						drawLoginScreen();
					}
					if (loggedIn == 1)
					{
						gameGraphics.drawStringShadows = true;
						drawGame();
					}
				}
			}
			catch (final OutOfMemoryError outofmemoryerror)
			{
				memoryError = true;
			}
		}
	}

	@Override
	protected void loginScreenPrint(final String string, final String string_368_, final boolean bool)
	{
		if (maybe_loginScreenNumber == 2)
		{
			if ((string_368_ == null) || (string_368_.length() < 1))
			{
				menuLogin.updateText(string, anInt1037);
			}
			else
			{
				menuLogin.updateText(string, anInt1005);
				menuLogin.updateText(string_368_, anInt1037);
			}
		}
		drawLoginScreen();
		resetCurrentTimeArray();
	}

	private void method534(final int i)
	{
		if (anInt887 != 0)
		{
			final int i_369_ = aClass29_1.method197(this.mouseX, this.mouseY, anInt984, anInt955);
			if (i_369_ >= 0)
			{
				method569(i_369_, i ^ 0x4215);
			}
			anInt887 = 0;
			aBool61 = false;
		}
		else if (i == 16508)
		{
			final int i_370_ = aClass29_1.method207();
			final int i_371_ = aClass29_1.method210(0);
			if ((this.mouseX < (anInt955 + -10)) || (this.mouseY < (anInt984 + -10))
			        || (this.mouseX > (i_370_ + anInt955 + 10)) || (((i_371_ - -10) + anInt984) < this.mouseY))
			{
				aBool61 = false;
			}
			else
			{
				aClass29_1.method204(anInt955, anInt984, this.mouseX, this.mouseY);
			}
		}
	}

	private void method535(final int i)
	{
		if ((this.aString26.length() <= 0) && !aBool60)
		{
			if ((anInt971 >= 1) && (anInt971 <= 8))
			{
				String string = "";
				for (int i_372_ = 0; this.aString27.length() > i_372_; i_372_++)
				{
					final char c = this.aString27.charAt(i_372_);
					if (Character.isDigit(c))
					{
						string = new StringBuilder().append(string).append(c).toString();
					}
				}
				this.aString27 = string;
			}
		}
		else
		{
			final String string = this.aString26.trim();
			this.aString27 = "";
			this.aString26 = "";
			do
			{
				if (anInt971 == 1)
				{
					try
					{
						method503(Integer.parseInt(string), anInt980, 2);
						break;
					}
					catch (final NumberFormatException numberformatexception)
					{
						break;
					}
				}
				if (anInt971 != 2)
				{
					if (anInt971 != 3)
					{
						if (anInt971 != 4)
						{
							if (anInt971 == 5)
							{
								try
								{
									final int i_373_ = shopItems[selectedShopItemIndex];
									if (i_373_ != -1)
									{
										final int i_374_ = Integer.parseInt(string);
										streamClass.createPacket(236);
										streamClass.aClass27_Sub1_Sub1_1.putShort(i_373_);
										streamClass.aClass27_Sub1_Sub1_1.putShort(shopItemCount[selectedShopItemIndex]);
										streamClass.aClass27_Sub1_Sub1_1.putShort(i_374_);
										streamClass.finishPacket();
									}
									break;
								}
								catch (final NumberFormatException numberformatexception)
								{
									break;
								}
							}
							if (anInt971 != 6)
							{
								if (anInt971 == 7)
								{
									try
									{
										method524(0, anInt1011, Integer.parseInt(string));
										break;
									}
									catch (final NumberFormatException numberformatexception)
									{
										break;
									}
								}
								if (anInt971 != 8)
								{
									if (anInt971 == 9)
									{
										streamClass.createPacket(84);
										streamClass.finishPacket();
									}
								}
								else
								{
									try
									{
										method538(Integer.parseInt(string), anInt1011);
									}
									catch (final NumberFormatException numberformatexception)
									{
										/* empty */
									}
								}
							}
							else
							{
								try
								{
									final int i_375_ = shopItems[selectedShopItemIndex];
									if (i_375_ != -1)
									{
										final int i_376_ = Integer.parseInt(string);
										streamClass.createPacket(221);
										streamClass.aClass27_Sub1_Sub1_1.putShort(shopItems[selectedShopItemIndex]);
										streamClass.aClass27_Sub1_Sub1_1.putShort(shopItemCount[selectedShopItemIndex]);
										streamClass.aClass27_Sub1_Sub1_1.putShort(i_376_);
										streamClass.finishPacket();
									}
								}
								catch (final NumberFormatException numberformatexception)
								{
									/* empty */
								}
							}
						}
						else
						{
							try
							{
								int i_377_;
								if (anInt983 < 0)
								{
									i_377_ = -1;
								}
								else
								{
									i_377_ = anIntArray210[anInt983];
								}
								final int i_378_ = Integer.parseInt(string);
								streamClass.createPacket(23);
								streamClass.aClass27_Sub1_Sub1_1.putShort(i_377_);
								streamClass.aClass27_Sub1_Sub1_1.putInt(i_378_);
								streamClass.aClass27_Sub1_Sub1_1.putInt(-2023406815);
								streamClass.finishPacket();
							}
							catch (final NumberFormatException numberformatexception)
							{
								/* empty */
							}
						}
					}
					else
					{
						try
						{
							int i_379_;
							if (0 <= anInt983)
							{
								i_379_ = anIntArray210[anInt983];
							}
							else
							{
								i_379_ = -1;
							}
							final int i_380_ = Integer.parseInt(string);
							streamClass.createPacket(22);
							streamClass.aClass27_Sub1_Sub1_1.putShort(i_379_);
							streamClass.aClass27_Sub1_Sub1_1.putInt(i_380_);
							streamClass.aClass27_Sub1_Sub1_1.putInt(305419896);
							streamClass.finishPacket();
						}
						catch (final NumberFormatException numberformatexception)
						{
							/* empty */
						}
					}
				}
				else
				{
					try
					{
						method523(Integer.parseInt(string), anInt980, 348);
					}
					catch (final NumberFormatException numberformatexception)
					{
						/* empty */
					}
				}
			}
			while (false);
			anInt971 = 0;
			return;
		}
		final int i_381_ = -(anInt985 / 2) + 256;
		final int i_382_ = 180 - (anInt1060 / 2);
		gameGraphics.method321(i_382_, 0, anInt1060, anInt985, i_381_, 1);
		gameGraphics.method362(anInt1060, i_381_, anInt985, 16777215, i_382_);
		final int i_383_ = gameGraphics.method315(1);
		final int i_384_ = gameGraphics.method315(4);
		final int i_385_ = i_383_ + 2;
		int i_386_ = 118 / ((i - 1) / 58);
		for (int i_387_ = 0; i_387_ < aStringArray49.length; i_387_++)
		{
			gameGraphics.drawText(16776960, 255, 1, aStringArray49[i_387_],
			        i_382_ - ((-5 - i_383_) + -(i_385_ * i_387_)), 256);
		}
		if (aBool62)
		{
			gameGraphics.drawText(16777215, 255, 4,
			        new StringBuilder().append(this.aString27).append("*").toString(),
			        (((i_382_ + (aStringArray49.length * i_385_) + 5) - -3) + i_384_), 256);
		}
		i_386_ = 16777215;
		final int i_388_ = (((aStringArray49.length * i_385_) + i_383_ + (i_382_ - -5) + 2) - (-i_384_ + -3));
		if ((this.mouseX > 230) && (this.mouseX < 248) && ((i_388_ - i_383_) < this.mouseY)
		        && (this.mouseY < i_388_))
		{
			if (anInt887 != 0)
			{
				this.aString26 = this.aString27;
				aBool60 = true;
				anInt887 = 0;
			}
			i_386_ = 16776960;
		}
		gameGraphics.method324("OK", 0, 1, i_386_, 230, i_388_);
		i_386_ = 16777215;
		if ((264 < this.mouseX) && (304 > this.mouseX) && (this.mouseY > (i_388_ - i_383_))
		        && (this.mouseY < i_388_))
		{
			i_386_ = 16776960;
			if (anInt887 != 0)
			{
				anInt971 = 0;
				anInt887 = 0;
			}
		}
		gameGraphics.method324("Cancel", 0, 1, i_386_, 264, i_388_);
		if ((anInt887 == 1) && ((this.mouseX < i_381_) || ((i_381_ + anInt985) < this.mouseX)
		        || (this.mouseY < i_382_) || ((i_382_ + anInt1060) < this.mouseY)))
		{
			anInt887 = 0;
			anInt971 = 0;
		}
	}

	private void makeLoginMenus(final boolean bool)
	{
		aClass10_7 = new Menu(gameGraphics, 50);
		int i = 40;
		aClass10_7.drawText(i + 200, bool, 4, 256, "Welcome to RuneScape Classic");
		String string = null;
		if (!isMembers)
		{
			if (isVeterans)
			{
				string = "You need a veteran Classic account to use this server";
			}
		}
		else if (!isVeterans)
		{
			string = "You need a members account to use this server";
		}
		else
		{
			string = "You need a veteran Classic members account to use this server";
		}
		if (string != null)
		{
			aClass10_7.drawText(215 - -i, true, 4, 256, string);
		}
		aClass10_7.method78(35, 200, 250 - -i, 256);
		aClass10_7.drawText(i + 250, false, 5, 256, "Click here to login");
		anInt1040 = aClass10_7.method65(i + 250, 35, 256, 200);
		menuLogin = new Menu(gameGraphics, 50);
		i = 230;
		anInt1005 = menuLogin.drawText(i - 30, true, 4, 256, "");
		anInt1037 = menuLogin.drawText(i + -10, true, 4, 256, "Please enter your username and password");
		i += 28;
		menuLogin.method78(40, 200, i, 140);
		menuLogin.drawText(i + -10, false, 4, 140, "Username:");
		anInt1002 = menuLogin.method96(140, 4, 320, 40, false, i + 10, false, 200);
		i += 47;
		menuLogin.method78(40, 200, i, 190);
		menuLogin.drawText(i + -10, false, 4, 190, "Password:");
		anInt942 = menuLogin.method96(190, 4, 20, 40, false, i + 10, true, 200);
		i -= 55;
		menuLogin.method78(25, 120, i, 410);
		menuLogin.drawText(i, false, 4, 410, "Ok");
		anInt1008 = menuLogin.method65(i, 25, 410, 120);
		i += 30;
		menuLogin.method78(25, 120, i, 410);
		menuLogin.drawText(i, false, 4, 410, "Cancel");
		anInt1033 = menuLogin.method65(i, 25, 410, 120);
		i += 30;
		menuLogin.setFocus(anInt1002);
	}

	private void method538(final int i_389_, final int i_390_)
	{
		final int i_391_ = anIntArray182[i_390_];
		final int i_392_ = 0 > i_389_ ? anInt1036 : i_389_;
		if (EntityHandler.itemdef_isUnstackable[i_391_] == 0)
		{
			anIntArray198[i_390_] -= i_392_;
			if (0 >= anIntArray198[i_390_])
			{
				anInt1061--;
				for (int i_393_ = i_390_; anInt1061 > i_393_; i_393_++)
				{
					anIntArray182[i_393_] = anIntArray182[i_393_ - -1];
					anIntArray198[i_393_] = anIntArray198[i_393_ + 1];
				}
			}
		}
		else
		{
			int i_394_ = 0;
			for (int i_395_ = 0; (anInt1061 > i_395_) && (i_392_ > i_394_); i_395_++)
			{
				if (i_391_ == anIntArray182[i_395_])
				{
					i_394_++;
					anInt1061--;
					for (int i_396_ = i_395_; i_396_ < anInt1061; i_396_++)
					{
						anIntArray182[i_396_] = anIntArray182[i_396_ + 1];
						anIntArray198[i_396_] = anIntArray198[i_396_ - -1];
					}
					i_395_--;
				}
			}
		}
		streamClass.createPacket(33);
		streamClass.aClass27_Sub1_Sub1_1.put(anInt1061);
		for (int i_398_ = 0; anInt1061 > i_398_; i_398_++)
		{
			streamClass.aClass27_Sub1_Sub1_1.putShort(anIntArray182[i_398_]);
			streamClass.aClass27_Sub1_Sub1_1.putInt(anIntArray198[i_398_]);
		}
		streamClass.finishPacket();
		aBool75 = false;
		aBool59 = false;
	}

	private void method539(final int i, final String string)
	{
		final int i_400_ = objectX[i];
		final int i_401_ = objectY[i];
		final int i_402_ = i_400_ + -(ourPlayer.currentX / 128);
		final int i_403_ = i_401_ + -(ourPlayer.currentY / 128);
		final int i_404_ = 7;
		if ((0 <= i_400_) && (0 <= i_401_) && (96 > i_400_) && (i_401_ < 96) && (-i_404_ < i_402_) && (i_404_ > i_402_)
		        && (-i_404_ < i_403_) && (i_404_ > i_403_))
		{
			gameCamera.removeModel(objectModelArray[i]);
			final int i_405_ = AClass1_Sub1.storeModel(string);
			final Model class23 = modelCache[i_405_].method166();
			gameCamera.addModel(class23);
			class23.method151(-50, 48, 256, 48, true, -10, -50);
			class23.method159(objectModelArray[i]);
			class23.anInt288 = i;
			objectModelArray[i] = class23;
		}
	}

	@Override
	protected void cantLogout()
	{
		logoutTimeout = 0;
		displayMessage(0, "Sorry, you can't logout at the moment", 0, null, -108, "@cya@", null, false);
	}

	private boolean method541(final int i)
	{
		final int i_408_ = ourPlayer.currentX / 128;
		final int i_409_ = ourPlayer.currentY / 128;
		for (int i_410_ = 2; i_410_ >= 1; i_410_--)
		{
			if ((i == 1) && ((((engineHandle.anIntArrayArray4[i_408_][-i_410_ + i_409_]) & 0x80) == 128)
			        || (((engineHandle.anIntArrayArray4[i_408_ - i_410_][i_409_]) & 0x80) == 128)
			        || (((engineHandle.anIntArrayArray4[-i_410_ + i_408_][i_409_ - i_410_]) & 0x80) == 128)))
			{
				return false;
			}
			if ((i == 3) && (((0x80 & (engineHandle.anIntArrayArray4[i_408_][i_409_ + i_410_])) == 128)
			        || (((engineHandle.anIntArrayArray4[-i_410_ + i_408_][i_409_]) & 0x80) == 128)
			        || (((engineHandle.anIntArrayArray4[i_408_ - i_410_][i_409_ + i_410_]) & 0x80) == 128)))
			{
				return false;
			}
			if ((i == 5) && ((((engineHandle.anIntArrayArray4[i_408_][i_409_ - -i_410_]) & 0x80) == 128)
			        || ((0x80 & (engineHandle.anIntArrayArray4[i_410_ + i_408_][i_409_])) == 128)
			        || ((0x80 & (engineHandle.anIntArrayArray4[i_408_ + i_410_][i_409_ + i_410_])) == 128)))
			{
				return false;
			}
			if ((i == 7) && ((((engineHandle.anIntArrayArray4[i_408_][-i_410_ + i_409_]) & 0x80) == 128)
			        || (((engineHandle.anIntArrayArray4[i_410_ + i_408_][i_409_]) & 0x80) == 128)
			        || ((0x80 & (engineHandle.anIntArrayArray4[i_410_ + i_408_][-i_410_ + i_409_])) == 128)))
			{
				return false;
			}
			if ((i == 0) && ((0x80 & (engineHandle.anIntArrayArray4[i_408_][-i_410_ + i_409_])) == 128))
			{
				return false;
			}
			if ((i == 2) && (((engineHandle.anIntArrayArray4[-i_410_ + i_408_][i_409_]) & 0x80) == 128))
			{
				return false;
			}
			if ((i == 4) && (((engineHandle.anIntArrayArray4[i_408_][i_410_ + i_409_]) & 0x80) == 128))
			{
				return false;
			}
			if ((i == 6) && (((engineHandle.anIntArrayArray4[i_410_ + i_408_][i_409_]) & 0x80) == 128))
			{
				return false;
			}
		}
		return true;
	}

	private void method543()
	{
		final int i = 22;
		final int i_412_ = 36;
		gameGraphics.method321(i_412_, 192, 16, 468, i, 1);
		final int i_413_ = 10000536;
		gameGraphics.method327(i, i_412_ - -16, 468, 160, 71, i_413_, 246);
		gameGraphics.drawText(16777215, 255, 1,
		        new StringBuilder().append("Please confirm your trade with @yel@").append(aString31).toString(),
		        i_412_ + 12, i + 234);
		gameGraphics.drawText(16776960, 255, 1, "You are about to give:", i_412_ + 30, i + 117);
		for (int i_414_ = 0; i_414_ < anInt1038; i_414_++)
		{
			String string = EntityHandler.itemdef_name[anIntArray172[i_414_]];
			if (EntityHandler.itemdef_isUnstackable[anIntArray172[i_414_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Menu.method79(1, anIntArray160[i_414_])).toString();
			}
			gameGraphics.drawText(16777215, 255, 1, string, (i_412_ + 42) - -(i_414_ * 12), i + 117);
		}
		if (anInt1038 == 0)
		{
			gameGraphics.drawText(16777215, 255, 1, "Nothing!", i_412_ + 42, i + 117);
		}
		gameGraphics.drawText(16776960, 255, 1, "In return you will receive:", i_412_ + 30, i + 351);
		for (int i_415_ = 0; anInt998 > i_415_; i_415_++)
		{
			String string = EntityHandler.itemdef_name[anIntArray159[i_415_]];
			if (EntityHandler.itemdef_isUnstackable[anIntArray159[i_415_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Menu.method79(1, anIntArray220[i_415_])).toString();
			}
			gameGraphics.drawText(16777215, 255, 1, string, i_412_ - (-42 - (i_415_ * 12)), i + 351);
		}
		if (anInt998 == 0)
		{
			gameGraphics.drawText(16777215, 255, 1, "Nothing!", i_412_ + 42, i + 351);
		}
		gameGraphics.drawText(65535, 255, 4, "Are you sure you want to do this?", i_412_ + 200, i - -234);
		gameGraphics.drawText(16777215, 255, 1, "There is NO WAY to reverse a trade if you change your mind.",
		        i_412_ - -215, i - -234);
		gameGraphics.drawText(16777215, 255, 1, "Remember that not all players are trustworthy", i_412_ - -230,
		        i - -234);
		if (aBool63)
		{
			gameGraphics.drawText(16776960, 255, 1, "Waiting for other player...", i_412_ - -250, i + 234);
		}
		else
		{
			gameGraphics.drawPicture(anInt935 + 25, i_412_ + 238, i + 118 + -35);
			gameGraphics.drawPicture(anInt935 + 26, i_412_ + 238, (i - 35) + 352);
		}
		if (anInt887 == 1)
		{
			if ((this.mouseX < i) || (i_412_ > this.mouseY) || ((i + 468) < this.mouseX)
			        || ((i_412_ + 262) < this.mouseY))
			{
				aBool89 = false;
				streamClass.createPacket(230);
				streamClass.finishPacket();
			}
			if (((i + 83) <= this.mouseX) && (this.mouseX <= (i - -118 - -70)) && ((i_412_ + 238) <= this.mouseY)
			        && ((i_412_ + 21 + 238) >= this.mouseY))
			{
				aBool63 = true;
				streamClass.createPacket(104);
				streamClass.finishPacket();
			}
			if (((i + -35 + 352) <= this.mouseX) && (((i - -70) + 353) >= this.mouseX)
			        && (this.mouseY >= (i_412_ + 238)) && (this.mouseY <= ((i_412_ + 21) - -238)))
			{
				aBool89 = false;
				streamClass.createPacket(230);
				streamClass.finishPacket();
			}
			anInt887 = 0;
		}
	}

	private void method545(final int i, final int i_416_, final int i_417_, final int i_418_, final boolean bool,
	        final byte i_419_)
	{
		if (!method557(i, i_418_, i_418_, i_417_, i_419_ + 229, bool, i_416_, false, i_417_))
		{
			method552(i_417_, bool, i_418_, i, i_418_, i_417_, i_416_, true, true);
			if (i_419_ != -110)
			{
				method471();
			}
		}
	}

	private void method546()
	{
		if ((anInt887 != 0) && (anInt971 == 0))
		{
			anInt887 = 0;
			final int i_420_ = this.mouseX + -52;
			final int i_421_ = this.mouseY - 44;
			if ((0 > i_420_) || (12 > i_421_) || (i_420_ >= 408) || (i_421_ >= 246))
			{
				streamClass.createPacket(166);
				streamClass.finishPacket();
				showShop = false;
				return;
			}
			int i_422_ = 0;
			for (int i_423_ = 0; 5 > i_423_; i_423_++)
			{
				for (int i_424_ = 0; 8 > i_424_; i_424_++)
				{
					final int i_425_ = 7 - -(i_424_ * 49);
					final int i_426_ = (i_423_ * 34) + 28;
					if ((i_420_ > i_425_) && (i_420_ < (i_425_ + 49)) && (i_426_ < i_421_) && (i_421_ < (i_426_ + 34))
					        && (shopItems[i_422_] != -1))
					{
						selectedShopItemIndex = i_422_;
						anInt1006 = shopItems[i_422_];
					}
					i_422_++;
				}
			}
			if (0 <= selectedShopItemIndex)
			{
				final int i_427_ = shopItems[selectedShopItemIndex];
				if (i_427_ != -1)
				{
					final int i_428_ = shopItemCount[selectedShopItemIndex];
					if ((i_428_ > 0) && (204 <= i_421_) && (i_421_ <= 215))
					{
						int i_429_ = 0;
						if ((318 < i_420_) && (i_420_ < 330))
						{
							i_429_ = 1;
						}
						if ((5 <= i_428_) && (i_420_ > 333) && (i_420_ < 345))
						{
							i_429_ = 5;
						}
						if ((i_428_ >= 10) && (i_420_ > 348) && (i_420_ < 365))
						{
							i_429_ = 10;
						}
						if ((388 < i_420_) && (400 > i_420_))
						{
							method516(Class44.aStringArray30, 5, true);
						}
						if ((50 <= i_428_) && (368 < i_420_) && (385 > i_420_))
						{
							i_429_ = 50;
						}
						if (i_429_ > 0)
						{
							streamClass.createPacket(236);
							streamClass.aClass27_Sub1_Sub1_1.putShort(shopItems[selectedShopItemIndex]);
							streamClass.aClass27_Sub1_Sub1_1.putShort(i_428_);
							streamClass.aClass27_Sub1_Sub1_1.putShort(i_429_);
							streamClass.finishPacket();
						}
					}
					final int i_430_ = inventoryCount(i_427_);
					if ((0 < i_430_) && (229 <= i_421_) && (i_421_ <= 240))
					{
						int i_431_ = 0;
						if ((318 < i_420_) && (i_420_ < 330))
						{
							i_431_ = 1;
						}
						if ((i_430_ >= 5) && (i_420_ > 333) && (i_420_ < 345))
						{
							i_431_ = 5;
						}
						if ((i_430_ >= 10) && (348 < i_420_) && (i_420_ < 365))
						{
							i_431_ = 10;
						}
						if ((388 < i_420_) && (400 > i_420_))
						{
							method516(Class4.aStringArray5, 6, true);
						}
						if ((i_430_ >= 50) && (i_420_ > 368) && (i_420_ < 385))
						{
							i_431_ = 50;
						}
						if (0 < i_431_)
						{
							streamClass.createPacket(221);
							streamClass.aClass27_Sub1_Sub1_1.putShort(shopItems[selectedShopItemIndex]);
							streamClass.aClass27_Sub1_Sub1_1.putShort(i_428_);
							streamClass.aClass27_Sub1_Sub1_1.putShort(i_431_);
							streamClass.finishPacket();
						}
					}
				}
			}
		}
		final int i_432_ = 52;
		final int i_433_ = 44;
		gameGraphics.method321(i_433_, 192, 12, 408, i_432_, 1);
		final int i_434_ = 10000536;
		gameGraphics.method327(i_432_, i_433_ - -12, 408, 160, 86, i_434_, 17);
		gameGraphics.method327(i_432_, i_433_ - -29, 8, 160, 111, i_434_, 170);
		gameGraphics.method327(i_432_ - -399, i_433_ + 29, 9, 160, 80, i_434_, 170);
		gameGraphics.method327(i_432_, i_433_ - -199, 408, 160, 75, i_434_, 47);
		gameGraphics.method324("Buying and selling items", 0, 1, 16777215, i_432_ + 1, i_433_ - -10);
		int i_435_ = 16777215;
		if ((this.mouseX > (i_432_ + 320)) && (i_433_ <= this.mouseY) && ((i_432_ + 408) > this.mouseX)
		        && (this.mouseY < (i_433_ + 12)))
		{
			i_435_ = 16711680;
		}
		gameGraphics.method313(i_435_, i_432_ + 406, 1, i_433_ - -10, "Close window");
		gameGraphics.method324("Shops stock in green", 0, 1, 65280, i_432_ + 2, i_433_ + 24);
		gameGraphics.method324("Number you own in blue", 0, 1, 65535, i_432_ - -135, i_433_ + 24);
		gameGraphics.method324(
		        new StringBuilder().append("Your money: ").append(inventoryCount(10)).append("gp").toString(), 0, 1,
		        16776960, i_432_ + 280, i_433_ + 24);
		final int i_436_ = 13684944;
		int i_437_ = 0;
		for (int i_438_ = 0; i_438_ < 5; i_438_++)
		{
			for (int i_439_ = 0; i_439_ < 8; i_439_++)
			{
				final int i_440_ = (i_432_ + 7) - -(i_439_ * 49);
				final int i_441_ = (i_438_ * 34) + i_433_ + 28;
				if (i_437_ == selectedShopItemIndex)
				{
					gameGraphics.method327(i_440_, i_441_, 49, 160, 84, 16711680, 34);
				}
				else
				{
					gameGraphics.method327(i_440_, i_441_, 49, 160, 69, i_436_, 34);
				}
				gameGraphics.method362(35, i_440_, 50, 0, i_441_);
				if (shopItems[i_437_] != -1)
				{
					gameGraphics.method348(false, 0, -73, 32, i_441_, 48, 0,
					        (anInt863 - -(EntityHandler.itemdef_sprite[shopItems[i_437_]])),
					        (EntityHandler.itemdef_color[shopItems[i_437_]]), i_440_);
					gameGraphics.method324(new StringBuilder().append("").append(shopItemCount[i_437_]).toString(),
					        0, 1, 65280, i_440_ + 1, i_441_ - -10);
					gameGraphics.method313(65535, i_440_ - -47, 1, i_441_ - -10, new StringBuilder()
					        .append("").append(inventoryCount((shopItems[i_437_]))).toString());
				}
				i_437_++;
			}
		}
		gameGraphics.method341(398, i_433_ - -222, i_432_ + 5, 0);
		if (selectedShopItemIndex == -1)
		{
			gameGraphics.drawText(16776960, 255, 3, "Select an object to buy or sell", i_433_ - -214, i_432_ + 204);
		}
		else
		{
			final int i_442_ = shopItems[selectedShopItemIndex];
			if (i_442_ != -1)
			{
				final int i_443_ = shopItemCount[selectedShopItemIndex];
				if (i_443_ > 0)
				{
					final int cost = computeItemCost(shopUnknown2, EntityHandler.itemdef_basePrice[i_442_], 1, true, i_443_, shopUnknown3, anIntArray174[selectedShopItemIndex]);
					gameGraphics.method324(
					        new StringBuilder().append(EntityHandler.itemdef_name[i_442_]).append(": buy for ")
					                .append(cost).append("gp each").toString(),
					        0, 1, 16776960, i_432_ + 2, i_433_ + 214);
					final boolean bool = ((this.mouseY >= (i_433_ + 204)) && ((i_433_ + 215) >= this.mouseY));
					i_435_ = 16777215;
					gameGraphics.method324("Buy:", 0, 3, 16777215, i_432_ + 285, i_433_ + 214);
					if (bool && (this.mouseX > (i_432_ + 318)) && (this.mouseX < (i_432_ + 330)))
					{
						i_435_ = 16711680;
					}
					gameGraphics.method324("1", 0, 3, i_435_, i_432_ - -320, i_433_ + 214);
					if (5 <= i_443_)
					{
						i_435_ = 16777215;
						if (bool && ((i_432_ + 333) < this.mouseX) && (this.mouseX < (i_432_ + 345)))
						{
							i_435_ = 16711680;
						}
						gameGraphics.method324("5", 0, 3, i_435_, i_432_ + 335, i_433_ + 214);
					}
					if (i_443_ >= 10)
					{
						i_435_ = 16777215;
						if (bool && (this.mouseX > (i_432_ + 348)) && (this.mouseX < (i_432_ + 365)))
						{
							i_435_ = 16711680;
						}
						gameGraphics.method324("10", 0, 3, i_435_, i_432_ + 350, i_433_ - -214);
					}
					if (i_443_ >= 50)
					{
						i_435_ = 16777215;
						if (bool && ((i_432_ + 368) < this.mouseX) && (this.mouseX < (i_432_ - -385)))
						{
							i_435_ = 16711680;
						}
						gameGraphics.method324("50", 0, 3, i_435_, i_432_ + 370, i_433_ + 214);
					}
					i_435_ = 16777215;
					if (bool && ((i_432_ - -388) < this.mouseX) && ((i_432_ + 400) > this.mouseX))
					{
						i_435_ = 16711680;
					}
					gameGraphics.method324("X", 0, 3, i_435_, i_432_ - -390, i_433_ - -214);
				}
				else
				{
					gameGraphics.drawText(16776960, 255, 3, "This item is not currently available to buy",
					        i_433_ + 214, i_432_ + 204);
				}
				final int i_445_ = inventoryCount(i_442_);
				if (i_445_ <= 0)
				{
					gameGraphics.drawText(16776960, 255, 3, "You do not have any of this item to sell",
					        i_433_ + 239, i_432_ + 204);
				}
				else
				{
					final int i_446_ = computeItemCost(shopUnknown1, EntityHandler.itemdef_basePrice[i_442_], 1, false, i_443_,
					        shopUnknown3, anIntArray174[selectedShopItemIndex]);
					gameGraphics.method324(
					        new StringBuilder().append(EntityHandler.itemdef_name[i_442_]).append(": sell for ")
					                .append(i_446_).append("gp each").toString(),
					        0, 1, 16776960, i_432_ + 2, i_433_ + 239);
					final boolean bool = ((this.mouseY >= (i_433_ - -229)) && (this.mouseY <= (i_433_ - -240)));
					gameGraphics.method324("Sell:", 0, 3, 16777215, i_432_ + 285, i_433_ + 239);
					i_435_ = 16777215;
					if (bool && (this.mouseX > (i_432_ + 318)) && (this.mouseX < (i_432_ + 330)))
					{
						i_435_ = 16711680;
					}
					gameGraphics.method324("1", 0, 3, i_435_, i_432_ + 320, i_433_ + 239);
					if (5 <= i_445_)
					{
						i_435_ = 16777215;
						if (bool && ((i_432_ + 333) < this.mouseX) && ((i_432_ + 345) > this.mouseX))
						{
							i_435_ = 16711680;
						}
						gameGraphics.method324("5", 0, 3, i_435_, i_432_ + 335, i_433_ + 239);
					}
					if (10 <= i_445_)
					{
						i_435_ = 16777215;
						if (bool && (this.mouseX > (i_432_ + 348)) && ((i_432_ + 365) > this.mouseX))
						{
							i_435_ = 16711680;
						}
						gameGraphics.method324("10", 0, 3, i_435_, i_432_ + 350, i_433_ + 239);
					}
					if (i_445_ >= 50)
					{
						i_435_ = 16777215;
						if (bool && (this.mouseX > (i_432_ + 368)) && ((i_432_ + 385) > this.mouseX))
						{
							i_435_ = 16711680;
						}
						gameGraphics.method324("50", 0, 3, i_435_, i_432_ - -370, i_433_ + 239);
					}
					i_435_ = 16777215;
					if (bool && (this.mouseX > (i_432_ + 388)) && (this.mouseX < (i_432_ - -400)))
					{
						i_435_ = 16711680;
					}
					gameGraphics.method324("X", 0, 3, i_435_, i_432_ + 390, i_433_ + 239);
				}
			}
		}
	}

	@Override
	protected final void handleIncomingPacket(final byte i, final int command, final int length)
	{
		if (command == 191)
		{
			lastPlayerCount = playerCount;
			for (int index = 0; index < lastPlayerCount; index++)
			{
				lastPlayerArray[index] = playerArray[index];
			}
			packetsIncoming.method454(-1192);
			sectionX = packetsIncoming.method456(11);
			sectionY = packetsIncoming.method456(13);
			int mobSprite = packetsIncoming.method456(4);
			final boolean bool = loadSection(684, sectionX, sectionY);
			sectionY -= areaY;
			sectionX -= areaX;
			int i_451_ = (sectionX * tileSize) + 64;
			int i_452_ = (sectionY * tileSize) + 64;
			if (bool)
			{
				ourPlayer.currentX = ourPlayer.waypointsX[0] = i_451_;
				ourPlayer.waypointCurrentIndex = 0;
				ourPlayer.waypointEndSprite = 0;
				ourPlayer.currentY = ourPlayer.waypointsY[0] = i_452_;
			}
			playerCount = 0;
			ourPlayer = addPlayer(i_452_, i_451_, serverIndex, mobSprite);
			final int newPlayerCount = packetsIncoming.method456(8);
			for (int i_454_ = 0; i_454_ < newPlayerCount; i_454_++)
			{
				final Mob mob = lastPlayerArray[i_454_ + 1];
				final int i_455_ = packetsIncoming.method456(1);
				if (i_455_ != 0)
				{
					final int i_456_ = packetsIncoming.method456(1);
					if (i_456_ == 0)
					{
						final int i_457_ = packetsIncoming.method456(3);
						int i_458_ = mob.waypointCurrentIndex;
						int i_459_ = mob.waypointsX[i_458_];
						int i_460_ = mob.waypointsY[i_458_];
						if ((i_457_ == 2) || (i_457_ == 1) || (i_457_ == 3))
						{
							i_459_ += tileSize;
						}
						if ((i_457_ == 6) || (i_457_ == 5) || (i_457_ == 7))
						{
							i_459_ -= tileSize;
						}
						if ((i_457_ == 4) || (i_457_ == 3) || (i_457_ == 5))
						{
							i_460_ += tileSize;
						}
						if ((i_457_ == 0) || (i_457_ == 1) || (i_457_ == 7))
						{
							i_460_ -= tileSize;
						}
						mob.waypointCurrentIndex = i_458_ = (i_458_ - -1) % 10;
						mob.nextSprite = i_457_;
						mob.waypointsX[i_458_] = i_459_;
						mob.waypointsY[i_458_] = i_460_;
					}
					else
					{
						final int i_461_ = packetsIncoming.method456(2);
						if (i_461_ == 3)
						{
							continue;
						}
						mob.nextSprite = packetsIncoming.method456(2) + (i_461_ << 2);
					}
				}
				playerArray[playerCount++] = mob;
			}
			while ((24 + packetsIncoming.method457()) < (length * 8))
			{
				final int i_462_ = packetsIncoming.method456(11);
				int i_463_ = packetsIncoming.method456(5);
				if (i_463_ > 15)
				{
					i_463_ -= 32;
				}
				int i_464_ = packetsIncoming.method456(5);
				mobSprite = packetsIncoming.method456(4);
				if (15 < i_464_)
				{
					i_464_ -= 32;
				}
				i_452_ = ((i_464_ + sectionY) * tileSize) + 64;
				i_451_ = ((i_463_ + sectionX) * tileSize) + 64;
				addPlayer(i_452_, i_451_, i_462_, mobSprite);
			}
			packetsIncoming.method458();
		}
		else if (command == 99)
		{
			while (packetsIncoming.position < length)
			{
				if (packetsIncoming.readUnsignedByte() != 255)
				{
					packetsIncoming.position--;
					int itemIdAndFlag = packetsIncoming.readUnsignedShort();
					final int objX = sectionX + packetsIncoming.readByte();
					final int objY = sectionY + packetsIncoming.readByte();
					if ((0x8000 & itemIdAndFlag) == 0) // New Item
					{
						groundItemX[groundItemCount] = objX;
						groundItemY[groundItemCount] = objY;
						groundItemType[groundItemCount] = itemIdAndFlag;
						groundItemObjectVar[groundItemCount] = 0;
						for (int index = 0; index < objectCount; index++)
						{
							if ((objX == objectX[index]) && (objY == objectY[index]))
							{
								groundItemObjectVar[groundItemCount] = EntityHandler.objectdef_groundItemVar[objectType[index]];
								break;
							}
						}
						groundItemCount++;
					}
					else
					{ // Known Item
						itemIdAndFlag &= 0x7fff;
						int newCount = 0;
						for (int index = 0; index < groundItemCount; index++)
						{
							if ((objX != groundItemX[index]) || (objY != groundItemY[index])
							        || (itemIdAndFlag != groundItemType[index]))
							{
								if (index != newCount)
								{
									groundItemX[newCount] = groundItemX[index];
									groundItemY[newCount] = groundItemY[index];
									groundItemType[newCount] = groundItemType[index];
									groundItemObjectVar[newCount] = groundItemObjectVar[index];
								}
								newCount++;
							}
							else
							{
								itemIdAndFlag = -123;
							}
						}
						groundItemCount = newCount;
					}
				}
				else
				{
					int newCount = 0;
					final int objX = (sectionX + packetsIncoming.readByte()) >> 3;
					final int objY = (sectionY + packetsIncoming.readByte()) >> 3;
					for (int index = 0; index < groundItemCount; index++)
					{
						final int i_475_ = (groundItemX[index] >> 3) - objX;
						final int i_476_ = (groundItemY[index] >> 3) - objY;
						if ((i_475_ != 0) || (i_476_ != 0))
						{
							if (index != newCount)
							{
								groundItemX[newCount] = groundItemX[index];
								groundItemY[newCount] = groundItemY[index];
								groundItemType[newCount] = groundItemType[index];
								groundItemObjectVar[newCount] = groundItemObjectVar[index];
							}
							newCount++;
						}
					}
					groundItemCount = newCount;
				}
			}
		}
		else if (command == 48)
		{
			while (length > packetsIncoming.position)
			{
				if (packetsIncoming.readUnsignedByte() == 255)
				{
					int newCount = 0;
					final int objX = (sectionX + packetsIncoming.readByte()) >> 3;
					final int objY = (sectionY + packetsIncoming.readByte()) >> 3;
					for (int index = 0; index < objectCount; index++)
					{
						final int i_481_ = (objectX[index] >> 3) - objX;
						final int i_482_ = (objectY[index] >> 3) - objY;
						if ((i_481_ != 0) || (i_482_ != 0))
						{
							if (index != newCount)
							{
								objectModelArray[newCount] = objectModelArray[index];
								objectModelArray[newCount].anInt288 = newCount;
								objectX[newCount] = objectX[index];
								objectY[newCount] = objectY[index];
								objectType[newCount] = objectType[index];
								objectRotation[newCount] = objectRotation[index];
							}
							newCount++;
						}
						else
						{
							gameCamera.removeModel(objectModelArray[index]);
							engineHandle.updateObjectAnd(objectType[index], objectY[index], objectX[index], -30895);
						}
					}
					objectCount = newCount;
				}
				else
				{
					packetsIncoming.position--;
					final int type = packetsIncoming.readUnsignedShort();
					final int objX = sectionX + packetsIncoming.readByte();
					final int objY = sectionY + packetsIncoming.readByte();
					int newCount = 0;
					for (int index = 0; index < objectCount; index++)
					{
						if (objectX[index] != objX || objectY[index] != objY)
						{
							if (newCount != index)
							{
								objectModelArray[newCount] = objectModelArray[index];
								objectModelArray[newCount].anInt288 = newCount;
								objectX[newCount] = objectX[index];
								objectY[newCount] = objectY[index];
								objectType[newCount] = objectType[index];
								objectRotation[newCount] = objectRotation[index];
							}
							newCount++;
						}
						else
						{
							gameCamera.removeModel(objectModelArray[index]);
							engineHandle.updateObjectAnd(objectType[index], objectY[index], objectX[index], i ^ 0x788f);
						}
					}
					objectCount = newCount;
					if (type != 60000)
					{
						final int objRotation = engineHandle.method13(objY, objX);
						int i_489_;
						int i_490_;
						if ((objRotation == 0) || (objRotation == 4))
						{
							i_490_ = EntityHandler.objectdef_width[type];
							i_489_ = EntityHandler.objectdef_height[type];
						}
						else
						{
							i_489_ = EntityHandler.objectdef_width[type];
							i_490_ = EntityHandler.objectdef_height[type];
						}
						final int i_491_ = (((objX + objX) + i_490_) * tileSize) / 2;
						final int i_492_ = ((i_489_ + objY + objY) * tileSize) / 2;
						final int i_493_ = EntityHandler.objectdef_modelIndex[type];
						final Model model = modelCache[i_493_].method166();
						gameCamera.addModel(model);
						model.anInt288 = objectCount;
						model.method141(0, objRotation * 32, 0);
						model.translate(1, i_492_, -engineHandle.getAveragedElevation(i_492_, i_491_), i_491_);
						model.method151(-50, 48, 256, 48, true, -10, -50);
						engineHandle.updateObjectAnd(type, objX, objY);
						if (type == 74)
						{
							model.translate(1, 0, -480, 0);
						}
						objectX[objectCount] = objX;
						objectY[objectCount] = objY;
						objectType[objectCount] = type;
						objectRotation[objectCount] = objRotation;
						objectModelArray[objectCount++] = model;
					}
				}
			}
		}
		else if (command == 111)
		{
			showSkipTutorial = packetsIncoming.readUnsignedByte() != 0;
		}
		else if (command == Constants.SPacketID_InventorySet)
		{
			inventoryCount = packetsIncoming.readUnsignedByte();
			for (int invIndex = 0; invIndex < inventoryCount; invIndex++)
			{
				final int i_495_ = packetsIncoming.readUnsignedShort();
				inventoryItems[invIndex] = i_495_ & 0x7FFF;
				wearing[invIndex] = i_495_ / 32768;
				if (EntityHandler.itemdef_isUnstackable[i_495_ & 0x7fff] == 0)
				{
					inventoryItemsCount[invIndex] = packetsIncoming.method387();
				}
				else
				{
					inventoryItemsCount[invIndex] = 1;
				}
			}
		}
		else if (command == 234)
		{
			final int mobCount = packetsIncoming.readUnsignedShort();
			for (int currentMob = 0; currentMob < mobCount; currentMob++)
			{
				final int mobArrayIndex = packetsIncoming.readUnsignedShort();
				final Mob mob = mobArray[mobArrayIndex];
				final byte mobUpdateType = packetsIncoming.readByte();
				if (mobUpdateType != 0)
				{
					if (mobUpdateType == 1)
					{
						if (mob != null)
						{
							final int i_500_ = packetsIncoming.readUnsignedByte();
							final String string = Class4.method8(packetsIncoming, -46);
							boolean bool = false;
							final String string_501_ = Class43.method298((mob.maybe_accountName));
							if (string_501_ != null)
							{
								for (int i_502_ = 0; i_502_ < GameWindowMiddleMan.ignoreListCount; i_502_++)
								{
									if (string_501_
									        .equals(Class43.method298((Camera.aStringArray28[i_502_]))))
									{
										bool = true;
										break;
									}
								}
							}
							if (!bool)
							{
								mob.anInt165 = 150;
								mob.aString8 = string;
								displayMessage(i_500_, mob.aString8, 4, mob.maybe_displayName, -105, null, mob.maybe_accountName,
								        i_500_ == 2);
							}
						}
					}
					else if (mobUpdateType == 2)
					{
						final int i_503_ = packetsIncoming.readUnsignedByte();
						final int i_504_ = packetsIncoming.readUnsignedByte();
						final int i_505_ = packetsIncoming.readUnsignedByte();
						if (mob != null)
						{
							mob.anInt157 = i_503_;
							mob.anInt145 = 200;
							mob.anInt148 = i_505_;
							mob.anInt143 = i_504_;
							if (mob == ourPlayer)
							{
								anIntArray185[3] = i_504_;
								anIntArray200[3] = i_505_;
								showServerMessageBox = false;
								showWelcomeBox = false;
							}
						}
					}
					else if (mobUpdateType == 3)
					{
						final int i_506_ = packetsIncoming.readUnsignedShort();
						final int i_507_ = packetsIncoming.readUnsignedShort();
						if (mob != null)
						{
							mob.anInt158 = anInt855;
							mob.anInt169 = -1;
							mob.anInt164 = i_506_;
							mob.anInt154 = i_507_;
						}
					}
					else if (mobUpdateType == 4)
					{
						final int i_508_ = packetsIncoming.readUnsignedShort();
						final int i_509_ = packetsIncoming.readUnsignedShort();
						if (mob != null)
						{
							mob.anInt154 = -1;
							mob.anInt169 = i_509_;
							mob.anInt158 = anInt855;
							mob.anInt164 = i_508_;
						}
					}
					else if (mobUpdateType != 5)
					{
						if ((mobUpdateType == 6) && (mob != null))
						{
							final String string = Class4.method8(packetsIncoming, -46);
							mob.aString8 = string;
							mob.anInt165 = 150;
							if (mob == ourPlayer)
							{
								displayMessage(0, mob.aString8, 3, mob.maybe_displayName, -92, null, mob.maybe_accountName, false);
							}
						}
					}
					else if (mob == null)
					{
						packetsIncoming.readUnsignedShort();
						packetsIncoming.readString();
						packetsIncoming.readString();
						final int i_510_ = packetsIncoming.readUnsignedByte();
						packetsIncoming.position += 6 + i_510_;
					}
					else
					{
						packetsIncoming.readUnsignedShort();
						mob.maybe_displayName = packetsIncoming.readString();
						mob.maybe_accountName = packetsIncoming.readString();
						final int Count = packetsIncoming.readUnsignedByte();
						for (int index = 0; index < Count; index++)
						{
							mob.animationCount[index] = packetsIncoming.readUnsignedByte();
						}
						for (int index = Count; index < 12; index++)
						{
							mob.animationCount[index] = 0;
						}
						mob.colorHairType = packetsIncoming.readUnsignedByte();
						mob.colorTopType = packetsIncoming.readUnsignedByte();
						mob.colorBottomType = packetsIncoming.readUnsignedByte();
						mob.colorSkinType = packetsIncoming.readUnsignedByte();
						mob.level = packetsIncoming.readUnsignedByte();
						mob.skull = packetsIncoming.readUnsignedByte();
					}
				}
				else
				{
					final int i_514_ = packetsIncoming.readUnsignedShort();
					if (mob != null)
					{
						mob.anInt168 = 150;
						mob.anInt162 = i_514_;
					}
				}
			}
		}
		else if (command == 91)
		{
			while (length > packetsIncoming.position)
			{
				if (packetsIncoming.readUnsignedByte() != 255)
				{
					packetsIncoming.position--;
					final int type = packetsIncoming.readUnsignedShort();
					final int objX = sectionX + packetsIncoming.readByte();
					final int objY = sectionY + packetsIncoming.readByte();
					final int direction = packetsIncoming.readByte();
					int newCount = 0;
					for (int index = 0; index < wallObjectCount; index++)
					{
						if ((objX != wallObjectX[index]) || (objY != wallObjectY[index])
						        || (direction != wallObjectDirection[index]))
						{
							if (newCount != index)
							{
								wallObjectModelArray[newCount] = wallObjectModelArray[index];
								wallObjectModelArray[newCount].anInt288 = newCount + 10000;
								wallObjectX[newCount] = wallObjectX[index];
								wallObjectY[newCount] = wallObjectY[index];
								wallObjectDirection[newCount] = wallObjectDirection[index];
								wallObjectType[newCount] = wallObjectType[index];
							}
							newCount++;
						}
						else
						{
							gameCamera.removeModel(wallObjectModelArray[index]);
							engineHandle.method42(wallObjectDirection[index], wallObjectX[index], wallObjectType[index],
							        wallObjectY[index]);
						}
					}
					wallObjectCount = newCount;
					if (type != 65535)
					{
						engineHandle.method15(direction, objX, type, objY);
						final Model model = method506(false, wallObjectCount, type, objX, objY, direction);
						wallObjectModelArray[wallObjectCount] = model;
						wallObjectX[wallObjectCount] = objX;
						wallObjectY[wallObjectCount] = objY;
						wallObjectType[wallObjectCount] = type;
						wallObjectDirection[wallObjectCount++] = direction;
					}
				}
				else
				{
					int i_521_ = 0;
					final int i_522_ = (sectionX + packetsIncoming.readByte()) >> 3;
					final int i_523_ = (sectionY - -packetsIncoming.readByte()) >> 3;
					for (int i_524_ = 0; wallObjectCount > i_524_; i_524_++)
					{
						final int i_525_ = (wallObjectX[i_524_] >> 3) + -i_522_;
						final int i_526_ = (wallObjectY[i_524_] >> 3) + -i_523_;
						if ((i_525_ != 0) || (i_526_ != 0))
						{
							if (i_524_ != i_521_)
							{
								wallObjectModelArray[i_521_] = wallObjectModelArray[i_524_];
								wallObjectModelArray[i_521_].anInt288 = i_521_ - -10000;
								wallObjectX[i_521_] = wallObjectX[i_524_];
								wallObjectY[i_521_] = wallObjectY[i_524_];
								wallObjectDirection[i_521_] = wallObjectDirection[i_524_];
								wallObjectType[i_521_] = wallObjectType[i_524_];
							}
							i_521_++;
						}
						else
						{
							gameCamera.removeModel(wallObjectModelArray[i_524_]);
							engineHandle.method42(wallObjectDirection[i_524_], wallObjectX[i_524_], wallObjectType[i_524_],
							        wallObjectY[i_524_]);
						}
					}
					wallObjectCount = i_521_;
				}
			}
		}
		else if (command == 79)
		{
			lastNpcCount = npcCount;
			npcCount = 0;
			for (int index = 0; index < lastNpcCount; index++)
			{
				lastNpcArray[index] = npcArray[index];
			}
			packetsIncoming.method454(i + -1158);
			final int newNpcCount = packetsIncoming.method456(8);
			for (int index = 0; index < newNpcCount; index++)
			{
				final Mob newNpc = lastNpcArray[index];
				final int npcNeedsUpdate = packetsIncoming.method456(1);
				if (npcNeedsUpdate != 0)
				{
					final int i32 = packetsIncoming.method456(1);
					if (i32 != 0)
					{
						final int nextSpriteOffset = packetsIncoming.method456(2);
						if (nextSpriteOffset == 3)
						{
							continue;
						}
						newNpc.nextSprite = ((nextSpriteOffset << 2) + packetsIncoming.method456(2));
					}
					else
					{
						final int nextSprite = packetsIncoming.method456(3);
						int waypointCurrent = newNpc.waypointCurrentIndex;
						int waypointX = newNpc.waypointsX[waypointCurrent];
						int waypointY = newNpc.waypointsY[waypointCurrent];
						if ((nextSprite == 2) || (nextSprite == 1) || (nextSprite == 3))
						{
							waypointX += tileSize;
						}
						if ((nextSprite == 6) || (nextSprite == 5) || (nextSprite == 7))
						{
							waypointX -= tileSize;
						}
						if ((nextSprite == 4) || (nextSprite == 3) || (nextSprite == 5))
						{
							waypointY += tileSize;
						}
						newNpc.waypointCurrentIndex = waypointCurrent = (waypointCurrent + 1) % 10;
						newNpc.nextSprite = nextSprite;
						if ((nextSprite == 0) || (nextSprite == 1) || (nextSprite == 7))
						{
							waypointY -= tileSize;
						}
						newNpc.waypointsX[waypointCurrent] = waypointX;
						newNpc.waypointsY[waypointCurrent] = waypointY;
					}
				}
				npcArray[npcCount++] = newNpc;
			}
			while ((packetsIncoming.method457() + 34) < length*8)
			{
				final int serverIndex = packetsIncoming.method456(12);
				int i_538_ = packetsIncoming.method456(5);
				if (i_538_ > 15)
				{
					i_538_ -= 32;
				}
				int i_539_ = packetsIncoming.method456(5);
				if (15 < i_539_)
				{
					i_539_ -= 32;
				}
				final int nextSprite = packetsIncoming.method456(4);
				final int x = ((i_538_ + sectionX) * tileSize) + 64;
				final int y = ((i_539_ + sectionY) * tileSize) + 64;
				int type = packetsIncoming.method456(10);
				if (type >= EntityHandler.npcdef_count)
				{
					type = 24;
				}
				addNpc(y, serverIndex, type, nextSprite, x);
			}
			packetsIncoming.method458();
		}
		else if (command == 104)
		{
			final int i_544_ = packetsIncoming.readUnsignedShort();
			for (int i_545_ = 0; i_544_ > i_545_; i_545_++)
			{
				final int i_546_ = packetsIncoming.readUnsignedShort();
				final Mob class15 = npcRecordArray[i_546_];
				final int i_547_ = packetsIncoming.readUnsignedByte();
				if (i_547_ != 1)
				{
					if (i_547_ == 2)
					{
						final int i_548_ = packetsIncoming.readUnsignedByte();
						final int i_549_ = packetsIncoming.readUnsignedByte();
						final int i_550_ = packetsIncoming.readUnsignedByte();
						if (class15 != null)
						{
							class15.anInt148 = i_550_;
							class15.anInt145 = 200;
							class15.anInt157 = i_548_;
							class15.anInt143 = i_549_;
						}
					}
				}
				else
				{
					final int i_551_ = packetsIncoming.readUnsignedShort();
					if (class15 != null)
					{
						final String string = Class4.method8(packetsIncoming, i + -12);
						class15.aString8 = string;
						class15.anInt165 = 150;
						if (ourPlayer.serverIndex == i_551_)
						{
							displayMessage(0, new StringBuilder().append(EntityHandler.npcdef_name[class15.type])
							        .append(": ").append(class15.aString8).toString(), 3, null, -98, "@yel@", null,
							        false);
						}
					}
				}
			}
		}
		else if (command == 245)
		{
			aBool70 = true;
			final int i_552_ = packetsIncoming.readUnsignedByte();
			anInt953 = i_552_;
			for (int i_553_ = 0; i_553_ < i_552_; i_553_++)
			{
				aStringArray45[i_553_] = packetsIncoming.readString();
			}
		}
		else if (command == 252)
		{
			aBool70 = false;
		}
		else if (command == 25)
		{
			notInWilderness = true;
			serverIndex = packetsIncoming.readUnsignedShort();
			wildX = packetsIncoming.readUnsignedShort();
			wildY = packetsIncoming.readUnsignedShort();
			wildYSubtract = packetsIncoming.readUnsignedShort();
			wildYMultiplier = packetsIncoming.readUnsignedShort();
			wildY -= wildYMultiplier * wildYSubtract;
		}
		else if (command == 156)
		{
			for (int i_554_ = 0; i_554_ < 18; i_554_++)
			{
				anIntArray185[i_554_] = packetsIncoming.readUnsignedByte();
			}
			for (int i_555_ = 0; 18 > i_555_; i_555_++)
			{
				anIntArray200[i_555_] = packetsIncoming.readUnsignedByte();
			}
			for (int i_556_ = 0; i_556_ < 18; i_556_++)
			{
				anIntArray189[i_556_] = packetsIncoming.readInt();
			}
			anInt975 = packetsIncoming.readUnsignedByte();
		}
		else if (command == 153)
		{
			for (int i_557_ = 0; 5 > i_557_; i_557_++)
			{
				anIntArray186[i_557_] = packetsIncoming.readUnsignedByte();
			}
		}
		else if (command == 83)
		{
			playerAliveTimeout = 250;
		}
		else if (command == 211)
		{
			final int i_558_ = (length - 1) / 4;
			for (int i_559_ = 0; i_558_ > i_559_; i_559_++)
			{
				final int i_560_ = ((sectionX + packetsIncoming.method407()) >> 3);
				final int i_561_ = ((sectionY + packetsIncoming.method407()) >> 3);
				int newCount = 0;
				for (int index = 0; index < groundItemCount; index++)
				{
					final int i_564_ = (groundItemX[index] >> 3) - i_560_;
					final int i_565_ = (groundItemY[index] >> 3) - i_561_;
					if ((i_564_ != 0) || (i_565_ != 0))
					{
						if (newCount != index)
						{
							groundItemX[newCount] = groundItemX[index];
							groundItemY[newCount] = groundItemY[index];
							groundItemType[newCount] = groundItemType[index];
							groundItemObjectVar[newCount] = groundItemObjectVar[index];
						}
						newCount++;
					}
				}
				groundItemCount = newCount;
				newCount = 0;
				for (int index = 0; index < objectCount; index++)
				{
					final int i_567_ = (objectX[index] >> 3) - i_560_;
					final int i_568_ = (objectY[index] >> 3) - i_561_;
					if ((i_567_ != 0) || (i_568_ != 0))
					{
						if (index != newCount)
						{
							objectModelArray[newCount] = objectModelArray[index];
							objectModelArray[newCount].anInt288 = newCount;
							objectX[newCount] = objectX[index];
							objectY[newCount] = objectY[index];
							objectType[newCount] = objectType[index];
							objectRotation[newCount] = objectRotation[index];
						}
						newCount++;
					}
					else
					{
						gameCamera.removeModel(objectModelArray[index]);
						engineHandle.updateObjectAnd(objectType[index], objectY[index], objectX[index], -30895);
					}
				}
				objectCount = newCount;
				newCount = 0;
				for (int index = 0; index < wallObjectCount; index++)
				{
					final int i_570_ = (wallObjectX[index] >> 3) - i_560_;
					final int i_571_ = (wallObjectY[index] >> 3) - i_561_;
					if ((i_570_ == 0) && (i_571_ == 0))
					{
						gameCamera.removeModel(wallObjectModelArray[index]);
						engineHandle.method42(wallObjectDirection[index], wallObjectX[index], wallObjectType[index], wallObjectY[index]);
					}
					else
					{
						if (index != newCount)
						{
							wallObjectModelArray[newCount] = wallObjectModelArray[index];
							wallObjectModelArray[newCount].anInt288 = newCount + 10000;
							wallObjectX[newCount] = wallObjectX[index];
							wallObjectY[newCount] = wallObjectY[index];
							wallObjectDirection[newCount] = wallObjectDirection[index];
							wallObjectType[newCount] = wallObjectType[index];
						}
						newCount++;
					}
				}
				wallObjectCount = newCount;
			}
		}
		else if (command == Constants.SPacketID_ShowChangeAppearance)
		{
			showCharacterLookScreen = true;
		}
		else if (command == 92)
		{
			final int i_572_ = packetsIncoming.readUnsignedShort();
			if (mobArray[i_572_] != null)
			{
				aString40 = mobArray[i_572_].maybe_displayName;
			}
			aBool68 = false;
			anInt1026 = 0;
			aBool84 = true;
			anInt1049 = 0;
			aBool67 = false;
		}
		else if (command == 128)
		{
			aBool84 = false;
			aBool89 = false;
		}
		else if (command == 97)
		{
			anInt1026 = packetsIncoming.readUnsignedByte();
			for (int i_573_ = 0; anInt1026 > i_573_; i_573_++)
			{
				anIntArray181[i_573_] = packetsIncoming.readUnsignedShort();
				anIntArray209[i_573_] = packetsIncoming.readInt();
			}
			aBool68 = false;
			aBool67 = false;
		}
		else if (command == 162)
		{
			final int i_574_ = packetsIncoming.readUnsignedByte();
			if (i_574_ != 1)
			{
				aBool67 = false;
			}
			else
			{
				aBool67 = true;
			}
		}
		else if (command == 101)
		{
			showShop = true;
			final int i_575_ = packetsIncoming.readUnsignedByte();
			final byte i_576_ = packetsIncoming.readByte();
			shopUnknown1 = packetsIncoming.readUnsignedByte();
			shopUnknown2 = packetsIncoming.readUnsignedByte();
			shopUnknown3 = packetsIncoming.readUnsignedByte();
			for (int i_577_ = 0; 40 > i_577_; i_577_++)
			{
				shopItems[i_577_] = -1;
			}
			for (int i_578_ = 0; i_575_ > i_578_; i_578_++)
			{
				shopItems[i_578_] = packetsIncoming.readUnsignedShort();
				shopItemCount[i_578_] = packetsIncoming.readUnsignedShort();
				anIntArray174[i_578_] = packetsIncoming.readUnsignedShort();
			}
			if (i_576_ == 1)
			{
				int i_579_ = 39;
				for (int i_580_ = 0; (inventoryCount > i_580_) && (i_575_ <= i_579_); i_580_++)
				{
					boolean bool = false;
					for (int i_581_ = 0; i_581_ < 40; i_581_++)
					{
						if (shopItems[i_581_] == inventoryItems[i_580_])
						{
							bool = true;
							break;
						}
					}
					if (inventoryItems[i_580_] == 10)
					{
						bool = true;
					}
					if (!bool)
					{
						shopItems[i_579_] = Class52.bitwiseAnd(inventoryItems[i_580_], 32767);
						shopItemCount[i_579_] = 0;
						anIntArray174[i_579_] = 0;
						i_579_--;
					}
				}
			}
			if ((selectedShopItemIndex >= 0) && (40 > selectedShopItemIndex) && (shopItems[selectedShopItemIndex] != anInt1006))
			{
				selectedShopItemIndex = -1;
				anInt1006 = -2;
			}
		}
		else if (command == 137)
		{
			showShop = false;
		}
		else if (command == 15)
		{
			final byte i_582_ = packetsIncoming.readByte();
			if (i_582_ != 1)
			{
				aBool68 = false;
			}
			else
			{
				aBool68 = true;
			}
		}
		else if (command == 240)
		{
			configAutoCameraAngle = packetsIncoming.readUnsignedByte() == 1;
			configMouseButtons = 1 == packetsIncoming.readUnsignedByte();
			configSoundEffects = 1 == packetsIncoming.readUnsignedByte();
		}
		else if (command == 206)
		{
			for (int i_583_ = 0; i_583_ < (length + -1); i_583_++)
			{
				final boolean bool = 1 == packetsIncoming.readByte();
				if (!aBoolArray11[i_583_] && bool)
				{
					playSound("prayeron");
				}
				if (aBoolArray11[i_583_] && !bool)
				{
					playSound("prayeroff");
				}
				aBoolArray11[i_583_] = bool;
			}
		}
		else if (command == 5)
		{
			for (int i_584_ = 0; i_584_ < 50; i_584_++)
			{
				aBoolArray12[i_584_] = 1 == packetsIncoming.readByte();
			}
		}
		else if (command == 42)
		{
			aBool81 = true;
			anInt952 = packetsIncoming.readUnsignedByte();
			anInt1017 = packetsIncoming.readUnsignedByte();
			for (int i_585_ = 0; anInt952 > i_585_; i_585_++)
			{
				anIntArray177[i_585_] = packetsIncoming.readUnsignedShort();
				anIntArray207[i_585_] = packetsIncoming.method387();
			}
			method589();
		}
		else if (command == 203)
		{
			aBool81 = false;
		}
		else if (command == 33)
		{
			final int i_586_ = packetsIncoming.readUnsignedByte();
			anIntArray189[i_586_] = packetsIncoming.readInt();
		}
		else
		{
			if (i != -34)
			{
				anInt960 = -19;
			}
			if (command == 176)
			{
				final int i_587_ = packetsIncoming.readUnsignedShort();
				if (mobArray[i_587_] != null)
				{
					aString32 = mobArray[i_587_].maybe_displayName;
				}
				aBool71 = false;
				aBool59 = false;
				aBool65 = false;
				aBool85 = false;
				aBool75 = false;
				aBool72 = true;
				anInt967 = 0;
				anInt1061 = 0;
				aBool79 = false;
			}
			else if (command == 225)
			{
				aBool92 = false;
				aBool72 = false;
			}
			else if (command == 20)
			{
				aBool63 = false;
				aBool89 = true;
				aBool84 = false;
				aString31 = packetsIncoming.readString();
				anInt998 = packetsIncoming.readUnsignedByte();
				for (int i_588_ = 0; i_588_ < anInt998; i_588_++)
				{
					anIntArray159[i_588_] = packetsIncoming.readUnsignedShort();
					anIntArray220[i_588_] = packetsIncoming.readInt();
				}
				anInt1038 = packetsIncoming.readUnsignedByte();
				for (int i_589_ = 0; i_589_ < anInt1038; i_589_++)
				{
					anIntArray172[i_589_] = packetsIncoming.readUnsignedShort();
					anIntArray160[i_589_] = packetsIncoming.readInt();
				}
			}
			else if (command == 6)
			{
				anInt967 = packetsIncoming.readUnsignedByte();
				for (int i_590_ = 0; anInt967 > i_590_; i_590_++)
				{
					anIntArray212[i_590_] = packetsIncoming.readUnsignedShort();
					anIntArray193[i_590_] = packetsIncoming.readInt();
				}
				aBool75 = false;
				aBool59 = false;
			}
			else if (command == 30)
			{
				if (1 != packetsIncoming.readUnsignedByte())
				{
					aBool85 = false;
				}
				else
				{
					aBool85 = true;
				}
				if (1 == packetsIncoming.readUnsignedByte())
				{
					aBool65 = true;
				}
				else
				{
					aBool65 = false;
				}
				if (1 == packetsIncoming.readUnsignedByte())
				{
					aBool71 = true;
				}
				else
				{
					aBool71 = false;
				}
				if (packetsIncoming.readUnsignedByte() == 1)
				{
					aBool79 = true;
				}
				else
				{
					aBool79 = false;
				}
				aBool75 = false;
				aBool59 = false;
			}
			else if (command == 249)
			{
				final int i_591_ = packetsIncoming.readUnsignedByte();
				final int i_592_ = packetsIncoming.readUnsignedShort();
				final int i_593_ = packetsIncoming.method387();
				if (i_593_ == 0)
				{
					anInt952--;
					for (int i_594_ = i_591_; i_594_ < anInt952; i_594_++)
					{
						anIntArray177[i_594_] = anIntArray177[i_594_ + 1];
						anIntArray207[i_594_] = anIntArray207[i_594_ + 1];
					}
				}
				else
				{
					anIntArray177[i_591_] = i_592_;
					anIntArray207[i_591_] = i_593_;
					if (i_591_ >= anInt952)
					{
						anInt952 = i_591_ + 1;
					}
				}
				method589();
			}
			else if (command == Constants.SPacketID_InventorySetSlot)
			{
				int count = 1;
				final int invIndex = packetsIncoming.readUnsignedByte();
				final int i_597_ = packetsIncoming.readUnsignedShort();
				if (EntityHandler.itemdef_isUnstackable[i_597_ & 0x7fff] == 0)
				{
					count = packetsIncoming.method387();
				}
				inventoryItems[invIndex] = i_597_ & 0x7FFF;
				wearing[invIndex] = i_597_ / 32768;
				inventoryItemsCount[invIndex] = count;
				if (invIndex >= inventoryCount)
				{
					inventoryCount = invIndex + 1;
				}
			}
			else if (command == Constants.SPacketID_InventoryRemoveSlot)
			{
				final int invOffset = packetsIncoming.readUnsignedByte();
				inventoryCount--;
				for (int invIndex = invOffset; invIndex < inventoryCount; invIndex++)
				{
					inventoryItems[invIndex] = inventoryItems[invIndex + 1];
					inventoryItemsCount[invIndex] = inventoryItemsCount[invIndex + 1];
					wearing[invIndex] = wearing[invIndex + 1];
				}
			}
			else if (command == 159)
			{
				final int i_600_ = packetsIncoming.readUnsignedByte();
				anIntArray185[i_600_] = packetsIncoming.readUnsignedByte();
				anIntArray200[i_600_] = packetsIncoming.readUnsignedByte();
				anIntArray189[i_600_] = packetsIncoming.readInt();
			}
			else if (command == 253)
			{
				final byte i_601_ = packetsIncoming.readByte();
				if (i_601_ != 1)
				{
					aBool75 = false;
				}
				else
				{
					aBool75 = true;
				}
			}
			else if (command == 210)
			{
				final byte i_602_ = packetsIncoming.readByte();
				if (i_602_ != 1)
				{
					aBool59 = false;
				}
				else
				{
					aBool59 = true;
				}
			}
			else if (command == 172)
			{
				aBool66 = false;
				aBool92 = true;
				aBool72 = false;
				aString37 = packetsIncoming.readString();
				anInt1053 = packetsIncoming.readUnsignedByte();
				for (int i_603_ = 0; anInt1053 > i_603_; i_603_++)
				{
					anIntArray221[i_603_] = packetsIncoming.readUnsignedShort();
					anIntArray206[i_603_] = packetsIncoming.readInt();
				}
				anInt992 = packetsIncoming.readUnsignedByte();
				for (int i_604_ = 0; anInt992 > i_604_; i_604_++)
				{
					anIntArray215[i_604_] = packetsIncoming.readUnsignedShort();
					anIntArray183[i_604_] = packetsIncoming.readInt();
				}
				anInt995 = packetsIncoming.readUnsignedByte();
				anInt1004 = packetsIncoming.readUnsignedByte();
				anInt1025 = packetsIncoming.readUnsignedByte();
				anInt1034 = packetsIncoming.readUnsignedByte();
			}
			else if (command == Constants.SPacketID_PlaySound)
			{
				final String string = packetsIncoming.readString();
				playSound(string);
			}
			else if (command == 36)
			{
				if (anInt1012 < 50)
				{
					final int i_605_ = packetsIncoming.readUnsignedByte();
					final int i_606_ = packetsIncoming.readByte() + sectionX;
					final int i_607_ = packetsIncoming.readByte() - -sectionY;
					anIntArray214[anInt1012] = i_605_;
					anIntArray208[anInt1012] = 0;
					anIntArray188[anInt1012] = i_606_;
					anIntArray204[anInt1012] = i_607_;
					anInt1012++;
				}
			}
			else if (command == Constants.SPacketID_ShowWelcomeBox)
			{
				if (!aBool77)
				{
					welcomeLastLoggedInIp = packetsIncoming.readInt();
					welcomeLastLoggedInDays = packetsIncoming.readUnsignedShort();
					welcomeRecoverySetDays = packetsIncoming.readUnsignedByte();
					unreadMessages = packetsIncoming.readUnsignedShort();
					aBool77 = true;
					aString36 = null;
					showWelcomeBox = true;
				}
			}
			else if (command == 89)
			{
				aString38 = packetsIncoming.readString();
				aBool74 = false;
				showServerMessageBox = true;
			}
			else if (command == 222)
			{
				aString38 = packetsIncoming.readString();
				aBool74 = true;
				showServerMessageBox = true;
			}
			else if (command == 114)
			{
				anInt950 = packetsIncoming.readUnsignedShort();
			}
			else if (command == 117)
			{
				if (!aBool69)
				{
					anInt1055 = anInt950;
				}
				this.aString26 = "";
				aBool69 = true;
				this.aString27 = "";
				gameGraphics.method360(packetsIncoming.buffer, anInt925 + 1);
				aString35 = null;
			}
			else if (command == 244)
			{
				anInt1055 = packetsIncoming.readUnsignedShort();
			}
			else if (command == 84)
			{
				aBool69 = false;
			}
			else if (command == 194)
			{
				aString35 = "Incorrect - Please wait...";
			}
			else if (command == Constants.SPacketID_SystemUpdate)
			{
				systemUpdate = packetsIncoming.readUnsignedShort() * 32;
			}
			else if (command != 213)
			{
				Class9.method61(null, 112,
				        new StringBuilder().append("T1 - ").append(command).append(" - ").append(length).toString());
				sendLogoutPacket(true);
			}
		}
	}

	private Mob addPlayer(final int y, final int x, final int serverIndex, final int sprite)
	{
		if (mobArray[serverIndex] == null)
		{
			mobArray[serverIndex] = new Mob();
			mobArray[serverIndex].serverIndex = serverIndex;
		}
		final Mob mob = mobArray[serverIndex];
		boolean foundExisting = false;
		for (int index = 0; index < lastPlayerCount; index++)
		{
			if (serverIndex == lastPlayerArray[index].serverIndex)
			{
				foundExisting = true;
				break;
			}
		}
		if (foundExisting)
		{
			mob.nextSprite = sprite;
			int currentIndex = mob.waypointCurrentIndex;
			if ((mob.waypointsX[currentIndex] != x) || (mob.waypointsY[currentIndex] != y))
			{
				mob.waypointCurrentIndex = currentIndex = (currentIndex + 1) % 10;
				mob.waypointsX[currentIndex] = x;
				mob.waypointsY[currentIndex] = y;
			}
		}
		else
		{
			mob.waypointCurrentIndex = 0;
			mob.waypointsX[0] = mob.currentX = x;
			mob.serverIndex = serverIndex;
			mob.waypointEndSprite = 0;
			mob.stepFrame = 0;
			mob.waypointsY[0] = mob.currentY = y;
			mob.nextSprite = mob.currentSprite = sprite;
		}
		playerArray[playerCount++] = mob;
		return mob;
	}

	private void loadTextures()
	{
		final byte[] is = unpackData("Textures", 50, 11);
		if (is == null)
		{
			lastLoadedNull = true;
		}
		else
		{
			final byte[] is_614_ = Camera.loadData(is, 0, "index.dat");
			gameCamera.method293(11, 13803, EntityHandler.texturedef_count, 7);
			int i_615_ = 0;
			for (/**/; EntityHandler.texturedef_count > i_615_; i_615_++)
			{
				final String string = EntityHandler.texturedef_name[i_615_];
				byte[] is_617_ = Camera.loadData(is, 0, new StringBuilder().append(string).append(".dat").toString());
				gameGraphics.method350(anInt925, is_614_, is_617_, 1);
				gameGraphics.method321(0, 16711935, 128, 128, 0, 1);
				gameGraphics.drawPicture(anInt925, 0, 0);
				final int i_618_ = gameGraphics.anIntArray125[anInt925];
				final String string_619_ = EntityHandler.texturedef_animationName[i_615_];
				if ((string_619_ != null) && (0 < string_619_.length()))
				{
					is_617_ = Camera.loadData(is, 0,
					        new StringBuilder().append(string_619_).append(".dat").toString());
					gameGraphics.method350(anInt925, is_614_, is_617_, 1);
					gameGraphics.drawPicture(anInt925, 0, 0);
				}
				gameGraphics.method353(0, i_618_, 0, i_618_, i_615_ + anInt910);
				final int i_620_ = i_618_ * i_618_;
				for (int i_621_ = 0; i_620_ > i_621_; i_621_++)
				{
					if ((gameGraphics.anIntArrayArray20[i_615_ + anInt910][i_621_]) == 65280)
					{
						gameGraphics.anIntArrayArray20[i_615_ + anInt910][i_621_] = 16711935;
					}
				}
				gameGraphics.method306(i_615_ + anInt910);
				gameCamera.method271(i_615_, (i_618_ / 64) + -1, false,
				        (gameGraphics.anIntArrayArray19[i_615_ + anInt910]),
				        (gameGraphics.aByteArrayArray13[anInt910 - -i_615_]));
			}
		}
	}

	@Override
	public void init()
	{
		try
		{
			Class27_Sub1_Sub1.portOffset = Integer.parseInt(getParameter("nodeid"));
			Class34.aClass38_5 = Mob.method113(Integer.parseInt(getParameter("modewhere")));
			if (Class34.aClass38_5 == null)
			{
				Class34.aClass38_5 = Class22.aClass38_3;
			}
			RuntimeException_Sub1.aClass24_4 = Class45.method304(Integer.parseInt(getParameter("modewhat")), 0);
			if (RuntimeException_Sub1.aClass24_4 == null)
			{
				RuntimeException_Sub1.aClass24_4 = Class42.aClass24_1;
			}
			super.method479(32 - -(RuntimeException_Sub1.aClass24_4.anInt293), windowHeight + 12, GameWindowMiddleMan.clientVersion,
			        maybe_windowWidth);
		}
		catch (final RuntimeException runtimeexception)
		{
			throw Class21.method133(runtimeexception, "client.init()");
		}
	}

	private void loadEntities()
	{
		final byte[] is = unpackData("people and monsters", 30, 1);
		if (is == null)
		{
			lastLoadedNull = true;
		}
		else
		{
			final byte[] is_624_ = Camera.loadData(is, 0, "index.dat");
			byte[] is_625_ = null;
			byte[] is_626_ = null;
			if (isMembers)
			{
				is_625_ = unpackData("member graphics", 45, 2);
				if (is_625_ == null)
				{
					lastLoadedNull = true;
					return;
				}
				is_626_ = Camera.loadData(is_625_, 0, "index.dat");
			}
			anInt1050 = 0;
			int i_627_ = 0;
			anInt946 = anInt1050;
			while_14_: for (int i_628_ = 0; EntityHandler.animationdef_count > i_628_; i_628_++)
			{
				final String string = EntityHandler.animationdef_name[i_628_];
				for (int i_629_ = 0; i_629_ < i_628_; i_629_++)
				{
					if (EntityHandler.animationdef_name[i_629_].equalsIgnoreCase(string))
					{
						EntityHandler.animationdef_number[i_628_] = EntityHandler.animationdef_number[i_629_];
						continue while_14_;
					}
				}
				byte[] is_630_ = Camera.loadData(is, 0, new StringBuilder().append(string).append(".dat").toString());
				byte[] is_631_ = is_624_;
				if ((is_630_ == null) && isMembers)
				{
					is_631_ = is_626_;
					is_630_ = Camera.loadData(is_625_, 0,
					        new StringBuilder().append(string).append(".dat").toString());
				}
				if (is_630_ != null)
				{
					gameGraphics.method350(anInt946, is_631_, is_630_, 15);
					i_627_ += 15;
					if (EntityHandler.animationdef_hasA[i_628_] == 1)
					{
						byte[] is_632_ = Camera.loadData(is, 0,
						        new StringBuilder().append(string).append("a.dat").toString());
						is_631_ = is_624_;
						if ((is_632_ == null) && isMembers)
						{
							is_631_ = is_626_;
							is_632_ = Camera.loadData(is_625_, 0,
							        new StringBuilder().append(string).append("a.dat").toString());
						}
						gameGraphics.method350(anInt946 - -15, is_631_, is_632_, 3);
						i_627_ += 3;
					}
					if (EntityHandler.animationdef_hasF[i_628_] == 1)
					{
						is_631_ = is_624_;
						byte[] is_633_ = Camera.loadData(is, 0,
						        new StringBuilder().append(string).append("f.dat").toString());
						if ((is_633_ == null) && isMembers)
						{
							is_633_ = Camera.loadData(is_625_, 0,
							        new StringBuilder().append(string).append("f.dat").toString());
							is_631_ = is_626_;
						}
						i_627_ += 9;
						gameGraphics.method350(anInt946 - -18, is_631_, is_633_, 9);
					}
					if (EntityHandler.animationdef_genderModel[i_628_] != 0)
					{
						for (int i_634_ = anInt946; i_634_ < (anInt946 + 27); i_634_++)
						{
							gameGraphics.method364(i_634_);
						}
					}
				}
				EntityHandler.animationdef_number[i_628_] = anInt946;
				anInt946 += 27;
			}
			System.out.println(
			        new StringBuilder().append("Loaded: ").append(i_627_).append(" frames of animation").toString());
		}
	}

	private boolean method552(final int i, final boolean bool, final int i_635_, int i_636_, final int i_637_,
	        final int i_638_, int i_639_, final boolean bool_640_, final boolean bool_641_)
	{
		int i_642_ = engineHandle.method46(i, i_635_, bool_641_, i_639_, i_636_, anIntArray155, i_637_, i_638_,
		        anIntArray157, (byte) -108);
		if (i_642_ == -1)
		{
			if (!bool)
			{
				return false;
			}
			i_642_ = 1;
			anIntArray157[0] = i_637_;
			anIntArray155[0] = i_638_;
		}
		i_642_--;
		i_639_ = anIntArray157[i_642_];
		i_636_ = anIntArray155[i_642_];
		if (bool)
		{
			streamClass.createPacket(Constants.CPacketID_RequestInteractWalk);
		}
		else
		{
			streamClass.createPacket(Constants.CPacketID_RequestWalk);
		}
		i_642_--;
		streamClass.aClass27_Sub1_Sub1_1.putShort(i_639_ + areaX);
		streamClass.aClass27_Sub1_Sub1_1.putShort(i_636_ + areaY);
		if (bool && (i_642_ == -1) && (((i_639_ + areaX) % 5) == 0))
		{
			i_642_ = 0;
		}
		for (int index = i_642_; (index >= 0) && (index > (i_642_ - 25)); index--)
		{
			streamClass.aClass27_Sub1_Sub1_1.put(anIntArray157[index] - i_639_);
			streamClass.aClass27_Sub1_Sub1_1.put(-i_636_ + anIntArray155[index]);
		}
		if (bool_640_ != true)
		{
			combatTimeout = -99;
		}
		streamClass.finishPacket();
		actionPictureType = -24;
		anInt854 = this.mouseX;
		anInt888 = this.mouseY;
		return true;
	}

	private void loadConfig()
	{
		final byte[] data = unpackData("Configuration", 10, 0);
		if (data == null)
		{
			lastLoadedNull = true;
		}
		else
		{
			EntityHandler.load(data, isMembers);
		}
	}

	private void method555()
	{
		int i_645_ = -1;
		if ((anInt887 != 0) && aBool90)
		{
			i_645_ = aClass29_3.method197(this.mouseX, this.mouseY, anInt1063, anInt1014);
		}
		if (i_645_ < 0)
		{
			if (anInt971 == 0)
			{
				if ((anInt887 == 1) && (anInt1036 == 0))
				{
					anInt1036 = 1;
				}
				final int i_646_ = this.mouseX + -22;
				final int i_647_ = this.mouseY + -36;
				if ((0 > i_646_) || (i_647_ < 0) || (i_646_ >= 468) || (262 <= i_647_))
				{
					if (anInt887 != 0)
					{
						aBool72 = false;
						streamClass.createPacket(197);
						streamClass.finishPacket();
					}
				}
				else
				{
					if (anInt1036 > 0)
					{
						if ((i_646_ > 216) && (i_647_ > 30) && (i_646_ < 462) && (i_647_ < 235))
						{
							final int i_648_ = ((((i_647_ + -31) / 34) * 5) + ((i_646_ - 217) / 49));
							if ((i_648_ >= 0) && (i_648_ < inventoryCount))
							{
								method524(0, i_648_, -1);
							}
						}
						if ((8 < i_646_) && (i_647_ > 30) && (i_646_ < 205) && (i_647_ < 129))
						{
							final int i_649_ = (((i_646_ + -9) / 49) - -(((i_647_ + -31) / 34) * 4));
							if ((i_649_ >= 0) && (anInt1061 > i_649_))
							{
								method538(-1, i_649_);
							}
						}
						boolean bool = false;
						if ((i_646_ >= 93) && (i_647_ >= 221) && (i_646_ <= 104) && (i_647_ <= 232))
						{
							bool = true;
							aBool85 = !aBool85;
						}
						if ((i_646_ >= 93) && (240 <= i_647_) && (104 >= i_646_) && (251 >= i_647_))
						{
							bool = true;
							aBool65 = !aBool65;
						}
						if ((191 <= i_646_) && (221 <= i_647_) && (202 >= i_646_) && (232 >= i_647_))
						{
							aBool71 = !aBool71;
							bool = true;
						}
						if ((191 <= i_646_) && (i_647_ >= 240) && (i_646_ <= 202) && (251 >= i_647_))
						{
							aBool79 = !aBool79;
							bool = true;
						}
						if (bool)
						{
							streamClass.createPacket(8);
							streamClass.aClass27_Sub1_Sub1_1.put(aBool85 ? 1 : 0);
							streamClass.aClass27_Sub1_Sub1_1.put(!aBool65 ? 0 : 1);
							streamClass.aClass27_Sub1_Sub1_1.put(!aBool71 ? 0 : 1);
							streamClass.aClass27_Sub1_Sub1_1.put(!aBool79 ? 0 : 1);
							streamClass.finishPacket();
							aBool59 = false;
							aBool75 = false;
						}
						if ((i_646_ >= 217) && (i_647_ >= 238) && (i_646_ <= 286) && (i_647_ <= 259))
						{
							aBool59 = true;
							streamClass.createPacket(176);
							streamClass.finishPacket();
						}
						if ((i_646_ >= 394) && (i_647_ >= 238) && (463 > i_646_) && (259 > i_647_))
						{
							aBool72 = false;
							streamClass.createPacket(197);
							streamClass.finishPacket();
						}
						anInt887 = 0;
						anInt1036 = 0;
					}
					if (anInt887 == 2)
					{
						if ((216 < i_646_) && (i_647_ > 30) && (i_646_ < 462) && (235 > i_647_))
						{
							final int i_650_ = aClass29_1.method207();
							final int i_651_ = aClass29_1.method210(0);
							aBool61 = true;
							anInt984 = this.mouseY + -7;
							anInt955 = this.mouseX + -(i_650_ / 2);
							if (0 > anInt984)
							{
								anInt984 = 0;
							}
							if (0 > anInt955)
							{
								anInt955 = 0;
							}
							if (510 < (anInt955 - -i_650_))
							{
								anInt955 = -i_650_ + 510;
							}
							if ((anInt984 - -i_651_) > 315)
							{
								anInt984 = -i_651_ + 315;
							}
							final int i_652_ = (((i_646_ + -217) / 49) + (((i_647_ + -31) / 34) * 5));
							if ((i_652_ >= 0) && (inventoryCount > i_652_))
							{
								final int i_653_ = inventoryItems[i_652_];
								aBool90 = true;
								aClass29_3.method190();
								aClass29_3.method195("Stake 1", i_653_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_653_]).toString(), 0, 1, 3);
								aClass29_3.method195("Stake 5", i_653_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_653_]).toString(), 0, 5, 3);
								aClass29_3.method195("Stake 10", i_653_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_653_]).toString(), 0, 10, 3);
								aClass29_3.method195("Stake All", i_653_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_653_]).toString(), 0, -1, 3);
								aClass29_3.method195("Stake X", i_653_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_653_]).toString(), 0, -2, 3);
								final int i_654_ = aClass29_3.method207();
								final int i_655_ = aClass29_3.method210(0);
								anInt1063 = this.mouseY + -7;
								anInt1014 = this.mouseX + -(i_654_ / 2);
								if (anInt1014 < 0)
								{
									anInt1014 = 0;
								}
								if (0 > anInt1063)
								{
									anInt1063 = 0;
								}
								if (510 < (i_654_ + anInt1014))
								{
									anInt1014 = -i_654_ + 510;
								}
								if (315 < (i_655_ + anInt1063))
								{
									anInt1063 = -i_655_ + 315;
								}
							}
						}
						if ((8 < i_646_) && (30 < i_647_) && (i_646_ < 205) && (i_647_ < 133))
						{
							final int i_656_ = ((i_646_ + -9) / 49) + (((i_647_ + -31) / 34) * 4);
							if ((i_656_ >= 0) && (i_656_ < anInt1061))
							{
								final int i_657_ = anIntArray182[i_656_];
								aBool90 = true;
								aClass29_3.method190();
								aClass29_3.method195("Remove 1", i_657_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_657_]).toString(), 0, 1, 4);
								aClass29_3.method195("Remove 5", i_657_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_657_]).toString(), 0, 5, 4);
								aClass29_3.method195("Remove 10", i_657_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_657_]).toString(), 0, 10, 4);
								aClass29_3.method195("Remove All", i_657_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_657_]).toString(), 0, -1, 4);
								aClass29_3.method195("Remove X", i_657_, new StringBuilder().append("@lre@")
								        .append(EntityHandler.itemdef_name[i_657_]).toString(), 0, -2, 4);
								final int i_658_ = aClass29_3.method207();
								final int i_659_ = aClass29_3.method210(0);
								anInt1063 = this.mouseY + -7;
								anInt1014 = this.mouseX + -(i_658_ / 2);
								if (anInt1014 < 0)
								{
									anInt1014 = 0;
								}
								if (anInt1063 < 0)
								{
									anInt1063 = 0;
								}
								if ((i_658_ + anInt1014) > 510)
								{
									anInt1014 = -i_658_ + 510;
								}
								if ((i_659_ + anInt1063) > 315)
								{
									anInt1063 = -i_659_ + 315;
								}
							}
						}
						anInt887 = 0;
					}
					if (aBool90)
					{
						final int i_660_ = aClass29_3.method207();
						final int i_661_ = aClass29_3.method210(0);
						if ((this.mouseX < (anInt1014 + -10)) || (this.mouseY < (anInt1063 + -10))
						        || ((i_660_ + anInt1014 + 10) < this.mouseX)
						        || (((i_661_ - -10) + anInt1063) < this.mouseY))
						{
							aBool90 = false;
						}
					}
				}
			}
		}
		else
		{
			aBool90 = false;
			anInt887 = 0;
			final int i_662_ = aClass29_3.method203(0, i_645_);
			final int i_663_ = aClass29_3.method214(i_645_);
			int i_664_ = -1;
			int i_665_ = 0;
			if (i_662_ != 3)
			{
				for (int i_666_ = 0; anInt1061 > i_666_; i_666_++)
				{
					if (i_663_ == anIntArray182[i_666_])
					{
						if (0 > i_664_)
						{
							i_664_ = i_666_;
						}
						if (EntityHandler.itemdef_isUnstackable[i_663_] != 0)
						{
							i_665_++;
						}
						else
						{
							i_665_ = anIntArray198[i_666_];
							break;
						}
					}
				}
			}
			else
			{
				for (int i_667_ = 0; i_667_ < inventoryCount; i_667_++)
				{
					if (i_663_ == inventoryItems[i_667_])
					{
						if (0 > i_664_)
						{
							i_664_ = i_667_;
						}
						if (EntityHandler.itemdef_isUnstackable[i_663_] == 0)
						{
							i_665_ = inventoryItemsCount[i_667_];
							break;
						}
						i_665_++;
					}
				}
			}
			if (0 <= i_664_)
			{
				int i_668_ = aClass29_3.method186(i_645_);
				if (i_668_ != -2)
				{
					if (i_668_ == -1)
					{
						i_668_ = i_665_;
					}
					if (i_662_ != 3)
					{
						method538(i_668_, i_664_);
					}
					else
					{
						method524(0, i_664_, i_668_);
					}
				}
				else
				{
					anInt1011 = i_664_;
					if (i_662_ == 3)
					{
						method516(Class27_Sub1_Sub1.aStringArray39, 7, true);
					}
					else
					{
						method516(Class27.aStringArray22, 8, true);
					}
				}
			}
		}
		if (aBool72)
		{
			final int i_669_ = 22;
			final int i_670_ = 36;
			gameGraphics.method321(i_670_, 13175581, 12, 468, i_669_, 1);
			final int i_671_ = 10000536;
			gameGraphics.method327(i_669_, i_670_ + 12, 468, 160, 90, i_671_, 18);
			gameGraphics.method327(i_669_, i_670_ + 30, 8, 160, 120, i_671_, 248);
			gameGraphics.method327(i_669_ - -205, i_670_ + 30, 11, 160, 71, i_671_, 248);
			gameGraphics.method327(i_669_ - -462, i_670_ - -30, 6, 160, 120, i_671_, 248);
			gameGraphics.method327(i_669_ + 8, i_670_ + 99, 197, 160, 99, i_671_, 24);
			gameGraphics.method327(i_669_ - -8, i_670_ + 192, 197, 160, 70, i_671_, 23);
			gameGraphics.method327(i_669_ + 8, i_670_ - -258, 197, 160, 69, i_671_, 20);
			gameGraphics.method327(i_669_ - -216, i_670_ + 235, 246, 160, 88, i_671_, 43);
			final int i_672_ = 13684944;
			gameGraphics.method327(i_669_ + 8, i_670_ + 30, 197, 160, 101, i_672_, 69);
			gameGraphics.method327(i_669_ + 8, i_670_ + 123, 197, 160, 98, i_672_, 69);
			gameGraphics.method327(i_669_ + 8, i_670_ - -215, 197, 160, 119, i_672_, 43);
			gameGraphics.method327(i_669_ + 216, i_670_ + 30, 246, 160, 112, i_672_, 205);
			for (int i_673_ = 0; 3 > i_673_; i_673_++)
			{
				gameGraphics.method341(197, (i_673_ * 34) + i_670_ + 30, i_669_ + 8, 0);
			}
			for (int i_674_ = 0; 3 > i_674_; i_674_++)
			{
				gameGraphics.method341(197, (i_670_ + 123) - -(i_674_ * 34), i_669_ + 8, 0);
			}
			for (int i_676_ = 0; 7 > i_676_; i_676_++)
			{
				gameGraphics.method341(246, (i_676_ * 34) + i_670_ + 30, i_669_ + 216, 0);
			}
			for (int i_677_ = 0; i_677_ < 6; i_677_++)
			{
				if (i_677_ < 5)
				{
					gameGraphics.method319(0, 69, i_670_ - -30, i_669_ + (i_677_ * 49) + 8);
				}
				if (5 > i_677_)
				{
					gameGraphics.method319(0, 69, i_670_ + 123, i_669_ + (i_677_ * 49) + 8);
				}
				gameGraphics.method319(0, 205, i_670_ + 30, i_669_ + (i_677_ * 49) + 216);
			}
			gameGraphics.method341(197, i_670_ + 215, i_669_ + 8, 0);
			gameGraphics.method341(197, i_670_ + 257, i_669_ + 8, 0);
			gameGraphics.method319(0, 43, i_670_ + 215, i_669_ + 8);
			gameGraphics.method319(0, 43, i_670_ + 215, i_669_ + 204);
			gameGraphics.method324(
			        new StringBuilder().append("Preparing to duel with: ").append(aString32).toString(), 0, 1, 16777215,
			        i_669_ + 1, i_670_ - -10);
			gameGraphics.method324("Your Stake", 0, 4, 16777215, i_669_ + 9, i_670_ - -27);
			gameGraphics.method324("Opponent's Stake", 0, 4, 16777215, i_669_ - -9, i_670_ + 120);
			gameGraphics.method324("Duel Options", 0, 4, 16777215, i_669_ + 9, i_670_ + 212);
			gameGraphics.method324("Your Inventory", 0, 4, 16777215, i_669_ + 216, i_670_ - -27);
			gameGraphics.method324("No retreating", 0, 3, 16776960, i_669_ + 1 + 8, (i_670_ - -215) + 16);
			gameGraphics.method324("No magic", 0, 3, 16776960, i_669_ + 1 + 8, i_670_ + 215 + 35);
			gameGraphics.method324("No prayer", 0, 3, 16776960, (i_669_ - -8) + 102, (i_670_ - -215) + 16);
			gameGraphics.method324("No weapons", 0, 3, 16776960, (i_669_ + 8) - -102, i_670_ + 250);
			gameGraphics.method362(11, i_669_ + 93, 11, 16776960, i_670_ + 221);
			if (aBool85)
			{
				gameGraphics.method321(i_670_ + 215 + 8, 16776960, 7, 7, i_669_ + 95, 1);
			}
			gameGraphics.method362(11, i_669_ + 93, 11, 16776960, i_670_ + 215 + 25);
			if (aBool65)
			{
				gameGraphics.method321(i_670_ + 215 + 27, 16776960, 7, 7, i_669_ + 95, 1);
			}
			gameGraphics.method362(11, i_669_ + 191, 11, 16776960, (i_670_ - -215) + 6);
			if (aBool71)
			{
				gameGraphics.method321(i_670_ + 223, 16776960, 7, 7, i_669_ + 193, 1);
			}
			gameGraphics.method362(11, i_669_ + 191, 11, 16776960, i_670_ + 215 + 25);
			if (aBool79)
			{
				gameGraphics.method321(i_670_ + 242, 16776960, 7, 7, i_669_ + 193, 1);
			}
			if (!aBool59)
			{
				gameGraphics.drawPicture(anInt935 + 25, i_670_ + 238, i_669_ + 217);
			}
			gameGraphics.drawPicture(anInt935 - -26, i_670_ - -238, i_669_ + 394);
			if (aBool75)
			{
				gameGraphics.drawText(16777215, 255, 1, "Other player", i_670_ - -246, i_669_ + 341);
				gameGraphics.drawText(16777215, 255, 1, "has accepted", i_670_ + 256, i_669_ + 341);
			}
			if (aBool59)
			{
				gameGraphics.drawText(16777215, 255, 1, "Waiting for", i_670_ - -246, i_669_ + 217 + 35);
				gameGraphics.drawText(16777215, 255, 1, "other player", i_670_ + 256, i_669_ + 217 + 35);
			}
			for (int i_678_ = 0; i_678_ < inventoryCount; i_678_++)
			{
				final int i_679_ = i_669_ + ((i_678_ % 5) * 49) + 217;
				final int i_680_ = i_670_ + ((i_678_ / 5) * 34) + 31;
				gameGraphics.method348(false, 0, -113, 32, i_680_, 48, 0,
				        (EntityHandler.itemdef_sprite[inventoryItems[i_678_]]) + anInt863,
				        (EntityHandler.itemdef_color[inventoryItems[i_678_]]), i_679_);
				if (EntityHandler.itemdef_isUnstackable[inventoryItems[i_678_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(inventoryItemsCount[i_678_]).toString(),
					        0, 1, 16776960, i_679_ - -1, i_680_ - -10);
				}
			}
			for (int i_681_ = 0; i_681_ < anInt1061; i_681_++)
			{
				final int i_682_ = (((i_681_ % 4) * 49) + 9) - -i_669_;
				final int i_683_ = i_670_ + ((i_681_ / 4) * 34) + 31;
				gameGraphics.method348(false, 0, -124, 32, i_683_, 48, 0,
				        (EntityHandler.itemdef_sprite[anIntArray182[i_681_]]) + anInt863,
				        (EntityHandler.itemdef_color[anIntArray182[i_681_]]), i_682_);
				if (EntityHandler.itemdef_isUnstackable[anIntArray182[i_681_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(anIntArray198[i_681_]).toString(),
					        0, 1, 16776960, i_682_ + 1, i_683_ + 10);
				}
				if ((i_682_ < this.mouseX) && (this.mouseX < (i_682_ + 48)) && (i_683_ < this.mouseY)
				        && ((i_683_ + 32) > this.mouseY))
				{
					gameGraphics.method324(
					        new StringBuilder().append(EntityHandler.itemdef_name[anIntArray182[i_681_]]).append(": @whi@")
					                .append(EntityHandler.itemdef_description[anIntArray182[i_681_]]).toString(),
					        0, 1, 16776960, i_669_ + 8, i_670_ + 273);
				}
			}
			for (int i_684_ = 0; i_684_ < anInt967; i_684_++)
			{
				final int i_685_ = i_669_ + ((i_684_ % 4) * 49) + 9;
				final int i_686_ = (124 - -i_670_) + ((i_684_ / 4) * 34);
				gameGraphics.method348(false, 0, -68, 32, i_686_, 48, 0,
				        (EntityHandler.itemdef_sprite[anIntArray212[i_684_]]) + anInt863,
				        (EntityHandler.itemdef_color[anIntArray212[i_684_]]), i_685_);
				if (EntityHandler.itemdef_isUnstackable[anIntArray212[i_684_]] == 0)
				{
					gameGraphics.method324(new StringBuilder().append("").append(anIntArray193[i_684_]).toString(),
					        0, 1, 16776960, i_685_ - -1, i_686_ + 10);
				}
				if ((this.mouseX > i_685_) && (this.mouseX < (i_685_ - -48)) && (i_686_ < this.mouseY)
				        && (this.mouseY < (i_686_ - -32)))
				{
					gameGraphics.method324(
					        new StringBuilder().append(EntityHandler.itemdef_name[anIntArray212[i_684_]]).append(": @whi@")
					                .append(EntityHandler.itemdef_description[anIntArray212[i_684_]]).toString(),
					        0, 1, 16776960, i_669_ + 8, i_670_ + 273);
				}
			}
			if (aBool90)
			{
				aClass29_3.method204(anInt1014, anInt1063, this.mouseX, this.mouseY);
			}
		}
	}

	private void method556(final boolean bool, final boolean bool_687_)
	{
		int i = gameGraphics.menuDefaultWidth + -199;
		int i_688_ = 36;
		gameGraphics.drawPicture(anInt935 + 3, 3, i + -49);
		final int i_689_ = 196;
		final int i_690_ = 275;
		int i_692_;
		int i_691_ = i_692_ = Class34.method227(bool, 160, 160, 160);
		if (anInt938 != 0)
		{
			i_692_ = Class34.method227(false, 220, 220, 220);
		}
		else
		{
			i_691_ = Class34.method227(false, 220, 220, 220);
		}
		gameGraphics.method327(i, i_688_, i_689_ / 2, 128, 73, i_691_, 24);
		gameGraphics.method327((i_689_ / 2) + i, i_688_, i_689_ / 2, 128, 79, i_692_, 24);
		gameGraphics.method327(i, i_688_ + 24, i_689_, 128, 102, Class34.method227(false, 220, 220, 220),
		        i_690_ - 24);
		gameGraphics.method341(i_689_, i_688_ + 24, i, 0);
		gameGraphics.method319(0, 24, i_688_ + 0, (i_689_ / 2) + i);
		gameGraphics.drawText(0, 255, 4, "Stats", i_688_ - -16, i - -(i_689_ / 4));
		gameGraphics.drawText(0, 255, 4, "Quests", i_688_ - -16, (i_689_ / 2) + (i - -(i_689_ / 4)));
		if (anInt938 == 0)
		{
			int i_693_ = 72;
			int i_694_ = -1;
			gameGraphics.method324("Skills", 0, 3, 16776960, i + 5, i_693_);
			i_693_ += 13;
			for (int i_695_ = 0; i_695_ < 9; i_695_++)
			{
				int i_696_ = 16777215;
				if ((this.mouseX > (i - -3)) && ((i_693_ - 11) <= this.mouseY) && ((i_693_ + 2) > this.mouseY)
				        && (this.mouseX < (i + 90)))
				{
					i_694_ = i_695_;
					i_696_ = 16711680;
				}
				gameGraphics.method324(
				        new StringBuilder().append(skillArray[i_695_]).append(":@yel@")
				                .append(anIntArray185[i_695_]).append("/").append(anIntArray200[i_695_]).toString(),
				        0, 1, i_696_, i + 5, i_693_);
				i_696_ = 16777215;
				if (((i + 90) <= this.mouseX) && (((i_693_ + -11) - 13) <= this.mouseY)
				        && (((i_693_ - -2) + -13) > this.mouseY) && (this.mouseX < (i - -196)))
				{
					i_696_ = 16711680;
					i_694_ = i_695_ - -9;
				}
				gameGraphics.method324(new StringBuilder().append(skillArray[i_695_ + 9]).append(":@yel@")
				        .append(anIntArray185[i_695_ + 9]).append("/").append(anIntArray200[i_695_ + 9]).toString(), 0,
				        1, i_696_, ((i_689_ / 2) + i) - 5, i_693_ + -13);
				i_693_ += 13;
			}
			gameGraphics.method324(new StringBuilder().append("Quest Points:@yel@").append(anInt975).toString(), 0,
			        1, 16777215, (i_689_ / 2) + i + -5, i_693_ + -13);
			i_693_ += 12;
			gameGraphics.method324(
			        new StringBuilder().append("Fatigue: @yel@").append((anInt950 * 100) / 750).append("%").toString(),
			        0, 1, 16777215, i + 5, i_693_ - 13);
			i_693_ += 8;
			gameGraphics.method324("Equipment Status", 0, 3, 16776960, i + 5, i_693_);
			i_693_ += 12;
			for (int i_697_ = 0; i_697_ < 3; i_697_++)
			{
				gameGraphics.method324(new StringBuilder().append(equipmentStatusName[i_697_]).append(":@yel@")
				        .append(anIntArray186[i_697_]).toString(), 0, 1, 16777215, i + 5, i_693_);
				if (i_697_ < 2)
				{
					gameGraphics.method324(
					        new StringBuilder().append(equipmentStatusName[i_697_ + 3]).append(":@yel@")
					                .append(anIntArray186[i_697_ + 3]).toString(),
					        0, 1, 16777215, ((i_689_ / 2) + i) - -25, i_693_);
				}
				i_693_ += 13;
			}
			i_693_ += 6;
			gameGraphics.method341(i_689_, i_693_ + -15, i, 0);
			if (i_694_ != -1)
			{
				gameGraphics.method324(
				        new StringBuilder().append(skillArrayLong[i_694_]).append(" skill").toString(), 0, 1, 16776960,
				        i + 5, i_693_);
				i_693_ += 12;
				int i_698_ = anIntArray161[0];
				for (int i_699_ = 0; 98 > i_699_; i_699_++)
				{
					if (anIntArray189[i_694_] >= anIntArray161[i_699_])
					{
						i_698_ = anIntArray161[i_699_ + 1];
					}
				}
				gameGraphics.method324(
				        new StringBuilder().append("Total xp: ").append(anIntArray189[i_694_] / 4).toString(), 0, 1,
				        16777215, i + 5, i_693_);
				i_693_ += 12;
				gameGraphics.method324(new StringBuilder().append("Next level at: ").append(i_698_ / 4).toString(),
				        0, 1, 16777215, i + 5, i_693_);
			}
			else
			{
				gameGraphics.method324("Overall levels", 0, 1, 16776960, i + 5, i_693_);
				i_693_ += 12;
				int i_700_ = 0;
				for (int i_701_ = 0; 18 > i_701_; i_701_++)
				{
					i_700_ += anIntArray200[i_701_];
				}
				gameGraphics.method324(new StringBuilder().append("Skill total: ").append(i_700_).toString(), 0, 1,
				        16777215, i + 5, i_693_);
				i_693_ += 12;
				gameGraphics.method324("Combat level: " + ourPlayer.level, 0, 1, 16777215, i + 5, i_693_);
				i_693_ += 12;
			}
		}
		if (anInt938 == 1)
		{
			aClass10_6.resetListTextCount(0, anInt1064);
			aClass10_6.method68(null, anInt1064, null, 0, 0, 0, "@whi@Quest-list (green=completed)");
			for (int i_702_ = 0; i_702_ < 50; i_702_++)
			{
				aClass10_6.method68(null, anInt1064, null, 0, i_702_ + 1, 0, new StringBuilder()
				        .append(!aBoolArray12[i_702_] ? "@red@" : "@gre@").append(questListArray[i_702_]).toString());
			}
			aClass10_6.drawMenu(-6);
		}
		if (bool_687_)
		{
			i_688_ = this.mouseY + -36;
			i = (-gameGraphics.menuDefaultWidth - (-199 - this.mouseX));
			if ((0 <= i) && (0 <= i_688_) && (i_689_ > i) && (i_688_ < i_690_))
			{
				if (anInt938 == 1)
				{
					aClass10_6.method85(this.mouseDownButton, i_688_ + 36, this.lastMouseDownButton,
					        ((gameGraphics.menuDefaultWidth) + i) - 199);
				}
				if ((i_688_ <= 24) && (anInt887 == 1))
				{
					if (i < 98)
					{
						anInt938 = 0;
					}
					else if (98 < i)
					{
						anInt938 = 1;
					}
				}
			}
		}
	}

	private boolean method557(int i, final int i_703_, final int i_704_, final int i_705_, final int i_706_,
	        final boolean bool, int i_707_, final boolean bool_708_, final int i_709_)
	{
		int i_710_ = engineHandle.method46(i_709_, i_704_, bool_708_, i_707_, i, anIntArray155, i_703_, i_705_,
		        anIntArray157, (byte) -99);
		if (i_710_ == -1)
		{
			return false;
		}
		i_710_--;
		i_707_ = anIntArray157[i_710_];
		i = anIntArray155[i_710_];
		if (i_706_ <= 111)
		{
			return false;
		}
		if (!bool)
		{
			streamClass.createPacket(187);
		}
		else
		{
			streamClass.createPacket(16);
		}
		i_710_--;
		streamClass.aClass27_Sub1_Sub1_1.putShort(i_707_ + areaX);
		streamClass.aClass27_Sub1_Sub1_1.putShort(areaY + i);
		if (bool && (i_710_ == -1) && (((i_707_ + areaX) % 5) == 0))
		{
			i_710_ = 0;
		}
		for (int i_711_ = i_710_; (0 <= i_711_) && ((i_710_ + -25) < i_711_); i_711_--)
		{
			streamClass.aClass27_Sub1_Sub1_1.put(anIntArray157[i_711_] + -i_707_);
			streamClass.aClass27_Sub1_Sub1_1.put(-i + anIntArray155[i_711_]);
		}
		streamClass.finishPacket();
		actionPictureType = -24;
		anInt888 = this.mouseY;
		anInt854 = this.mouseX;
		return true;
	}

	private void method558(final int i, final int i_712_, final int i_713_, final int i_714_)
	{
		if (i_713_ <= 35)
		{
			method510(null, null, 119);
		}
		if (i != 0)
		{
			if (i == 1)
			{
				method552(i_712_, true, i_714_, sectionY, i_714_ + -1, i_712_, sectionX, true, false);
			}
			else
			{
				method552(i_712_, true, i_714_, sectionY, i_714_, i_712_, sectionX, true, true);
			}
		}
		else
		{
			method552(i_712_, true, i_714_, sectionY, i_714_, i_712_ - 1, sectionX, true, false);
		}
	}

	private void drawGameMenu()
	{
		gameMenu = new Menu(gameGraphics, 10);
		anInt1052 = gameMenu.method74(1, 502, 56, 5, 269, true, 20);
		chatHandle = gameMenu.method76(80, 324, 498, 7, true, 14, 1, 5, false);
		anInt987 = gameMenu.method74(1, 502, 56, 5, 269, true, 20);
		anInt990 = gameMenu.method74(1, 502, 56, 5, 269, true, 20);
		gameMenu.setFocus(chatHandle);
	}

	private void method560(final boolean bool, final int i, final boolean bool_715_, final int i_716_, final int i_717_,
	        final int i_718_)
	{
		method552(i_716_, bool, i_718_, i, i_718_, i_716_, i_717_, bool_715_, false);
	}

	private void method562(final int i)
	{
		if (anInt887 != 0)
		{
			for (int i_722_ = 0; i_722_ < anInt953; i_722_++)
			{
				if ((this.mouseX < gameGraphics.method328(aStringArray45[i_722_], -116, 1))
				        && (this.mouseY > (i_722_ * 12)) && ((12 - -(i_722_ * 12)) > this.mouseY))
				{
					streamClass.createPacket(116);
					streamClass.aClass27_Sub1_Sub1_1.put(i_722_);
					streamClass.finishPacket();
					break;
				}
			}
			aBool70 = false;
			anInt887 = 0;
		}
		else
		{
			if (i != 8409088)
			{
				systemUpdate = 4;
			}
			for (int i_723_ = 0; i_723_ < anInt953; i_723_++)
			{
				int i_724_ = 65535;
				if ((this.mouseX < gameGraphics.method328(aStringArray45[i_723_], i ^ ~0x805065, 1))
				        && (this.mouseY > (i_723_ * 12)) && (this.mouseY < ((i_723_ * 12) + 12)))
				{
					i_724_ = 16711680;
				}
				gameGraphics.method324(aStringArray45[i_723_], i + -8409088, 1, i_724_, 6, (i_723_ * 12) + 12);
			}
		}
	}

	private void playSound(final String string)
	{
		if ((anAClass4_Sub2_1 != null) && !configSoundEffects)
		{
			final int i_726_ = RuntimeException_Sub1.method461(string + ".pcm", soundData);
			final int i_727_ = GameFrame.method487(string + ".pcm", soundData);
			if (i_727_ != 0)
			{
				final AClass3_Sub1 aclass3_sub1 = new AClass3_Sub1(8000, Class28.method180(i_727_, soundData, i_726_), 0, i_727_);
				anAClass4_Sub2_1.method450(aclass3_sub1, 100, 256);
			}
		}
	}

	private boolean isWearing(final int itemId)
	{
		for (int index = 0; index < inventoryCount; index++)
		{
			if ((itemId == inventoryItems[index]) && (wearing[index] == 1))
			{
				return true;
			}
		}
		return false;
	}

	private void method566()
	{
		this.enteredMessage = "";
		this.inputMessage = "";
	}

	private void method567(final int i)
	{
		final int i_731_ = 408;
		final int i_732_ = 334;
		if ((0 < anInt1045) && (anInt982 <= 48))
		{
			anInt1045 = 0;
		}
		if ((anInt1045 > 1) && (96 >= anInt982))
		{
			anInt1045 = 1;
		}
		if ((anInt1045 > 2) && (anInt982 <= 144))
		{
			anInt1045 = 2;
		}
		if ((anInt982 <= anInt983) || (anInt983 < 0))
		{
			anInt983 = -1;
		}
		if ((anInt983 != -1) && (anIntArray210[anInt983] != anInt1031))
		{
			anInt983 = -1;
			anInt1031 = -2;
		}
		if ((anInt971 == 0) && (anInt887 != 0))
		{
			anInt887 = 0;
			int i_733_ = this.mouseX - 256 - -(i_731_ / 2);
			int i_734_ = this.mouseY - (-(i_732_ / 2) + 170);
			if ((i_733_ >= 0) && (i_734_ >= 12) && (i_733_ < 408) && (280 > i_734_))
			{
				int i_735_ = anInt1045 * 48;
				for (int i_736_ = 0; 6 > i_736_; i_736_++)
				{
					for (int i_737_ = 0; 8 > i_737_; i_737_++)
					{
						final int i_738_ = (i_737_ * 49) + 7;
						final int i_739_ = (i_736_ * 34) + 28;
						if ((i_738_ < i_733_) && (i_733_ < (i_738_ + 49)) && (i_734_ > i_739_)
						        && (i_734_ < (i_739_ - -34)) && (anInt982 > i_735_) && (anIntArray210[i_735_] != -1))
						{
							anInt1031 = anIntArray210[i_735_];
							anInt983 = i_735_;
						}
						i_735_++;
					}
				}
				i_733_ = -(i_731_ / 2) + 256;
				i_734_ = -(i_732_ / 2) + 170;
				int i_740_;
				if (0 <= anInt983)
				{
					i_740_ = anIntArray210[anInt983];
				}
				else
				{
					i_740_ = -1;
				}
				if (i_740_ != -1)
				{
					i_735_ = anIntArray184[anInt983];
					if ((i_735_ >= 1) && (this.mouseX >= (i_733_ - -220)) && ((i_734_ + 238) <= this.mouseY)
					        && (this.mouseX < (i_733_ + 250)) && (this.mouseY <= (i_734_ + 249)))
					{
						streamClass.createPacket(22);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(1);
						streamClass.aClass27_Sub1_Sub1_1.putInt(305419896);
						streamClass.finishPacket();
					}
					if ((i_735_ >= 5) && ((i_733_ + 250) <= this.mouseX) && (this.mouseY >= (i_734_ + 238))
					        && ((i_733_ + 280) > this.mouseX) && ((i_734_ - -249) >= this.mouseY))
					{
						streamClass.createPacket(22);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(5);
						streamClass.aClass27_Sub1_Sub1_1.putInt(305419896);
						streamClass.finishPacket();
					}
					if ((10 <= i_735_) && (this.mouseX >= (i_733_ + 280)) && ((i_734_ + 238) <= this.mouseY)
					        && (this.mouseX < (i_733_ + 305)) && ((i_734_ + 249) >= this.mouseY))
					{
						streamClass.createPacket(22);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(10);
						streamClass.aClass27_Sub1_Sub1_1.putInt(305419896);
						streamClass.finishPacket();
					}
					if ((i_735_ >= 50) && (this.mouseX >= (i_733_ + 305)) && ((i_734_ + 238) <= this.mouseY)
					        && ((i_733_ + 335) > this.mouseX) && (this.mouseY <= (i_734_ - -249)))
					{
						streamClass.createPacket(22);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(50);
						streamClass.aClass27_Sub1_Sub1_1.putInt(305419896);
						streamClass.finishPacket();
					}
					if ((this.mouseX >= (i_733_ + 335)) && (this.mouseY >= (i_734_ - -238))
					        && ((i_733_ - -368) > this.mouseX) && (this.mouseY <= (i_734_ + 249)))
					{
						method516(Class43.aStringArray29, 3, true);
					}
					if (((i_733_ + 370) <= this.mouseX) && ((i_734_ + 238) <= this.mouseY)
					        && ((i_733_ + 400) > this.mouseX) && (this.mouseY <= (i_734_ + 249)))
					{
						streamClass.createPacket(22);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(i_735_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(305419896);
						streamClass.finishPacket();
					}
					if ((1 <= inventoryCount(i_740_)) && ((i_733_ - -220) <= this.mouseX)
					        && ((i_734_ - -263) <= this.mouseY) && ((i_733_ + 250) > this.mouseX)
					        && ((i_734_ + 274) >= this.mouseY))
					{
						streamClass.createPacket(23);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(1);
						streamClass.aClass27_Sub1_Sub1_1.putInt(-2023406815);
						streamClass.finishPacket();
					}
					if ((5 <= inventoryCount(i_740_)) && ((i_733_ + 250) <= this.mouseX)
					        && (this.mouseY >= (i_734_ + 263)) && (this.mouseX < (i_733_ + 280))
					        && ((i_734_ + 274) >= this.mouseY))
					{
						streamClass.createPacket(23);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(5);
						streamClass.aClass27_Sub1_Sub1_1.putInt(-2023406815);
						streamClass.finishPacket();
					}
					if ((10 <= inventoryCount(i_740_)) && (this.mouseX >= (i_733_ + 280))
					        && ((i_734_ + 263) <= this.mouseY) && ((i_733_ + 305) > this.mouseX)
					        && ((i_734_ + 274) >= this.mouseY))
					{
						streamClass.createPacket(23);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(10);
						streamClass.aClass27_Sub1_Sub1_1.putInt(-2023406815);
						streamClass.finishPacket();
					}
					if ((50 <= inventoryCount(i_740_)) && ((i_733_ + 305) <= this.mouseX)
					        && ((i_734_ + 263) <= this.mouseY) && ((i_733_ + 335) > this.mouseX)
					        && (this.mouseY <= (i_734_ + 274)))
					{
						streamClass.createPacket(23);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(50);
						streamClass.aClass27_Sub1_Sub1_1.putInt(-2023406815);
						streamClass.finishPacket();
					}
					if (((i_733_ + 335) <= this.mouseX) && ((i_734_ - -263) <= this.mouseY)
					        && ((i_733_ + 368) > this.mouseX) && (this.mouseY <= (i_734_ + 274)))
					{
						method516(aStringArray31, 4, true);
					}
					if (((i_733_ + 370) <= this.mouseX) && ((i_734_ + 263) <= this.mouseY)
					        && ((i_733_ + 400) > this.mouseX) && (this.mouseY <= (i_734_ + 274)))
					{
						streamClass.createPacket(23);
						streamClass.aClass27_Sub1_Sub1_1.putShort(i_740_);
						streamClass.aClass27_Sub1_Sub1_1.putInt(inventoryCount(i_740_));
						streamClass.aClass27_Sub1_Sub1_1.putInt(-2023406815);
						streamClass.finishPacket();
					}
				}
			}
			else if ((anInt982 > 48) && (50 <= i_733_) && (115 >= i_733_) && (12 >= i_734_))
			{
				anInt1045 = 0;
			}
			else if ((anInt982 <= 48) || (115 > i_733_) || (180 < i_733_) || (12 < i_734_))
			{
				if ((anInt982 <= 96) || (i_733_ < 180) || (i_733_ > 245) || (12 < i_734_))
				{
					if ((anInt982 > 144) && (i_733_ >= 245) && (i_733_ <= 310) && (i_734_ <= 12))
					{
						anInt1045 = 3;
					}
					else
					{
						streamClass.createPacket(212);
						streamClass.finishPacket();
						aBool81 = false;
						return;
					}
				}
				else
				{
					anInt1045 = 2;
				}
			}
			else
			{
				anInt1045 = 1;
			}
		}
		final int i_741_ = -(i_731_ / 2) + 256;
		final int i_742_ = -(i_732_ / 2) + 170;
		gameGraphics.method321(i_742_, 192, 12, 408, i_741_, i ^ 0x0);
		final int i_743_ = 10000536;
		gameGraphics.method327(i_741_, i_742_ + 12, 408, 160, 118, i_743_, 17);
		gameGraphics.method327(i_741_, i_742_ + 29, 8, 160, 110, i_743_, 204);
		gameGraphics.method327(i_741_ + 399, i_742_ + 29, 9, 160, 102, i_743_, 204);
		gameGraphics.method327(i_741_, i_742_ - -233, 408, 160, 74, i_743_, 47);
		gameGraphics.method324("Bank", 0, i, 16777215, i_741_ + 1, i_742_ - -10);
		int i_744_ = 50;
		if (anInt982 > 48)
		{
			int i_745_ = 16777215;
			if (anInt1045 != 0)
			{
				if ((this.mouseX > (i_744_ + i_741_)) && (this.mouseY >= i_742_)
				        && (this.mouseX < ((i_741_ - -i_744_) + 65)) && ((i_742_ + 12) > this.mouseY))
				{
					i_745_ = 16776960;
				}
			}
			else
			{
				i_745_ = 16711680;
			}
			gameGraphics.method324("<page 1>", 0, 1, i_745_, i_741_ + i_744_, i_742_ + 10);
			i_744_ += 65;
			i_745_ = 16777215;
			if (anInt1045 == 1)
			{
				i_745_ = 16711680;
			}
			else if (((i_744_ + i_741_) < this.mouseX) && (this.mouseY >= i_742_)
			        && (this.mouseX < (i_741_ + i_744_ + 65)) && (this.mouseY < (i_742_ + 12)))
			{
				i_745_ = 16776960;
			}
			gameGraphics.method324("<page 2>", 0, 1, i_745_, i_744_ + i_741_, i_742_ + 10);
			i_744_ += 65;
		}
		if (96 < anInt982)
		{
			int i_746_ = 16777215;
			if (anInt1045 == 2)
			{
				i_746_ = 16711680;
			}
			else if (((i_744_ + i_741_) < this.mouseX) && (i_742_ <= this.mouseY)
			        && ((i_741_ + (i_744_ - -65)) > this.mouseX) && (this.mouseY < (i_742_ + 12)))
			{
				i_746_ = 16776960;
			}
			gameGraphics.method324("<page 3>", i + -1, 1, i_746_, i_741_ + i_744_, i_742_ + 10);
			i_744_ += 65;
		}
		if (144 < anInt982)
		{
			int i_747_ = 16777215;
			if (anInt1045 == 3)
			{
				i_747_ = 16711680;
			}
			else if ((this.mouseX > (i_744_ + i_741_)) && (i_742_ <= this.mouseY)
			        && ((i_741_ + i_744_ + 65) > this.mouseX) && ((i_742_ + 12) > this.mouseY))
			{
				i_747_ = 16776960;
			}
			gameGraphics.method324("<page 4>", 0, 1, i_747_, i_744_ + i_741_, i_742_ + 10);
			i_744_ += 65;
		}
		int i_748_ = 16777215;
		if (((i_741_ + 320) < this.mouseX) && (this.mouseY >= i_742_) && (this.mouseX < (i_741_ + 408))
		        && ((i_742_ + 12) > this.mouseY))
		{
			i_748_ = 16711680;
		}
		gameGraphics.method313(i_748_, i_741_ + 406, 1, i_742_ - -10, "Close window");
		gameGraphics.method324("Number in bank in green", 0, 1, 65280, i_741_ - -7, i_742_ + 24);
		gameGraphics.method324("Number held in blue", i + -1, 1, 65535, i_741_ - -289, i_742_ + 24);
		final int i_749_ = 13684944;
		int i_750_ = anInt1045 * 48;
		for (int i_751_ = 0; i_751_ < 6; i_751_++)
		{
			for (int i_752_ = 0; i_752_ < 8; i_752_++)
			{
				final int i_753_ = (i_741_ + 7) - -(i_752_ * 49);
				final int i_754_ = i_742_ + (28 - -(i_751_ * 34));
				if (i_750_ != anInt983)
				{
					gameGraphics.method327(i_753_, i_754_, 49, 160, i + 75, i_749_, 34);
				}
				else
				{
					gameGraphics.method327(i_753_, i_754_, 49, 160, i ^ 0x65, 16711680, 34);
				}
				gameGraphics.method362(35, i_753_, 50, 0, i_754_);
				if ((i_750_ < anInt982) && (anIntArray210[i_750_] != -1))
				{
					gameGraphics.method348(false, 0, -75, 32, i_754_, 48, 0,
					        ((EntityHandler.itemdef_sprite[anIntArray210[i_750_]]) + anInt863),
					        (EntityHandler.itemdef_color[anIntArray210[i_750_]]), i_753_);
					gameGraphics.method324(new StringBuilder().append("").append(anIntArray184[i_750_]).toString(),
					        0, 1, 65280, i_753_ + 1, i_754_ + 10);
					gameGraphics.method313(65535, i_753_ - -47, 1, i_754_ - -29, new StringBuilder()
					        .append("").append(inventoryCount((anIntArray210[i_750_]))).toString());
				}
				i_750_++;
			}
		}
		gameGraphics.method341(398, i_742_ + 256, i_741_ + 5, 0);
		if (anInt983 == -1)
		{
			gameGraphics.drawText(16776960, i ^ 0xfe, 3, "Select an object to withdraw or deposit", i_742_ + 248,
			        i_741_ + 204);
		}
		else
		{
			int i_755_;
			if (0 > anInt983)
			{
				i_755_ = -1;
			}
			else
			{
				i_755_ = anIntArray210[anInt983];
			}
			if (i_755_ != -1)
			{
				i_750_ = anIntArray184[anInt983];
				if ((EntityHandler.itemdef_isUnstackable[i_755_] == 1) && (1 < i_750_))
				{
					i_750_ = 1;
				}
				if (i_750_ > 0)
				{
					gameGraphics.method324(
					        new StringBuilder().append("Withdraw ").append(EntityHandler.itemdef_name[i_755_]).toString(),
					        0, 1, 16777215, i_741_ + 2, i_742_ + 248);
					i_748_ = 16777215;
					if ((this.mouseX >= (i_741_ + 220)) && (this.mouseY >= (i_742_ + 238))
					        && (this.mouseX < (i_741_ + 250)) && (this.mouseY <= (i_742_ + 249)))
					{
						i_748_ = 16711680;
					}
					gameGraphics.method324("One", 0, 1, i_748_, i_741_ + 222, i_742_ + 248);
					if (i_750_ >= 5)
					{
						i_748_ = 16777215;
						if ((this.mouseX >= (i_741_ + 250)) && ((i_742_ + 238) <= this.mouseY)
						        && ((i_741_ + 280) > this.mouseX) && ((i_742_ + 249) >= this.mouseY))
						{
							i_748_ = 16711680;
						}
						gameGraphics.method324("Five", 0, 1, i_748_, i_741_ + 252, i_742_ - -248);
					}
					if (10 <= i_750_)
					{
						i_748_ = 16777215;
						if (((i_741_ + 280) <= this.mouseX) && (this.mouseY >= (i_742_ + 238))
						        && (this.mouseX < (i_741_ + 305)) && ((i_742_ + 249) >= this.mouseY))
						{
							i_748_ = 16711680;
						}
						gameGraphics.method324("10", 0, 1, i_748_, i_741_ - -282, i_742_ + 248);
					}
					if (i_750_ >= 50)
					{
						i_748_ = 16777215;
						if ((this.mouseX >= (i_741_ - -305)) && (this.mouseY >= (i_742_ - -238))
						        && ((i_741_ + 335) > this.mouseX) && (this.mouseY <= (i_742_ + 249)))
						{
							i_748_ = 16711680;
						}
						gameGraphics.method324("50", 0, 1, i_748_, i_741_ - -307, i_742_ + 248);
					}
					i_748_ = 16777215;
					if ((this.mouseX >= (i_741_ + 335)) && ((i_742_ + 238) <= this.mouseY)
					        && ((i_741_ - -368) > this.mouseX) && ((i_742_ + 249) >= this.mouseY))
					{
						i_748_ = 16711680;
					}
					gameGraphics.method324("X", 0, 1, i_748_, i_741_ + 337, i_742_ - -248);
					i_748_ = 16777215;
					if (((i_741_ + 370) <= this.mouseX) && (this.mouseY >= (i_742_ + 238))
					        && ((i_741_ + 400) > this.mouseX) && (this.mouseY <= (i_742_ + 249)))
					{
						i_748_ = 16711680;
					}
					gameGraphics.method324("All", 0, 1, i_748_, i_741_ + 370, i_742_ + 248);
				}
				if (0 < inventoryCount(i_755_))
				{
					gameGraphics.method324(
					        new StringBuilder().append("Deposit ").append(EntityHandler.itemdef_name[i_755_]).toString(),
					        i ^ 0x1, 1, 16777215, i_741_ + 2, i_742_ + 273);
					i_748_ = 16777215;
					if (((i_741_ + 220) <= this.mouseX) && ((i_742_ + 263) <= this.mouseY)
					        && (this.mouseX < (i_741_ + 250)) && (this.mouseY <= (i_742_ + 274)))
					{
						i_748_ = 16711680;
					}
					gameGraphics.method324("One", 0, 1, i_748_, i_741_ - -222, i_742_ + 273);
					if (5 <= inventoryCount(i_755_))
					{
						i_748_ = 16777215;
						if ((this.mouseX >= (i_741_ + 250)) && (this.mouseY >= (i_742_ + 263))
						        && (this.mouseX < (i_741_ - -280)) && (this.mouseY <= (i_742_ + 274)))
						{
							i_748_ = 16711680;
						}
						gameGraphics.method324("Five", 0, 1, i_748_, i_741_ - -252, i_742_ + 273);
					}
					if (inventoryCount(i_755_) >= 10)
					{
						i_748_ = 16777215;
						if (((i_741_ + 280) <= this.mouseX) && (this.mouseY >= (i_742_ + 263))
						        && (this.mouseX < (i_741_ + 305)) && (this.mouseY <= (i_742_ + 274)))
						{
							i_748_ = 16711680;
						}
						gameGraphics.method324("10", 0, 1, i_748_, i_741_ + 282, i_742_ - -273);
					}
					if (50 <= inventoryCount(i_755_))
					{
						i_748_ = 16777215;
						if (((i_741_ + 305) <= this.mouseX) && ((i_742_ + 263) <= this.mouseY)
						        && (this.mouseX < (i_741_ + 335)) && ((i_742_ + 274) >= this.mouseY))
						{
							i_748_ = 16711680;
						}
						gameGraphics.method324("50", 0, 1, i_748_, i_741_ - -307, i_742_ - -273);
					}
					i_748_ = 16777215;
					if ((this.mouseX >= (i_741_ - -335)) && ((i_742_ + 263) <= this.mouseY)
					        && (this.mouseX < (i_741_ + 368)) && ((i_742_ - -274) >= this.mouseY))
					{
						i_748_ = 16711680;
					}
					gameGraphics.method324("X", 0, 1, i_748_, i_741_ + 337, i_742_ + 273);
					i_748_ = 16777215;
					if (((i_741_ + 370) <= this.mouseX) && (this.mouseY >= (i_742_ + 263))
					        && ((i_741_ + 400) > this.mouseX) && (this.mouseY <= (i_742_ + 274)))
					{
						i_748_ = 16711680;
					}
					gameGraphics.method324("All", 0, 1, i_748_, i_741_ - -370, i_742_ + 273);
				}
			}
		}
	}

	private void method568()
	{
		engineHandle.mapData = unpackData("map", 70, 4);
		if (isMembers)
		{
			engineHandle.membersMapData = unpackData("members map", 75, 5);
		}
		engineHandle.landscapeData = unpackData("landscape", 80, 6);
		if (isMembers)
		{
			engineHandle.membersLandscapeData = unpackData("members landscape", 85, 7);
		}
	}

	private void method569(final int i, final int i_756_)
	{
		final int i_757_ = aClass29_1.method203(i_756_ + -617, i);
		final int x = aClass29_1.method214(i);
		final int y = aClass29_1.method186(i);
		final int i_760_ = aClass29_1.method211(i);
		final int i_761_ = aClass29_1.method200(i);
		final int i_762_ = aClass29_1.method192(i_756_ + 1274, i);
		final String string = aClass29_1.method187(i);
		if (i_757_ == 200)
		{
			method545(sectionY, sectionX, y, x, true, (byte) -110);
			streamClass.createPacket(249);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_760_);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_761_);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 210)
		{
			method545(sectionY, sectionX, y, x, true, (byte) -110);
			streamClass.createPacket(53);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_760_);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_761_);
			streamClass.finishPacket();
			anInt989 = -1;
		}
		if (i_757_ == 220)
		{
			method545(sectionY, sectionX, y, x, true, (byte) -110);
			streamClass.createPacket(Constants.CPacketID_ActionPickupItem);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_760_);
			streamClass.finishPacket();
		}
		if ((i_757_ == 3600) || (i_757_ == 3200))
		{
			displayMessage(0, EntityHandler.itemdef_description[x], 0, null, i_756_ ^ ~0x204, null, null, false);
		}
		if (i_757_ == 300)
		{
			method558(i_760_, y, 47, x);
			streamClass.createPacket(180);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.put(i_760_);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_761_);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 310)
		{
			method558(i_760_, y, 49, x);
			streamClass.createPacket(161);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.put(i_760_);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_761_);
			streamClass.finishPacket();
			anInt989 = -1;
		}
		if (i_757_ == 320)
		{
			method558(i_760_, y, 84, x);
			streamClass.createPacket(14);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.put(i_760_);
			streamClass.finishPacket();
		}
		if (i_757_ == 2300)
		{
			method558(i_760_, y, i_756_ + -500, x);
			streamClass.createPacket(127);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.put(i_760_);
			streamClass.finishPacket();
		}
		if (i_757_ == 3300)
		{
			displayMessage(0, EntityHandler.wallobjectdef_description[x], 0, null, -127, null, null, false);
		}
		if (i_757_ == 400)
		{
			method576(i_760_, x, y, i_761_);
			streamClass.createPacket(99);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_762_);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 410)
		{
			method576(i_760_, x, y, i_761_);
			streamClass.createPacket(115);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_762_);
			streamClass.finishPacket();
			anInt989 = -1;
		}
		if (i_757_ == 420)
		{
			method576(i_760_, x, y, i_761_);
			streamClass.createPacket(136);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.finishPacket();
		}
		if (i_757_ == 2400)
		{
			method576(i_760_, x, y, i_761_);
			streamClass.createPacket(79);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.finishPacket();
		}
		if (i_757_ == 3400)
		{
			displayMessage(0, EntityHandler.objectdef_description[x], 0, null, -85, null, null, false);
		}
		if (i_757_ == 600)
		{
			streamClass.createPacket(4);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 610)
		{
			streamClass.createPacket(91);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y);
			streamClass.finishPacket();
			anInt989 = -1;
		}
		if (i_757_ == 620)
		{
			streamClass.createPacket(Constants.CPacketID_InventoryUnequip);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 630)
		{
			streamClass.createPacket(Constants.CPacketID_InventoryEquip);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 640)
		{
			streamClass.createPacket(90);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 650)
		{
			anInt939 = 0;
			anInt989 = x;
			aString30 = EntityHandler.itemdef_name[inventoryItems[anInt989]];
		}
		if (i_757_ == 660)
		{
			streamClass.createPacket(Constants.CPacketID_InventoryDrop);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
			anInt939 = 0;
			anInt989 = -1;
			displayMessage(0, new StringBuilder().append("Dropping ").append(EntityHandler.itemdef_name[inventoryItems[x]])
			        .toString(), 7, null, -88, null, null, false);
		}
		if (i_757_ == 700)
		{
			final Mob class15 = getNpcByServerIndex(x);
			final int i_763_ = (class15.currentX + -64) / tileSize;
			final int i_764_ = (class15.currentY + -64) / tileSize;
			method560(true, sectionY, true, i_764_, sectionX, i_763_);
			streamClass.createPacket(50);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 710)
		{
			final Mob class15 = getNpcByServerIndex(x);
			final int i_765_ = (class15.currentX + -64) / tileSize;
			final int i_766_ = (class15.currentY + -64) / tileSize;
			method560(true, sectionY, true, i_766_, sectionX, i_765_);
			streamClass.createPacket(135);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y);
			streamClass.finishPacket();
			anInt989 = -1;
		}
		if (i_757_ == 720)
		{
			final Mob class15 = getNpcByServerIndex(x);
			final int i_767_ = (class15.currentX - 64) / tileSize;
			final int i_768_ = (class15.currentY + -64) / tileSize;
			method560(true, sectionY, true, i_768_, sectionX, i_767_);
			streamClass.createPacket(153);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 725)
		{
			final Mob class15 = getNpcByServerIndex(x);
			final int i_769_ = (class15.currentX + -64) / tileSize;
			final int i_770_ = (class15.currentY - 64) / tileSize;
			method560(true, sectionY, true, i_770_, sectionX, i_769_);
			streamClass.createPacket(202);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if ((i_757_ == 2715) || (i_757_ == 715))
		{
			final Mob class15 = getNpcByServerIndex(x);
			final int i_771_ = (class15.currentX - 64) / tileSize;
			final int i_772_ = (class15.currentY - 64) / tileSize;
			method560(true, sectionY, true, i_772_, sectionX, i_771_);
			streamClass.createPacket(Constants.CPacketID_ActionAttackNpc);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 3700)
		{
			displayMessage(0, EntityHandler.npcdef_description[x], 0, null, -21, null, null, false);
		}
		if (i_757_ == 800)
		{
			final Mob class15 = getPlayerByServerIndex(x);
			final int i_773_ = (class15.currentX - 64) / tileSize;
			final int i_774_ = (class15.currentY - 64) / tileSize;
			method560(true, sectionY, true, i_774_, sectionX, i_773_);
			streamClass.createPacket(229);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 810)
		{
			final Mob class15 = getPlayerByServerIndex(x);
			final int i_775_ = (class15.currentX + -64) / tileSize;
			final int i_776_ = (class15.currentY + -64) / tileSize;
			method560(true, sectionY, true, i_776_, sectionX, i_775_);
			streamClass.createPacket(113);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y);
			streamClass.finishPacket();
			anInt989 = -1;
		}
		if ((i_757_ == 2805) || (i_757_ == 805))
		{
			final Mob class15 = getPlayerByServerIndex(x);
			final int i_777_ = (class15.currentX + -64) / tileSize;
			final int i_778_ = (class15.currentY + -64) / tileSize;
			method560(true, sectionY, true, i_778_, sectionX, i_777_);
			streamClass.createPacket(171);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 2806)
		{
			streamClass.createPacket(103);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 2810)
		{
			streamClass.createPacket(142);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 2820)
		{
			streamClass.createPacket(165);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
		}
		if (i_757_ == 2833)
		{
			this.aString26 = "";
			this.aString27 = string;
			anInt994 = 1;
		}
		if (i_757_ == 2831)
		{
			addToFriendsList(string);
		}
		if (i_757_ == 2832)
		{
			method502(string, -101);
		}
		if (i_757_ == 2830)
		{
			this.inputMessage = "";
			this.enteredMessage = "";
			inputBoxType = 2;
			privateMessageTarget = string;
		}
		if (i_757_ == 900)
		{
			method560(true, sectionY, true, y, sectionX, x);
			streamClass.createPacket(158);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x + areaX);
			streamClass.aClass27_Sub1_Sub1_1.putShort(y + areaY);
			streamClass.aClass27_Sub1_Sub1_1.putShort(i_760_);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_757_ == 920)
		{
			method560(false, sectionY, true, y, sectionX, x);
			if (actionPictureType == -24)
			{
				actionPictureType = 24;
			}
		}
		if (i_757_ == 1000)
		{
			streamClass.createPacket(137);
			streamClass.aClass27_Sub1_Sub1_1.putShort(x);
			streamClass.finishPacket();
			anInt940 = -1;
		}
		if (i_756_ == 617)
		{
			if (i_757_ == 4000)
			{
				anInt940 = -1;
				anInt989 = -1;
			}
		}
	}

	private void method571()
	{
		final byte[] is = unpackData("2d graphics", 20, 8);
		if (is == null)
		{
			lastLoadedNull = true;
		}
		else
		{
			final byte[] is_782_ = Camera.loadData(is, 0, "index.dat");
			gameGraphics.method350(anInt935, is_782_, Camera.loadData(is, 0, "inv1.dat"), 1);
			gameGraphics.method350(anInt935 + 1, is_782_, Camera.loadData(is, 0, "inv2.dat"), 6);
			gameGraphics.method350(anInt935 - -9, is_782_, Camera.loadData(is, 0, "bubble.dat"), 1);
			gameGraphics.method350(anInt935 + 10, is_782_, Camera.loadData(is, 0, "runescape.dat"), 1);
			gameGraphics.method350(anInt935 - -11, is_782_, Camera.loadData(is, 0, "splat.dat"), 3);
			gameGraphics.method350(anInt935 + 14, is_782_, Camera.loadData(is, 0, "icon.dat"), 8);
			gameGraphics.method350(anInt935 + 22, is_782_, Camera.loadData(is, 0, "hbar.dat"), 1);
			gameGraphics.method350(anInt935 + 23, is_782_, Camera.loadData(is, 0, "hbar2.dat"), 1);
			gameGraphics.method350(anInt935 + 24, is_782_, Camera.loadData(is, 0, "compass.dat"), 1);
			gameGraphics.method350(anInt935 + 25, is_782_, Camera.loadData(is, 0, "buttons.dat"), 2);
			gameGraphics.method350(anInt873, is_782_, Camera.loadData(is, 0, "scrollbar.dat"), 2);
			gameGraphics.method350(anInt873 + 2, is_782_, Camera.loadData(is, 0, "corners.dat"), 4);
			gameGraphics.method350(anInt873 + 6, is_782_, Camera.loadData(is, 0, "arrows.dat"), 2);
			gameGraphics.method350(anInt903, is_782_, Camera.loadData(is, 0, "projectile.dat"), EntityHandler.anInt494);
			gameGraphics.method350(anInt931, is_782_, Camera.loadData(is, 0, "crowns.dat"), 2);
			gameGraphics.method339(anInt931);
			int i_783_ = Class1.anInt1;
			int i_784_ = 1;
			while (i_783_ > 0)
			{
				int i_785_ = i_783_;
				i_783_ -= 30;
				if (30 < i_785_)
				{
					i_785_ = 30;
				}
				gameGraphics.method350((i_784_ * 30) + anInt863 + -30, is_782_, Camera.loadData(is, 0,
				        new StringBuilder().append("objects").append(i_784_).append(".dat").toString()), i_785_);
				i_784_++;
			}
			gameGraphics.method364(anInt935);
			gameGraphics.method364(anInt935 + 9);
			for (int i_786_ = 11; 26 >= i_786_; i_786_++)
			{
				gameGraphics.method364(i_786_ + anInt935);
			}
			for (int i_788_ = 0; i_788_ < EntityHandler.anInt494; i_788_++)
			{
				gameGraphics.method364(i_788_ + anInt903);
			}
			for (int i_789_ = 0; i_789_ < Class1.anInt1; i_789_++)
			{
				gameGraphics.method364(anInt863 - -i_789_);
			}
		}
	}

	private void drawLoggingOutBox(final int i)
	{
		gameGraphics.method321(137, 0, 60, 260, 126, i + -136);
		gameGraphics.method362(60, 126, 260, 16777215, i);
		gameGraphics.drawText(16777215, i ^ 0x76, 5, "Logging out...", 173, 256);
	}

	private void drawGame()
	{
		if (playerAliveTimeout != 0)
		{
			gameGraphics.method343(-1248297852);
			gameGraphics.drawText(16711680, 255, 7, "Oh dear! You are dead...", windowHeight / 2, maybe_windowWidth / 2);
			drawChatMessageTabs();
			gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
		}
		else if (showCharacterLookScreen)
		{
			method598((byte) 25);
		}
		else if (aBool69)
		{
			gameGraphics.method343(-1248297852);
			if (0.15 > Math.random())
			{
				gameGraphics.drawText((int) (1.6777215E7 * Math.random()), 255, 5, "ZZZ",
				        (int) (334.0 * Math.random()), (int) (Math.random() * 80.0));
			}
			if (Math.random() < 0.15)
			{
				gameGraphics.drawText((int) (1.6777215E7 * Math.random()), 255, 5, "ZZZ",
				        (int) (334.0 * Math.random()), -(int) (Math.random() * 80.0) + 512);
			}
			gameGraphics.method321(160, 0, 40, 200, (maybe_windowWidth / 2) + -100, 1);
			gameGraphics.drawText(16776960, 255, 7, "You are sleeping", 50, maybe_windowWidth / 2);
			gameGraphics.drawText(16776960, 255, 7,
			        new StringBuilder().append("Fatigue: ").append((anInt1055 * 100) / 750).append("%").toString(), 90,
			        maybe_windowWidth / 2);
			gameGraphics.drawText(16777215, 255, 5, "When you want to wake up just use your", 140, maybe_windowWidth / 2);
			gameGraphics.drawText(16777215, 255, 5, "keyboard to type the word in the box below", 160,
			        maybe_windowWidth / 2);
			gameGraphics.drawText(65535, 255, 5, new StringBuilder().append(this.aString27).append("*").toString(),
			        180, maybe_windowWidth / 2);
			if (aString35 == null)
			{
				gameGraphics.drawPicture(anInt925 + 1, 230, (maybe_windowWidth / 2) + -127);
			}
			else
			{
				gameGraphics.drawText(16711680, 255, 5, aString35, 260, maybe_windowWidth / 2);
			}
			gameGraphics.method362(42, (maybe_windowWidth / 2) + -128, 257, 16777215, 229);
			drawChatMessageTabs();
			gameGraphics.drawText(16777215, 255, 1, "If you can't read the word", 290, maybe_windowWidth / 2);
			gameGraphics.drawText(16777215, 255, 1, "@yel@click here@whi@ to get a different one", 305,
			        maybe_windowWidth / 2);
			gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
		}
		else if (engineHandle.playerIsAlive)
		{
			for (int i_790_ = 0; i_790_ < 64; i_790_++)
			{
				gameCamera.removeModel((engineHandle.aClass23ArrayArray2[lastWildYSubtract][i_790_]));
				if (lastWildYSubtract == 0)
				{
					gameCamera.removeModel((engineHandle.aClass23ArrayArray1[1][i_790_]));
					gameCamera.removeModel((engineHandle.aClass23ArrayArray2[1][i_790_]));
					gameCamera.removeModel((engineHandle.aClass23ArrayArray1[2][i_790_]));
					gameCamera.removeModel((engineHandle.aClass23ArrayArray2[2][i_790_]));
				}
				aBool53 = true;
				if ((lastWildYSubtract == 0)
				        && (((engineHandle.anIntArrayArray4[ourPlayer.currentX / 128][ourPlayer.currentY / 128])
				                & 0x80) == 0))
				{
					gameCamera.addModel((engineHandle.aClass23ArrayArray2[lastWildYSubtract][i_790_]));
					if (lastWildYSubtract == 0)
					{
						gameCamera.addModel((engineHandle.aClass23ArrayArray1[1][i_790_]));
						gameCamera.addModel((engineHandle.aClass23ArrayArray2[1][i_790_]));
						gameCamera.addModel((engineHandle.aClass23ArrayArray1[2][i_790_]));
						gameCamera.addModel((engineHandle.aClass23ArrayArray2[2][i_790_]));
					}
					aBool53 = false;
				}
			}
			if (anInt914 != anInt880)
			{
				anInt914 = anInt880;
				for (int i_791_ = 0; i_791_ < objectCount; i_791_++)
				{
					if (objectType[i_791_] == 97)
					{
						method539(i_791_, new StringBuilder().append("firea").append(anInt880 - -1).toString());
					}
					if (objectType[i_791_] == 274)
					{
						method539(i_791_, new StringBuilder().append("fireplacea").append(anInt880 - -1).toString());
					}
					if (objectType[i_791_] == 1031)
					{
						method539(i_791_, new StringBuilder().append("lightning").append(anInt880 + 1).toString());
					}
					if (objectType[i_791_] == 1036)
					{
						method539(i_791_, new StringBuilder().append("firespell").append(anInt880 + 1).toString());
					}
					if (objectType[i_791_] == 1147)
					{
						method539(i_791_, new StringBuilder().append("spellcharge").append(anInt880 + 1).toString());
					}
				}
			}
			if (anInt849 != anInt868)
			{
				anInt849 = anInt868;
				for (int i_792_ = 0; objectCount > i_792_; i_792_++)
				{
					if (objectType[i_792_] == 51)
					{
						method539(i_792_, new StringBuilder().append("torcha").append(anInt868 + 1).toString());
					}
					if (objectType[i_792_] == 143)
					{
						method539(i_792_, new StringBuilder().append("skulltorcha").append(anInt868 - -1).toString());
					}
				}
			}
			if (anInt936 != anInt912)
			{
				anInt912 = anInt936;
				for (int i_793_ = 0; objectCount > i_793_; i_793_++)
				{
					if (objectType[i_793_] == 1142)
					{
						method539(i_793_, new StringBuilder().append("clawspell").append(anInt936 + 1).toString());
					}
				}
			}
			gameCamera.method283(anInt916);
			anInt916 = 0;
			for (int i_794_ = 0; playerCount > i_794_; i_794_++)
			{
				final Mob class15 = playerArray[i_794_];
				if (class15.colorBottomType != 255)
				{
					final int i_795_ = class15.currentX;
					final int i_796_ = class15.currentY;
					final int i_797_ = -engineHandle.getAveragedElevation(i_796_, i_795_);
					final int i_798_ = gameCamera.method265(145, i_795_, i_796_, i_797_, 220, i_794_ + 10000, 5000 - -i_794_);
					anInt916++;
					if (class15 == ourPlayer)
					{
						gameCamera.method277(i_798_);
					}
					if (class15.currentSprite == 8)
					{
						gameCamera.method281(i_798_, -30);
					}
					if (class15.currentSprite == 9)
					{
						gameCamera.method281(i_798_, 30);
					}
				}
			}
			for (int i_799_ = 0; playerCount > i_799_; i_799_++)
			{
				final Mob class15 = playerArray[i_799_];
				if (class15.anInt158 > 0)
				{
					Mob class15_800_ = null;
					if (class15.anInt154 != -1)
					{
						class15_800_ = npcRecordArray[class15.anInt154];
					}
					else if (class15.anInt169 != -1)
					{
						class15_800_ = mobArray[class15.anInt169];
					}
					if (class15_800_ != null)
					{
						final int i_801_ = class15.currentX;
						final int i_802_ = class15.currentY;
						final int i_803_ = -engineHandle.getAveragedElevation(i_802_, i_801_) + -110;
						final int i_804_ = class15_800_.currentX;
						final int i_805_ = class15_800_.currentY;
						final int i_806_ = (-engineHandle.getAveragedElevation(i_805_, i_804_)
						        - ((EntityHandler.npcdef_camera2[class15_800_.type]) / 2));
						final int i_807_ = (((i_801_ * class15.anInt158) - -(i_804_ * (anInt855 - class15.anInt158)))
						        / anInt855);
						final int i_808_ = (((i_803_ * class15.anInt158) + (i_806_ * (anInt855 + -class15.anInt158)))
						        / anInt855);
						final int i_809_ = (((i_805_ * (anInt855 - class15.anInt158)) + (i_802_ * class15.anInt158))
						        / anInt855);
						gameCamera.method265(32, i_807_, i_809_, i_808_, 32, 0, anInt903 - -(class15.anInt164));
						anInt916++;
					}
				}
			}
			for (int i_810_ = 0; i_810_ < npcCount; i_810_++)
			{
				final Mob class15 = npcArray[i_810_];
				final int i_811_ = class15.currentX;
				final int i_812_ = class15.currentY;
				final int i_813_ = -engineHandle.getAveragedElevation(i_812_, i_811_);
				final int i_814_ = gameCamera.method265((EntityHandler.npcdef_camera1[class15.type]), i_811_, i_812_,
				        i_813_, (EntityHandler.npcdef_camera2[class15.type]), i_810_ + 30000, i_810_ + 20000);
				anInt916++;
				if (class15.currentSprite == 8)
				{
					gameCamera.method281(i_814_, -30);
				}
				if (class15.currentSprite == 9)
				{
					gameCamera.method281(i_814_, 30);
				}
			}
			for (int i_815_ = 0; i_815_ < groundItemCount; i_815_++)
			{
				final int i_816_ = (tileSize * groundItemX[i_815_]) + 64;
				final int i_817_ = (tileSize * groundItemY[i_815_]) + 64;
				gameCamera.method265(96, i_816_, i_817_,
				        (-engineHandle.getAveragedElevation(i_817_, i_816_) + -groundItemObjectVar[i_815_]), 64, i_815_ + 20000, groundItemType[i_815_] + 40000);
				anInt916++;
			}
			for (int i_818_ = 0; anInt1012 > i_818_; i_818_++)
			{
				final int i_819_ = (tileSize * anIntArray188[i_818_]) + 64;
				final int i_820_ = (tileSize * anIntArray204[i_818_]) - -64;
				final int i_821_ = anIntArray214[i_818_];
				if (i_821_ == 0)
				{
					gameCamera.method265(128, i_819_, i_820_, -engineHandle.getAveragedElevation(i_820_, i_819_), 256,
					        i_818_ + 50000, i_818_ + 50000);
					anInt916++;
				}
				if (i_821_ == 1)
				{
					gameCamera.method265(128, i_819_, i_820_, -engineHandle.getAveragedElevation(i_820_, i_819_), 64,
					        i_818_ + 50000, 50000 - -i_818_);
					anInt916++;
				}
			}
			gameGraphics.f1Toggle = false;
			gameGraphics.method331();
			gameGraphics.f1Toggle = this.aBool39;
			if (lastWildYSubtract == 3)
			{
				// NOTE: Light flickering when underground.
				final int i_822_ = 40 + (int) (Math.random() * 3.0);
				final int i_823_ = (int) (7.0 * Math.random()) + 40;
				gameCamera.method261(-10, -50, i_823_, i_822_, -50);
			}
			anInt978 = 0;
			anInt977 = 0;
			anInt960 = 0;
			if (!aBool80)
			{
				if (configAutoCameraAngle && !aBool53)
				{
					method500();
				}
				if (true == !this.aBool39)
				{
					gameCamera.anInt464 = 2400;
					gameCamera.anInt426 = 2300;
					gameCamera.anInt437 = 2400;
					gameCamera.anInt465 = 1;
				}
				else
				{
					gameCamera.anInt426 = 2100;
					gameCamera.anInt464 = 2200;
					gameCamera.anInt465 = 1;
					gameCamera.anInt437 = 2200;
				}
				final int i_824_ = anInt906 - -anInt882;
				final int i_825_ = anInt907 - -anInt923;
				gameCamera.setCamera(-engineHandle.getAveragedElevation(i_825_, i_824_), i_824_, anInt843 * 4, 912, i_825_,
				        maybe_cameraHeight * 2, 0);
			}
			else
			{
				if (configAutoCameraAngle && !aBool53)
				{
					final int i_826_ = anInt933;
					method500();
					if (i_826_ != anInt933)
					{
						anInt906 = ourPlayer.currentX;
						anInt907 = ourPlayer.currentY;
					}
				}
				gameCamera.anInt437 = 3000;
				gameCamera.anInt464 = 3000;
				gameCamera.anInt426 = 2800;
				gameCamera.anInt465 = 1;
				anInt843 = anInt933 * 32;
				final int i_827_ = anInt882 + anInt906;
				final int i_828_ = anInt923 + anInt907;
				gameCamera.setCamera(-engineHandle.getAveragedElevation(i_828_, i_827_), i_827_, anInt843 * 4, 912, i_828_, 2000,
				        0);
			}
			gameCamera.finishCamera();
			method525((byte) -73);
			if (0 < actionPictureType)
			{
				gameGraphics.drawPicture(((-actionPictureType + 24) / 6) + anInt935 + 14, anInt888 + -8, anInt854 + -8);
			}
			if (actionPictureType < 0)
			{
				gameGraphics.drawPicture(((24 - -actionPictureType) / 6) + anInt935 + 18, anInt888 - 8, anInt854 - 8);
			}
			if (systemUpdate != 0)
			{
				int i_829_ = systemUpdate / 50;
				final int i_830_ = i_829_ / 60;
				i_829_ %= 60;
				if (10 <= i_829_)
				{
					gameGraphics.drawText(16776960, 255, 1, new StringBuilder().append("System update in: ")
					        .append(i_830_).append(":").append(i_829_).toString(), windowHeight - 7, 256);
				}
				else
				{
					gameGraphics.drawText(16776960, 255, 1, new StringBuilder().append("System update in: ")
					        .append(i_830_).append(":0").append(i_829_).toString(), windowHeight + -7, 256);
				}
			}
			if (!notInWilderness)
			{
				int i_831_ = -wildY + -sectionY + -areaY + 2203;
				if ((sectionX + wildX + areaX) >= 2640)
				{
					i_831_ = -50;
				}
				if (i_831_ > 0)
				{
					final int i_832_ = (i_831_ / 6) + 1;
					gameGraphics.drawPicture(anInt935 + 13, windowHeight - 56, 453);
					gameGraphics.drawText(16776960, 255, 1, "Wilderness", windowHeight - 20, 465);
					gameGraphics.drawText(16776960, 255, 1,
					        new StringBuilder().append("Level: ").append(i_832_).toString(), windowHeight - 7, 465);
					if (wildernessType == 0)
					{
						wildernessType = 2;
					}
				}
				if ((wildernessType == 0) && (-10 < i_831_) && (0 >= i_831_))
				{
					wildernessType = 1;
				}
			}
			if (messagesTab == 0)
			{
				for (int index = 0; index < messagesTimeout.length; index++)
				{
					if (messagesTimeout[index] > 0)
					{
						final String string = CameraModel.aStringArray21[index] 
								+ Class13.method110(Class2.aStringArray3[index], Class13.aStringArray13[index], ByteBuffer.anIntArray142[index]);
						gameGraphics.drawString(string, GameImage.anIntArray126[index], 1, -(index * 12) + windowHeight - 18, 7, 16776960);
					}
				}
			}
			gameMenu.method66(anInt1052);
			gameMenu.method66(anInt987);
			gameMenu.method66(anInt990);
			if (messagesTab == 1)
			{
				gameMenu.method69(anInt1052);
			}
			else if (messagesTab == 2)
			{
				gameMenu.method69(anInt987);
			}
			else if (messagesTab == 3)
			{
				gameMenu.method69(anInt990);
			}
			GameImage.anInt568 = 2;
			gameMenu.drawMenu(-6);
			GameImage.anInt568 = 0;
			gameGraphics.method320((gameGraphics.menuDefaultWidth) + -3 + -197, anInt935, 3, 128);
			drawGameWindowsMenus();
			gameGraphics.drawStringShadows = false;
			drawChatMessageTabs();
			
			if(Custom.DEBUG)
			{
				gameGraphics.drawText(0xFFFFFFFF, 0, 1, "@yel@Coords: @whi@" + (sectionX + areaX) + ", " + (sectionY + areaY), 150, 50);
			}
			
			gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
		}
	}

	private void makeCharacterDesignMenu()
	{
		characterDesignMenu = new Menu(gameGraphics, 100);
		characterDesignMenu.drawText(10, true, 4, 256, "Please design Your Character");
		int i_834_ = 140;
		int i_835_ = 34;
		i_834_ += 116;
		i_835_ -= 10;
		characterDesignMenu.drawText(i_835_ + 110, true, 3, i_834_ + -55, "Front");
		characterDesignMenu.drawText(i_835_ + 110, true, 3, i_834_, "Side");
		characterDesignMenu.drawText(i_835_ + 110, true, 3, i_834_ + 55, "Back");
		final int i_836_ = 54;
		i_835_ += 145;
		characterDesignMenu.method95(-i_836_ + i_834_, i_835_, 41, 53);
		characterDesignMenu.drawText(i_835_ - 8, true, 1, -i_836_ + i_834_, "Head");
		characterDesignMenu.drawText(i_835_ + 8, true, 1, i_834_ - i_836_, "Type");
		characterDesignMenu.method73(Class33.anInt368 + 7, (i_834_ - 40) + -i_836_, i_835_);
		anInt968 = characterDesignMenu.method65(i_835_, 20, -i_836_ + i_834_ + -40, 20);
		characterDesignMenu.method73(Class33.anInt368 - -6, (-i_836_ + i_834_) - -40, i_835_);
		anInt974 = characterDesignMenu.method65(i_835_, 20, (-i_836_ + i_834_) - -40, 20);
		characterDesignMenu.method95(i_834_ - -i_836_, i_835_, 41, 53);
		characterDesignMenu.drawText(i_835_ - 8, true, 1, i_836_ + i_834_, "Hair");
		characterDesignMenu.drawText(i_835_ + 8, true, 1, i_836_ + i_834_, "Color");
		characterDesignMenu.method73(Class33.anInt368 + 7, i_834_ + i_836_ + -40, i_835_);
		anInt991 = characterDesignMenu.method65(i_835_, 20, (i_834_ - -i_836_) + -40, 20);
		characterDesignMenu.method73(Class33.anInt368 + 6, i_836_ + i_834_ + 40, i_835_);
		anInt954 = characterDesignMenu.method65(i_835_, 20, i_836_ + i_834_ + 40, 20);
		i_835_ += 50;
		characterDesignMenu.method95(-i_836_ + i_834_, i_835_, 41, 53);
		characterDesignMenu.drawText(i_835_, true, 1, -i_836_ + i_834_, "Gender");
		characterDesignMenu.method73(Class33.anInt368 + 7, (i_834_ - i_836_) + -40, i_835_);
		anInt996 = characterDesignMenu.method65(i_835_, 20, -i_836_ + i_834_ + -40, 20);
		characterDesignMenu.method73(Class33.anInt368 + 6, -i_836_ + i_834_ + 40, i_835_);
		anInt956 = characterDesignMenu.method65(i_835_, 20, -i_836_ + i_834_ + 40, 20);
		characterDesignMenu.method95(i_836_ + i_834_, i_835_, 41, 53);
		characterDesignMenu.drawText(i_835_ + -8, true, 1, i_834_ + i_836_, "Top");
		characterDesignMenu.drawText(i_835_ + 8, true, 1, i_834_ + i_836_, "Color");
		characterDesignMenu.method73(Class33.anInt368 + 7, (i_834_ - -i_836_) + -40, i_835_);
		anInt969 = characterDesignMenu.method65(i_835_, 20, i_836_ + i_834_ + -40, 20);
		characterDesignMenu.method73(Class33.anInt368 - -6, i_836_ + i_834_ + 40, i_835_);
		anInt945 = characterDesignMenu.method65(i_835_, 20, i_834_ + i_836_ + 40, 20);
		i_835_ += 50;
		characterDesignMenu.method95(i_834_ - i_836_, i_835_, 41, 53);
		characterDesignMenu.drawText(i_835_ - 8, true, 1, -i_836_ + i_834_, "Skin");
		characterDesignMenu.drawText(i_835_ + 8, true, 1, i_834_ - i_836_, "Color");
		characterDesignMenu.method73(Class33.anInt368 + 7, (-i_836_ - 40) + i_834_, i_835_);
		anInt1020 = characterDesignMenu.method65(i_835_, 20, -i_836_ + i_834_ + -40, 20);
		characterDesignMenu.method73(Class33.anInt368 + 6, (i_834_ + 40) - i_836_, i_835_);
		anInt966 = characterDesignMenu.method65(i_835_, 20, -i_836_ + i_834_ + 40, 20);
		characterDesignMenu.method95(i_836_ + i_834_, i_835_, 41, 53);
		characterDesignMenu.drawText(i_835_ + -8, true, 1, i_836_ + i_834_, "Bottom");
		characterDesignMenu.drawText(i_835_ - -8, true, 1, i_836_ + i_834_, "Color");
		characterDesignMenu.method73(Class33.anInt368 - -7, (i_834_ + -40) - -i_836_, i_835_);
		anInt947 = characterDesignMenu.method65(i_835_, 20, (i_834_ + -40) - -i_836_, 20);
		characterDesignMenu.method73(Class33.anInt368 + 6, i_836_ + i_834_ + 40, i_835_);
		anInt1044 = characterDesignMenu.method65(i_835_, 20, i_836_ + i_834_ + 40, 20);
		i_835_ += 82;
		i_835_ -= 35;
		characterDesignMenu.method78(30, 200, i_835_, i_834_);
		characterDesignMenu.drawText(i_835_, false, 4, i_834_, "Accept");
		anInt1029 = characterDesignMenu.method65(i_835_, 30, i_834_, 200);
	}

	@Override
	protected void lostConnection()
	{
		systemUpdate = 0;
		if (logoutTimeout != 0)
		{
			resetIntVars();
		}
		else
		{
			super.lostConnection();
		}
	}

	private void method576(final int i_838_, int i_839_, int i_840_, final int i_841_)
	{
		int i_842_;
		int i_843_;
		if ((i_838_ == 0) || (i_838_ == 4))
		{
			i_843_ = EntityHandler.objectdef_width[i_841_];
			i_842_ = EntityHandler.objectdef_height[i_841_];
		}
		else
		{
			i_842_ = EntityHandler.objectdef_width[i_841_];
			i_843_ = EntityHandler.objectdef_height[i_841_];
		}
		if ((EntityHandler.objectdef_type[i_841_] == 2) || (EntityHandler.objectdef_type[i_841_] == 3))
		{
			if (i_838_ == 0)
			{
				i_843_++;
				i_839_--;
			}
			if (i_838_ == 2)
			{
				i_842_++;
			}
			if (i_838_ == 4)
			{
				i_843_++;
			}
			if (i_838_ == 6)
			{
				i_842_++;
				i_840_--;
			}
			method552(i_842_ + i_840_ + -1, true, i_839_ - -i_843_ - 1, sectionY, i_839_, i_840_, sectionX, true,
			        false);
		}
		else
		{
			method552(i_842_ + i_840_ + -1, true, (i_839_ + -1) - -i_843_, sectionY, i_839_, i_840_, sectionX, true,
			        true);
		}
	}

	public static void main(final String[] args)
	{
		try
		{
			Class34.aClass38_5 = StreamClass.aClass38_7;
			Class27_Sub1_Sub1.portOffset = Integer.parseInt(args[0]);
			if (!args[1].equals("live"))
			{
				if (!args[1].equals("rc"))
				{
					if (args[1].equals("wip"))
					{
						RuntimeException_Sub1.aClass24_4 = Class45.aClass24_2;
					}
				}
				else
				{
					RuntimeException_Sub1.aClass24_4 = RuntimeException_Sub1.aClass24_3;
				}
			}
			else
			{
				RuntimeException_Sub1.aClass24_4 = Class42.aClass24_1;
			}
			final mudclient mc = new mudclient();
			mc.maybe_isApplet = false;
			for (int i = 2; args.length > i; i++)
			{
				if (args[i].equals("members"))
				{
					mc.isMembers = true;
				}
				if (args[i].equals("veterans"))
				{
					mc.isVeterans = true;
				}
			}
			mc.createWindow((byte) 113, false, GameWindowMiddleMan.clientVersion, mc.windowHeight + 12,
					7000 + Class27_Sub1_Sub1.portOffset, mc.maybe_windowWidth, "RuneScape Classic",
			        (RuntimeException_Sub1.aClass24_4.anInt293) + 32, "classic");
			mc.threadSleepTime = 10;
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, 125, null);
		}
	}

	@Override
	void method471()
	{
		sendLogoutPacket(true);
		if (aClass37_1 != null)
		{
			aClass37_1.method243();
		}
	}

	private void method577(final boolean bool, final int i)
	{
		int i_845_ = gameGraphics.menuDefaultWidth + -199;
		int i_846_ = 156;
		gameGraphics.drawPicture(anInt935 + 2, 3, i_845_ + -49);
		int i_847_ = 152;
		i_845_ += 40;
		gameGraphics.method321(36, 0, i_847_, i_846_, i_845_, i + 20184);
		gameGraphics.method357(36, i_847_ + 36, i_845_, i_846_ + i_845_);
		int i_848_ = anInt1041 + 192;
		int i_849_ = 0xff & (anInt843 + anInt964);
		int i_850_ = (i_848_ * (ourPlayer.currentX + -6040) * 3) / 2048;
		int i_851_ = (i_848_ * (ourPlayer.currentY + -6040) * 3) / 2048;
		int i_852_ = GameWindow.anIntArray151[(-(i_849_ * 4) + 1024) & 0x3ff];
		int i_853_ = GameWindow.anIntArray151[(0x3ff & (-(i_849_ * 4) + 1024)) + 1024];
		int i_854_ = ((i_852_ * i_851_) + (i_850_ * i_853_)) >> 18;
		i_851_ = ((i_851_ * i_853_) + -(i_852_ * i_850_)) >> 18;
		if (i == -20183)
		{
			i_850_ = i_854_;
			gameGraphics.method351((i_846_ / 2) + -i_850_ + i_845_, i_848_, anInt935 + -1,
			        (i_847_ / 2) + i_851_ + 36, (i_849_ + 64) & 0xff);
			for (int i_855_ = 0; objectCount > i_855_; i_855_++)
			{
				i_851_ = ((((tileSize * objectY[i_855_]) + -ourPlayer.currentY + 64) * i_848_ * 3) / 2048);
				i_850_ = ((((tileSize * objectX[i_855_]) + -ourPlayer.currentX + 64) * i_848_ * 3) / 2048);
				i_854_ = ((i_852_ * i_851_) - -(i_850_ * i_853_)) >> 18;
				i_851_ = ((i_853_ * i_851_) + -(i_852_ * i_850_)) >> 18;
				i_850_ = i_854_;
				method509(-2, 65535, 36 - (-(i_847_ / 2) - -i_851_), (i_846_ / 2) + i_850_ + i_845_);
			}
			for (int i_856_ = 0; groundItemCount > i_856_; i_856_++)
			{
				i_850_ = (i_848_ * ((tileSize * groundItemX[i_856_]) + -ourPlayer.currentX + 64) * 3) / 2048;
				i_851_ = ((((tileSize * groundItemY[i_856_]) + -ourPlayer.currentY + 64) * i_848_ * 3) / 2048);
				i_854_ = ((i_850_ * i_853_) + (i_851_ * i_852_)) >> 18;
				i_851_ = ((i_851_ * i_853_) + -(i_852_ * i_850_)) >> 18;
				i_850_ = i_854_;
				method509(-2, 16711680, (i_847_ / 2) + -i_851_ + 36, (i_846_ / 2) + (i_845_ - -i_850_));
			}
			for (int i_857_ = 0; i_857_ < npcCount; i_857_++)
			{
				final Mob class15 = npcArray[i_857_];
				i_850_ = (i_848_ * (class15.currentX - ourPlayer.currentX) * 3) / 2048;
				i_851_ = (i_848_ * (class15.currentY - ourPlayer.currentY) * 3) / 2048;
				i_854_ = ((i_851_ * i_852_) + (i_853_ * i_850_)) >> 18;
				i_851_ = ((i_851_ * i_853_) + -(i_852_ * i_850_)) >> 18;
				i_850_ = i_854_;
				method509(-2, 16776960, (i_847_ / 2) + -i_851_ + 36, (i_846_ / 2) + i_850_ + i_845_);
			}
			for (int i_858_ = 0; playerCount > i_858_; i_858_++)
			{
				final Mob class15 = playerArray[i_858_];
				i_850_ = (i_848_ * (class15.currentX + -ourPlayer.currentX) * 3) / 2048;
				i_851_ = (i_848_ * (class15.currentY + -ourPlayer.currentY) * 3) / 2048;
				i_854_ = ((i_852_ * i_851_) + (i_853_ * i_850_)) >> 18;
				i_851_ = ((i_851_ * i_853_) + -(i_850_ * i_852_)) >> 18;
				i_850_ = i_854_;
				int i_859_ = 16777215;
				final String string = Class43.method298(class15.maybe_accountName);
				if (string != null)
				{
					for (int i_860_ = 0; i_860_ < GameWindowMiddleMan.friendsCount; i_860_++)
					{
						if (string.equals(Class43.method298((GameWindowMiddleMan.friendsListNames[i_860_])))
						        && ((GameWindowMiddleMan.friendsListOnlineStatus[i_860_] & 0x2) != 0))
						{
							i_859_ = 65280;
							break;
						}
					}
				}
				method509(-2, i_859_, (i_847_ / 2) + -i_851_ + 36, (i_846_ / 2) + i_845_ + i_850_);
			}
			gameGraphics.method329((i_846_ / 2) + i_845_, 2, 16777215, 36 - -(i_847_ / 2), 255, (byte) 33);
			gameGraphics.method351(i_845_ + 19, 128, anInt935 + 24, 55, 0xff & (anInt843 + 128));
			gameGraphics.method357(0, windowHeight + 12, 0, maybe_windowWidth);
			if (bool)
			{
				i_845_ = (this.mouseX + -gameGraphics.menuDefaultWidth + 199);
				final int i_861_ = this.mouseY - 36;
				if ((i_845_ >= 40) && (i_861_ >= 0) && (196 > i_845_) && (152 > i_861_))
				{
					i_845_ = gameGraphics.menuDefaultWidth - 199;
					i_847_ = 152;
					i_846_ = 156;
					i_849_ = 0xff & (anInt964 + anInt843);
					i_848_ = anInt1041 + 192;
					i_845_ += 40;
					i_851_ = (((this.mouseY + -(i_847_ / 2) + -36) * 16384) / (i_848_ * 3));
					i_853_ = (GameWindow.anIntArray151[((1024 - (i_849_ * 4)) & 0x3ff) + 1024]);
					i_850_ = ((((-(i_846_ / 2) - i_845_) + this.mouseX) * 16384) / (i_848_ * 3));
					i_852_ = (GameWindow.anIntArray151[(-(i_849_ * 4) + 1024) & 0x3ff]);
					i_854_ = ((i_851_ * i_852_) + (i_850_ * i_853_)) >> 15;
					i_851_ = ((i_853_ * i_851_) + -(i_850_ * i_852_)) >> 15;
					i_850_ = i_854_;
					i_851_ = ourPlayer.currentY - i_851_;
					i_850_ = ourPlayer.currentX + i_850_;
					if (anInt887 == 1)
					{
						method560(false, sectionY, true, i_851_ / 128, sectionX, i_850_ / 128);
					}
					anInt887 = 0;
				}
			}
		}
	}

	private void method578(final String string, final boolean bool, final int i_862_, final String[] strings)
	{
		aStringArray49 = strings;
		anInt985 = 400;
		for (int i_863_ = 0; strings.length > i_863_; i_863_++)
		{
			final int i_864_ = 10 + gameGraphics.method328(strings[i_863_], -116, 1);
			if (anInt985 < i_864_)
			{
				anInt985 = i_864_;
			}
		}
		anInt1060 = (((2 + gameGraphics.method315(1)) * (1 + strings.length))
		        + (15 - -gameGraphics.method315(4)));
		anInt971 = i_862_;
		aBool60 = false;
		aBool62 = bool;
		this.aString27 = string;
		this.aString26 = "";
	}

	private void method579(final int i)
	{
		final int i_866_ = 22;
		final int i_867_ = 36;
		gameGraphics.method321(i_867_, 192, 16, 468, i_866_, i ^ ~0x38c4);
		final int i_868_ = 10000536;
		gameGraphics.method327(i_866_, i_867_ + 16, 468, 160, i ^ ~0x3894, i_868_, 246);
		gameGraphics.drawText(16777215, 255, 1,
		        new StringBuilder().append("Please confirm your duel with @yel@").append(aString37).toString(),
		        i_867_ - -12, i_866_ + 234);
		if (i != -14534)
		{
			anIntArray172 = null;
		}
		gameGraphics.drawText(16776960, 255, 1, "Your stake:", i_867_ - -30, i_866_ + 117);
		for (int i_869_ = 0; anInt992 > i_869_; i_869_++)
		{
			String string = EntityHandler.itemdef_name[anIntArray215[i_869_]];
			if (EntityHandler.itemdef_isUnstackable[anIntArray215[i_869_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Menu.method79(1, anIntArray183[i_869_])).toString();
			}
			gameGraphics.drawText(16777215, 255, 1, string, i_867_ + (i_869_ * 12) + 42, i_866_ - -117);
		}
		if (anInt992 == 0)
		{
			gameGraphics.drawText(16777215, 255, 1, "Nothing!", i_867_ - -42, i_866_ - -117);
		}
		gameGraphics.drawText(16776960, 255, 1, "Your opponent's stake:", i_867_ + 30, i_866_ - -351);
		for (int i_870_ = 0; i_870_ < anInt1053; i_870_++)
		{
			String string = EntityHandler.itemdef_name[anIntArray221[i_870_]];
			if (EntityHandler.itemdef_isUnstackable[anIntArray221[i_870_]] == 0)
			{
				string = new StringBuilder().append(string).append(" x ")
				        .append(Menu.method79(1, anIntArray206[i_870_])).toString();
			}
			gameGraphics.drawText(16777215, 255, 1, string, (i_867_ - -(i_870_ * 12)) + 42, i_866_ + 351);
		}
		if (anInt1053 == 0)
		{
			gameGraphics.drawText(16777215, 255, 1, "Nothing!", i_867_ + 42, i_866_ + 351);
		}
		if (anInt995 != 0)
		{
			gameGraphics.drawText(16711680, 255, 1, "No retreat is possible!", i_867_ - -180, i_866_ + 234);
		}
		else
		{
			gameGraphics.drawText(65280, i ^ ~0x383a, 1, "You can retreat from this duel", i_867_ - -180,
			        i_866_ + 234);
		}
		if (anInt1004 == 0)
		{
			gameGraphics.drawText(65280, 255, 1, "Magic may be used", i_867_ + 192, i_866_ + 234);
		}
		else
		{
			gameGraphics.drawText(16711680, 255, 1, "Magic cannot be used", i_867_ + 192, i_866_ + 234);
		}
		if (anInt1025 == 0)
		{
			gameGraphics.drawText(65280, 255, 1, "Prayer may be used", i_867_ + 204, i_866_ - -234);
		}
		else
		{
			gameGraphics.drawText(16711680, 255, 1, "Prayer cannot be used", i_867_ + 204, i_866_ + 234);
		}
		if (anInt1034 != 0)
		{
			gameGraphics.drawText(16711680, 255, 1, "Weapons cannot be used", i_867_ + 216, i_866_ - -234);
		}
		else
		{
			gameGraphics.drawText(65280, 255, 1, "Weapons may be used", i_867_ - -216, i_866_ - -234);
		}
		gameGraphics.drawText(16777215, 255, 1, "If you are sure click 'Accept' to begin the duel", i_867_ - -230,
		        i_866_ + 234);
		if (!aBool66)
		{
			gameGraphics.drawPicture(anInt935 + 25, i_867_ + 238, (i_866_ - -118) + -35);
			gameGraphics.drawPicture(anInt935 + 26, i_867_ + 238, i_866_ + -35 + 352);
		}
		else
		{
			gameGraphics.drawText(16776960, 255, 1, "Waiting for other player...", i_867_ + 250, i_866_ + 234);
		}
		if (anInt887 == 1)
		{
			if ((this.mouseX < i_866_) || (i_867_ > this.mouseY) || (this.mouseX > (i_866_ + 468))
			        || (this.mouseY > (i_867_ + 262)))
			{
				aBool92 = false;
				streamClass.createPacket(230);
				streamClass.finishPacket();
			}
			if ((this.mouseX >= (i_866_ + 118 + -35)) && (((i_866_ + 118) - -70) >= this.mouseX)
			        && ((i_867_ + 238) <= this.mouseY) && (this.mouseY <= ((i_867_ - -238) + 21)))
			{
				aBool66 = true;
				streamClass.createPacket(77);
				streamClass.finishPacket();
			}
			if ((this.mouseX >= ((i_866_ + 352) - 35)) && (this.mouseX <= (i_866_ + 353 + 70))
			        && ((i_867_ + 238) <= this.mouseY) && (((i_867_ - -21) + 238) >= this.mouseY))
			{
				aBool92 = false;
				streamClass.createPacket(197);
				streamClass.finishPacket();
			}
			anInt887 = 0;
		}
	}

	private boolean loadSection(final int i, int i_871_, int i_872_)
	{
		if (playerAliveTimeout != 0)
		{
			engineHandle.playerIsAlive = false;
			return false;
		}
		i_871_ += wildX;
		notInWilderness = false;
		i_872_ += wildY;
		if ((lastWildYSubtract == wildYSubtract) && (anInt922 < i_871_) && (i_871_ < anInt876) && (i_872_ > anInt926)
		        && (i_872_ < anInt921))
		{
			engineHandle.playerIsAlive = true;
			return false;
		}
		gameGraphics.drawText(16777215, i ^ 0x253, 1, "Loading... Please wait", 192, 256);
		drawChatMessageTabs();
		gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
		final int i_873_ = areaX;
		final int i_874_ = areaY;
		final int i_875_ = (i_871_ - -24) / 48;
		lastWildYSubtract = wildYSubtract;
		areaX = (i_875_ * 48) + -48;
		final int i_876_ = (i_872_ + 24) / 48;
		areaY = (i_876_ * 48) + -48;
		anInt922 = (i_875_ * 48) + -32;
		anInt876 = (i_875_ * 48) + 32;
		anInt926 = (i_876_ * 48) + -32;
		if (i != 684)
		{
			return false;
		}
		anInt921 = (i_876_ * 48) + 32;
		engineHandle.method11(i_871_, lastWildYSubtract, i_872_);
		areaX -= wildX;
		areaY -= wildY;
		final int i_877_ = -i_873_ + areaX;
		final int i_878_ = -i_874_ + areaY;
		for (int index = 0; index < objectCount; index++)
		{
			objectX[index] -= i_877_;
			objectY[index] -= i_878_;
			final int i_880_ = objectX[index];
			final int i_881_ = objectY[index];
			final int i_882_ = objectType[index];
			final Model model = objectModelArray[index];
			final int i_883_ = objectRotation[index];
			int i_884_;
			int i_885_;
			if ((i_883_ != 0) && (i_883_ != 4))
			{
				i_884_ = EntityHandler.objectdef_width[i_882_];
				i_885_ = EntityHandler.objectdef_height[i_882_];
			}
			else
			{
				i_884_ = EntityHandler.objectdef_height[i_882_];
				i_885_ = EntityHandler.objectdef_width[i_882_];
			}
			final int i_886_ = ((i_880_ - (-i_880_ + -i_885_)) * tileSize) / 2;
			final int i_887_ = ((i_884_ + i_881_ + i_881_) * tileSize) / 2;
			if ((0 <= i_880_) && (i_881_ >= 0) && (96 > i_880_) && (96 > i_881_))
			{
				gameCamera.addModel(model);
				model.setOrigin(i_887_, -engineHandle.getAveragedElevation(i_887_, i_886_), i_886_);
				engineHandle.updateObjectAnd(i_882_, i_880_, i_881_);
				if (i_882_ == 74)
				{
					model.translate(1, 0, -480, 0);
				}
			}
		}
		for (int i_888_ = 0; i_888_ < wallObjectCount; i_888_++)
		{
			wallObjectX[i_888_] -= i_877_;
			wallObjectY[i_888_] -= i_878_;
			final int i_889_ = wallObjectX[i_888_];
			final int i_890_ = wallObjectY[i_888_];
			final int i_891_ = wallObjectType[i_888_];
			final int i_892_ = wallObjectDirection[i_888_];
			engineHandle.method15(i_892_, i_889_, i_891_, i_890_);
			final Model class23 = method506(false, i_888_, i_891_, i_889_, i_890_, i_892_);
			wallObjectModelArray[i_888_] = class23;
		}
		for (int index = 0; groundItemCount > index; index++)
		{
			groundItemX[index] -= i_877_;
			groundItemY[index] -= i_878_;
		}
		for (int index = 0; index < playerCount; index++)
		{
			final Mob mob = playerArray[index];
			mob.currentX -= i_877_ * tileSize;
			mob.currentY -= i_878_ * tileSize;
			for (int waypointIndex = 0; mob.waypointCurrentIndex >= waypointIndex; waypointIndex++)
			{
				mob.waypointsX[waypointIndex] -= i_877_ * tileSize;
				mob.waypointsY[waypointIndex] -= i_878_ * tileSize;
			}
		}
		for (int index = 0; npcCount > index; index++)
		{
			final Mob mob = npcArray[index];
			mob.currentY -= i_878_ * tileSize;
			mob.currentX -= i_877_ * tileSize;
			for (int waypointIndex = 0; mob.waypointCurrentIndex >= waypointIndex; waypointIndex++)
			{
				mob.waypointsX[waypointIndex] -= i_877_ * tileSize;
				mob.waypointsY[waypointIndex] -= i_878_ * tileSize;
			}
		}
		engineHandle.playerIsAlive = true;
		return true;
	}

	@Override
	protected void resetVars()
	{
		loggedIn = 1;
		maybe_loginScreenNumber = 0;
		logoutTimeout = 0;
		anInt1054 = 0;
		systemUpdate = 0;
		method566();
		gameGraphics.method331();
		gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
		for (int i_898_ = 0; objectCount > i_898_; i_898_++)
		{
			gameCamera.removeModel(objectModelArray[i_898_]);
			engineHandle.updateObjectAnd(objectType[i_898_], objectY[i_898_], objectX[i_898_], -30895);
		}
		for (int i_899_ = 0; wallObjectCount > i_899_; i_899_++)
		{
			gameCamera.removeModel(wallObjectModelArray[i_899_]);
			engineHandle.method42(wallObjectDirection[i_899_], wallObjectX[i_899_], wallObjectType[i_899_], wallObjectY[i_899_]);
		}
		playerCount = 0;
		groundItemCount = 0;
		wallObjectCount = 0;
		objectCount = 0;
		for (int i_900_ = 0; 4000 > i_900_; i_900_++)
		{
			mobArray[i_900_] = null;
		}
		for (int i_901_ = 0; 500 > i_901_; i_901_++)
		{
			playerArray[i_901_] = null;
		}
		npcCount = 0;
		for (int i_902_ = 0; 5000 > i_902_; i_902_++)
		{
			npcRecordArray[i_902_] = null;
		}
		for (int i_903_ = 0; i_903_ < 500; i_903_++)
		{
			npcArray[i_903_] = null;
		}
		for (int i_904_ = 0; 50 > i_904_; i_904_++)
		{
			aBoolArray11[i_904_] = false;
		}
		aBool81 = false;
		this.lastMouseDownButton = 0;
		this.mouseDownButton = 0;
		anInt994 = 0;
		anInt887 = 0;
		GameWindowMiddleMan.friendsCount = 0;
		aBool69 = false;
		showShop = false;
		for (int i_905_ = 0; i_905_ < 100; i_905_++)
		{
			Class2.aStringArray3[i_905_] = null;
			mudclient.messagesTimeout[i_905_] = 0;
			Class13.aStringArray13[i_905_] = null;
			GameImage.anIntArray126[i_905_] = 0;
			Class27.aStringArray23[i_905_] = null;
			CameraModel.aStringArray21[i_905_] = null;
			ByteBuffer.anIntArray142[i_905_] = 0;
		}
		gameMenu.resetListTextCount(0, anInt1052);
		gameMenu.resetListTextCount(0, anInt987);
		gameMenu.resetListTextCount(0, anInt990);
	}

	private Mob getNpcByServerIndex(final int serverIndex)
	{
		for (int index = 0; index < npcCount; index++)
		{
			if (npcArray[index].serverIndex == serverIndex)
			{
				return npcArray[index];
			}
		}
		return null;
	}

	private void method583()
	{
		AClass1_Sub1.storeModel("torcha2");
		AClass1_Sub1.storeModel("torcha3");
		AClass1_Sub1.storeModel("torcha4");
		AClass1_Sub1.storeModel("skulltorcha2");
		AClass1_Sub1.storeModel("skulltorcha3");
		AClass1_Sub1.storeModel("skulltorcha4");
		AClass1_Sub1.storeModel("firea2");
		AClass1_Sub1.storeModel("firea3");
		AClass1_Sub1.storeModel("fireplacea2");
		AClass1_Sub1.storeModel("fireplacea3");
		AClass1_Sub1.storeModel("firespell2");
		AClass1_Sub1.storeModel("firespell3");
		AClass1_Sub1.storeModel("lightning2");
		AClass1_Sub1.storeModel("lightning3");
		AClass1_Sub1.storeModel("clawspell2");
		AClass1_Sub1.storeModel("clawspell3");
		AClass1_Sub1.storeModel("clawspell4");
		AClass1_Sub1.storeModel("clawspell5");
		AClass1_Sub1.storeModel("spellcharge2");
		AClass1_Sub1.storeModel("spellcharge3");
		
		if (Class38.gameFrame == null || Custom.LOAD_FROM_DISK)
		{
			final byte[] models = unpackData("3d models", 60, 9);
			if (models == null)
			{
				lastLoadedNull = true;
			}
			else
			{
				for (int index = 0; index < Class4.modelNamesCount; index++)
				{
					final int i_909_ = (RuntimeException_Sub1.method461(Class2.modelNames[index] + ".ob3", models));
					if (i_909_ != 0)
					{
						modelCache[index] = new Model(models, i_909_);
					}
					else
					{
						modelCache[index] = new Model(1, 1);
					}
					if (Class2.modelNames[index].equals("giantcrystal"))
					{
						modelCache[index].isGiantCrystal = true;
					}
				}
			}
		}
		else
		{
			drawLoadingBarText(70, "Loading 3d models");
			for (int index = 0; index < Class4.modelNamesCount; index++)
			{
				modelCache[index] = new Model("../content/src/models/" + Class2.modelNames[index] + ".ob2");
				if (Class2.modelNames[index].equals("giantcrystal"))
				{
					modelCache[index].isGiantCrystal = true;
				}
			}
		}
	}

	private int inventoryCount(final int itemId)
	{
		int amount = 0;
		for (int index = 0; index < inventoryCount; index++)
		{
			if (inventoryItems[index] == itemId)
			{
				if (EntityHandler.itemdef_isUnstackable[itemId] != 1)
				{
					amount += inventoryItemsCount[index];
				}
				else
				{
					amount++;
				}
			}
		}
		return amount;
	}

	private void drawWildernessWarningBox()
	{
		int i = 97;
		gameGraphics.method321(77, 0, 180, 340, 86, 1);
		gameGraphics.method362(180, 86, 340, 16777215, 77);
		gameGraphics.drawText(16711680, 255, 4, "Warning! Proceed with caution", i, 256);
		i += 26;
		gameGraphics.drawText(16777215, 255, 1, "If you go much further north you will enter the", i, 256);
		i += 13;
		gameGraphics.drawText(16777215, 255, 1, "wilderness. This a very dangerous area where", i, 256);
		i += 13;
		gameGraphics.drawText(16777215, 255, 1, "other players can attack you!", i, 256);
		i += 22;
		gameGraphics.drawText(16777215, 255, 1, "The further north you go the more dangerous it", i, 256);
		i += 13;
		gameGraphics.drawText(16777215, 255, 1, "becomes, but the more treasure you will find.", i, 256);
		i += 22;
		gameGraphics.drawText(16777215, 255, 1, "In the wilderness an indicator at the bottom-right", i, 256);
		i += 13;
		gameGraphics.drawText(16777215, 255, 1, "of the screen will show the current level of danger", i, 256);
		i += 22;
		int i_913_ = 16777215;
		if (((i + -12) < this.mouseY) && (i >= this.mouseY) && (181 < this.mouseX) && (this.mouseX < 331))
		{
			i_913_ = 16711680;
		}
		gameGraphics.drawText(i_913_, 255, 1, "Click here to close window", i, 256);
		if (anInt887 != 0)
		{
			if (((i - 12) < this.mouseY) && (this.mouseY <= i) && (this.mouseX > 181) && (this.mouseX < 331))
			{
				wildernessType = 2;
			}
			anInt887 = 0;
			if ((86 > this.mouseX) || (this.mouseX > 426) || (this.mouseY < 77) || (this.mouseY > 257))
			{
				wildernessType = 2;
			}
		}
	}

	private void addToFriendsList(final String string)
	{
		if ((!isMembers ? 100 : 200) <= GameWindowMiddleMan.friendsCount)
		{
			displayMessage(0, "Friend list is full", 0, null, -107, null, null, false);
		}
		else
		{
			final String string_914_ = Class43.method298(string);
			if (string_914_ != null)
			{
				for (int i_915_ = 0; GameWindowMiddleMan.friendsCount > i_915_; i_915_++)
				{
					if (string_914_.equals(Class43.method298((friendsListNames[i_915_]))))
					{
						displayMessage(0, new StringBuilder().append(string).append(" is already on your friend list.")
						        .toString(), 0, null, -33, null, null, false);
						return;
					}
					if ((RuntimeException_Sub1.aStringArray41[i_915_] != null) && (string_914_
					        .equals(Class43.method298((RuntimeException_Sub1.aStringArray41[i_915_])))))
					{
						displayMessage(0, new StringBuilder().append(string).append(" is already on your friend list.")
						        .toString(), 0, null, -115, null, null, false);
						return;
					}
				}
				for (int i_916_ = 0; i_916_ < GameWindowMiddleMan.ignoreListCount; i_916_++)
				{
					if (string_914_.equals(Class43.method298((GameWindowMiddleMan.ignoreListNames[i_916_]))))
					{
						displayMessage(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your ignore list first.").toString(),
						        0, null, -19, null, null, false);
						return;
					}
					if ((EngineHandle.aStringArray7[i_916_] != null)
					        && string_914_.equals(Class43.method298((EngineHandle.aStringArray7[i_916_]))))
					{
						displayMessage(0,
						        new StringBuilder().append("Please remove ").append(string)
						                .append(" from your ignore list first.").toString(),
						        0, null, -87, null, null, false);
						return;
					}
				}
				if (string_914_.equals(Class43.method298((ourPlayer.maybe_accountName))))
				{
					displayMessage(0, "You can't add yourself to your own friend list.", 0, null, -24, null, null, false);
				}
				else
				{
					streamClass.createPacket(195);
					streamClass.aClass27_Sub1_Sub1_1.method389(0, string);
					streamClass.finishPacket();
				}
			}
		}
	}

	private void method587()
	{
		if (super.socketTimeout > 0)
		{
			super.socketTimeout--;
		}
		if (maybe_loginScreenNumber == 0)
		{
			aClass10_7.method85(this.mouseDownButton, this.mouseY, this.lastMouseDownButton, this.mouseX);
			if (aClass10_7.method81(anInt1040))
			{
				maybe_loginScreenNumber = 2;
				menuLogin.updateText("", anInt1005);
				menuLogin.updateText("Please enter your username and password", anInt1037);
				menuLogin.updateText("", anInt1002);
				menuLogin.updateText("", anInt942);
				menuLogin.setFocus(anInt1002);
			}
		}
		else if (maybe_loginScreenNumber == 2)
		{
			menuLogin.method85(this.mouseDownButton, this.mouseY, this.lastMouseDownButton, this.mouseX);
			if (menuLogin.method81(anInt1033))
			{
				maybe_loginScreenNumber = 0;
			}
			if (menuLogin.method81(anInt1002))
			{
				menuLogin.setFocus(anInt942);
			}
			if (menuLogin.method81(anInt942) || menuLogin.method81(anInt1008))
			{
				loginUsername = menuLogin.getText(anInt1002);
				loginPassword = menuLogin.getText(anInt942);
				reconnectTries = 2;
				login(loginPassword, loginUsername, false);
			}
		}
	}

	@Override
	void method470()
	{
		if (!aBool50 && !memoryError && !lastLoadedNull)
		{
			if (aClass37_1 != null)
			{
				aClass37_1.method234();
			}
			try
			{
				anInt930++;
				if (loggedIn == 0)
				{
					this.lastActionTimeout = 0;
					method587();
				}
				if (loggedIn == 1)
				{
					this.lastActionTimeout++;
					method591(56);
				}
				this.lastMouseDownButton = 0;
				anInt937++;
				if (anInt937 > 500)
				{
					anInt937 = 0;
					final int i_917_ = (int) (Math.random() * 4.0);
					if ((i_917_ & 0x1) == 1)
					{
						anInt882 += anInt886;
					}
					if ((i_917_ & 0x2) == 2)
					{
						anInt923 += anInt864;
					}
				}
				if (anInt882 < -50)
				{
					anInt886 = 2;
				}
				if (anInt882 > 50)
				{
					anInt886 = -2;
				}
				if (-50 > anInt923)
				{
					anInt864 = 2;
				}
				if (anInt943 > 0)
				{
					anInt943--;
				}
				if (anInt1056 > 0)
				{
					anInt1056--;
				}
				if (anInt981 > 0)
				{
					anInt981--;
				}
				if (anInt923 > 50)
				{
					anInt864 = -2;
				}
				if (anInt986 > 0)
				{
					anInt986--;
				}
			}
			catch (final OutOfMemoryError outofmemoryerror)
			{
				memoryError = true;
			}
		}
	}

	private void method588(final int i)
	{
		anInt1048 = 0;
		boolean bool = true;
		if ((this.mouseX >= 36) && (this.mouseX < 176))
		{
			anInt1048 = 1;
		}
		else if ((this.mouseX < 186) || (326 <= this.mouseX))
		{
			if ((336 > this.mouseX) || (this.mouseX >= 476))
			{
				bool = false;
			}
			else
			{
				anInt1048 = 12;
			}
		}
		else
		{
			anInt1048 = 7;
		}
		int i_918_ = 156;
		if (bool)
		{
			bool = false;
			for (int i_919_ = 0; 6 > i_919_; i_919_++)
			{
				final int i_920_ = i_919_ == 0 ? 30 : 18;
				if (((i_918_ + -12) < this.mouseY) && (this.mouseY < ((i_918_ - 12) + i_920_)))
				{
					if (anInt1048 == 1)
					{
						bool = true;
						anInt1048 += i_919_;
						break;
					}
					if (anInt1048 == 7)
					{
						if (i_919_ < 5)
						{
							anInt1048 += i_919_;
							bool = true;
						}
						break;
					}
					if (anInt1048 == 12)
					{
						if (3 > i_919_)
						{
							anInt1048 += i_919_;
							bool = true;
						}
						break;
					}
				}
				i_918_ = i_918_ + i_920_ + 2;
			}
		}
		if (!bool)
		{
			anInt1048 = 0;
		}
		if ((anInt887 != 0) && (anInt1048 != 0))
		{
			streamClass.createPacket(206);
			streamClass.aClass27_Sub1_Sub1_1.method389(0, aString33);
			streamClass.aClass27_Sub1_Sub1_1.put(anInt1048);
			streamClass.aClass27_Sub1_Sub1_1.put(aBool76 ? 1 : 0);
			streamClass.finishPacket();
			anInt994 = 0;
			anInt887 = 0;
			this.aString26 = "";
			this.aString27 = "";
		}
		else
		{
			i_918_ += 15;
			if (anInt887 != 0)
			{
				anInt887 = 0;
				if ((this.mouseX < 31) || (this.mouseY < 35) || (481 < this.mouseX) || (310 < this.mouseY))
				{
					anInt994 = 0;
					return;
				}
				if ((66 < this.mouseX) && (this.mouseX < 446) && ((i_918_ - 15) <= this.mouseY)
				        && ((i_918_ + 5) > this.mouseY))
				{
					anInt994 = 0;
					return;
				}
			}
			gameGraphics.method321(35, 0, 275, 450, 31, 1);
			i_918_ = 50;
			gameGraphics.method362(275, 31, 450, 16777215, 35);
			gameGraphics.drawText(16777215, i ^ 0xf0, 1,
			        "This form is for reporting players who are breaking our rules", i_918_, 256);
			i_918_ += 15;
			gameGraphics.drawText(16777215, 255, 1,
			        "Using it sends a snapshot of the last 60 seconds of activity to us", i_918_, 256);
			i_918_ += 15;
			gameGraphics.drawText(16744448, 255, 1, "If you misuse this form, you will be banned.", i_918_, 256);
			i_918_ += 15;
			i_918_ += 10;
			gameGraphics.drawText(16776960, 255, 1,
			        "Click on the most suitable option from the Rules of RuneScape.", i_918_, 256);
			i_918_ += i;
			gameGraphics.drawText(16776960, 255, 1,
			        "This will send a report to our Player Support team for investigation.", i_918_, 256);
			i_918_ += 18;
			gameGraphics.drawText(16711680, 255, 4, "Honour", i_918_, 106);
			gameGraphics.drawText(16711680, 255, 4, "Respect", i_918_, 256);
			gameGraphics.drawText(16711680, i ^ 0xf0, 4, "Security", i_918_, 406);
			i_918_ += 18;
			if (anInt1048 == 1)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 30, 140, 36, 1);
			}
			gameGraphics.method362(30, 36, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 7)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 30, 140, 186, 1);
			}
			gameGraphics.method362(30, 186, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 12)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 30, 140, 336, 1);
			}
			gameGraphics.method362(30, 336, 140, 4210752, i_918_ + -12);
			int i_921_;
			if (anInt1048 == 1)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Buying or", i_918_, 106);
			if (anInt1048 == 7)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Seriously offensive", i_918_, 256);
			if (anInt1048 == 12)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Asking for or providing", i_918_, 406);
			if (anInt1048 == 1)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			i_918_ += 12;
			gameGraphics.drawText(i_921_, 255, 0, "selling an account", i_918_, 106);
			if (anInt1048 != 7)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, i ^ 0xf0, 0, "language", i_918_, 256);
			if (anInt1048 != 12)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, i + 240, 0, "contact information", i_918_, 406);
			i_918_ += 20;
			if (anInt1048 == 2)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			gameGraphics.method362(18, 36, 140, 4210752, i_918_ - 12);
			if (anInt1048 == 8)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 186, 1);
			}
			gameGraphics.method362(18, 186, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 13)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 336, i ^ 0xe);
			}
			gameGraphics.method362(18, 336, 140, 4210752, i_918_ + -12);
			if (anInt1048 != 2)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Encouraging rule-breaking", i_918_, 106);
			if (anInt1048 != 8)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Solicitation", i_918_, 256);
			if (anInt1048 != 13)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Breaking real-world laws", i_918_, 406);
			i_918_ += 20;
			if (anInt1048 == 3)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			gameGraphics.method362(18, 36, 140, 4210752, i_918_ - 12);
			if (anInt1048 == 9)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 186, i ^ 0xe);
			}
			gameGraphics.method362(18, 186, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 14)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 336, 1);
			}
			gameGraphics.method362(18, 336, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 3)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Staff impersonation", i_918_, 106);
			if (anInt1048 != 9)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Disruptive behaviour", i_918_, 256);
			if (anInt1048 != 14)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, i ^ 0xf0, 0, "Advertising websites", i_918_, 406);
			i_918_ += 20;
			if (anInt1048 == 4)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 36, i + -14);
			}
			gameGraphics.method362(18, 36, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 10)
			{
				gameGraphics.method321(i_918_ - 12, 3158064, 18, 140, 186, i + -14);
			}
			gameGraphics.method362(18, 186, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 4)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Macroing or use of bots", i_918_, 106);
			if (anInt1048 == 10)
			{
				i_921_ = 16744448;
			}
			else
			{
				i_921_ = 16777215;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Offensive account name", i_918_, 256);
			i_918_ += 20;
			if (anInt1048 == 5)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			gameGraphics.method362(18, 36, 140, 4210752, i_918_ + -12);
			if (anInt1048 == 11)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 186, i + -14);
			}
			gameGraphics.method362(18, 186, 140, 4210752, i_918_ - 12);
			if (anInt1048 != 5)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Scamming", i_918_, 106);
			if (anInt1048 != 11)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Real-life threats", i_918_, 256);
			i_918_ += 20;
			if (anInt1048 == 6)
			{
				gameGraphics.method321(i_918_ + -12, 3158064, 18, 140, 36, 1);
			}
			gameGraphics.method362(18, 36, 140, 4210752, i_918_ + -12);
			if (anInt1048 != 6)
			{
				i_921_ = 16777215;
			}
			else
			{
				i_921_ = 16744448;
			}
			gameGraphics.drawText(i_921_, 255, 0, "Exploiting a bug", i_918_, 106);
			i_918_ += 18;
			i_918_ += 15;
			i_921_ = 16777215;
			if ((this.mouseX > 196) && (316 > this.mouseX) && ((i_918_ + -15) < this.mouseY)
			        && (this.mouseY < (i_918_ - -5)))
			{
				i_921_ = 16776960;
			}
			gameGraphics.drawText(i_921_, 255, 1, "Click here to cancel", i_918_, 256);
		}
	}

	private void method589()
	{
		anInt982 = anInt952;
		for (int i_922_ = 0; i_922_ < anInt952; i_922_++)
		{
			anIntArray210[i_922_] = anIntArray177[i_922_];
			anIntArray184[i_922_] = anIntArray207[i_922_];
		}
		for (int i_923_ = 0; (inventoryCount > i_923_) && (anInt982 < anInt1017); i_923_++)
		{
			final int i_924_ = inventoryItems[i_923_];
			boolean bool = false;
			for (int i_925_ = 0; anInt982 > i_925_; i_925_++)
			{
				if (i_924_ == anIntArray210[i_925_])
				{
					bool = true;
					break;
				}
			}
			if (!bool)
			{
				anIntArray210[anInt982] = i_924_;
				anIntArray184[anInt982] = 0;
				anInt982++;
			}
		}
	}

	private void method590(final int i)
	{
		if ((0 <= anInt940) || (0 <= anInt989))
		{
			aClass29_1.method209("Cancel", "", 4000);
		}
		aClass29_1.method199(i + 10);
		final int i_926_ = aClass29_1.method198();
		for (int i_927_ = i_926_; 20 < i_927_; i_927_--)
		{
			aClass29_1.method202(i_927_ + -1);
		}
		if (anInt939 == 5)
		{
			String string = null;
			if ((anInt1042 == 0) && (anInt1016 != -1))
			{
				if (0 > anInt1016)
				{
					final int i_928_ = -(anInt1016 + 2);
					string = new StringBuilder().append("Click to remove ").append(GameWindowMiddleMan.friendsListNames[i_928_])
					        .toString();
					if ((RuntimeException_Sub1.aStringArray41[i_928_] != null)
					        && (0 < RuntimeException_Sub1.aStringArray41[i_928_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(RuntimeException_Sub1.aStringArray41[i_928_]).append(")").toString();
					}
				}
				else
				{
					String string_929_ = "";
					final int i_930_ = anInt1016;
					if ((0x4 & GameWindowMiddleMan.friendsListOnlineStatus[i_930_]) == 0)
					{
						string = GameWindowMiddleMan.friendsListNames[i_930_];
						string_929_ = " is offline";
					}
					else
					{
						if (Menu.aStringArray8[i_930_] != null)
						{
							string_929_ = new StringBuilder().append(" on ").append(Menu.aStringArray8[i_930_])
							        .toString();
						}
						string = new StringBuilder().append("Click to message ").append(GameWindowMiddleMan.friendsListNames[i_930_])
						        .toString();
					}
					if ((RuntimeException_Sub1.aStringArray41[i_930_] != null)
					        && (0 < RuntimeException_Sub1.aStringArray41[i_930_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(RuntimeException_Sub1.aStringArray41[i_930_]).append(")").append(string_929_)
						        .toString();
					}
					else
					{
						string = new StringBuilder().append(string).append(string_929_).toString();
					}
				}
			}
			if ((anInt1042 == 1) && (anInt997 != -1))
			{
				if (anInt997 < 0)
				{
					final int i_931_ = -(anInt997 - -2);
					string = new StringBuilder().append("Click to remove ").append(GameWindowMiddleMan.ignoreListNames[i_931_])
					        .toString();
					if ((EngineHandle.aStringArray7[i_931_] != null) && (0 < EngineHandle.aStringArray7[i_931_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(EngineHandle.aStringArray7[i_931_]).append(")").toString();
					}
				}
				else
				{
					final int i_932_ = anInt997;
					string = new StringBuilder().append("Ignoring ").append(GameWindowMiddleMan.ignoreListNames[i_932_]).toString();
					if ((EngineHandle.aStringArray7[i_932_] != null) && (0 < EngineHandle.aStringArray7[i_932_].length()))
					{
						string = new StringBuilder().append(string).append(" (formerly ")
						        .append(EngineHandle.aStringArray7[i_932_]).append(")").toString();
					}
				}
			}
			if (string != null)
			{
				gameGraphics.method324(string, 0, 1, 16776960, 6, 14);
			}
		}
		final int i_933_ = aClass29_1.method198();
		if (i < i_933_)
		{
			int i_934_ = -1;
			for (int i_935_ = 0; i_933_ > i_935_; i_935_++)
			{
				final String string = aClass29_1.method201(i_935_);
				if ((string != null) && (string.length() > 0))
				{
					i_934_ = i_935_;
					break;
				}
			}
			String string = null;
			if (((anInt989 < 0) && (0 > anInt940)) || (i_933_ != 1))
			{
				if (((0 <= anInt989) || (0 <= anInt940)) && (1 < i_933_))
				{
					string = new StringBuilder().append("@whi@").append(aClass29_1.method205(0, (byte) 118)).append(" ")
					        .append(aClass29_1.method201(0)).toString();
				}
				else if (i_934_ != -1)
				{
					string = new StringBuilder().append(aClass29_1.method201(i_934_)).append(": @whi@")
					        .append(aClass29_1.method205(0, (byte) 126)).toString();
				}
			}
			else
			{
				string = "Choose a target";
			}
			if ((i_933_ == 2) && (string != null))
			{
				string = new StringBuilder().append(string).append("@whi@ / 1 more option").toString();
			}
			if ((i_933_ > 2) && (string != null))
			{
				string = new StringBuilder().append(string).append("@whi@ / ").append(i_933_ + -1)
				        .append(" more options").toString();
			}
			if (string != null)
			{
				gameGraphics.method324(string, i ^ 0x0, 1, 16776960, 6, 14);
			}
			if ((!configMouseButtons && (anInt887 == 1)) || (configMouseButtons && (anInt887 == 1) && (i_933_ == 1)))
			{
				if (!this.aBool44 || !this.aBool42 || !aBool82)
				{
					method569(0, 617);
				}
				else
				{
					streamClass.createPacket(59);
					streamClass.aClass27_Sub1_Sub1_1.putShort(anInt1032);
					streamClass.aClass27_Sub1_Sub1_1.putShort(anInt958);
					streamClass.finishPacket();
				}
				anInt887 = 0;
			}
			else if ((!configMouseButtons && (anInt887 == 2)) || (configMouseButtons && (anInt887 == 1)))
			{
				final int i_936_ = aClass29_1.method207();
				final int i_937_ = aClass29_1.method210(0);
				anInt984 = this.mouseY + -7;
				anInt955 = this.mouseX + -(i_936_ / 2);
				aBool61 = true;
				if (0 > anInt955)
				{
					anInt955 = 0;
				}
				if (0 > anInt984)
				{
					anInt984 = 0;
				}
				if ((i_937_ + anInt984) > 315)
				{
					anInt984 = -i_937_ + 315;
				}
				anInt887 = 0;
				if ((anInt955 - -i_936_) > 510)
				{
					anInt955 = -i_936_ + 510;
				}
			}
		}
	}

	private void method591(final int i)
	{
		if (systemUpdate > 1)
		{
			systemUpdate--;
		}
		sendPingPacketReadPacketData();
		if (logoutTimeout > 0)
		{
			logoutTimeout--;
		}
		if ((15000 < this.lastActionTimeout) && (combatTimeout == 0) && (logoutTimeout == 0))
		{
			this.lastActionTimeout -= 15000;
			
			if(Custom.ALLOW_CLIENTSIDE_IDLE)
			{
				sendLogout();
			}
		}
		else
		{
			if ((ourPlayer.currentSprite == 8) || (ourPlayer.currentSprite == 9))
			{
				combatTimeout = 500;
			}
			if (0 < combatTimeout)
			{
				combatTimeout--;
			}
			if (showCharacterLookScreen)
			{
				method520();
			}
			else
			{
				for (int i_938_ = 0; i_938_ < playerCount; i_938_++)
				{
					final Mob class15 = playerArray[i_938_];
					final int i_939_ = (class15.waypointCurrentIndex + 1) % 10;
					if (i_939_ != class15.waypointEndSprite)
					{
						int i_940_ = -1;
						final int i_941_ = class15.waypointEndSprite;
						int i_942_;
						if (i_939_ <= i_941_)
						{
							i_942_ = i_939_ + (10 - i_941_);
						}
						else
						{
							i_942_ = -i_941_ + i_939_;
						}
						int i_943_ = 4;
						if (2 < i_942_)
						{
							i_943_ = (i_942_ * 4) + -4;
						}
						if (((tileSize * 3) >= (class15.waypointsX[i_941_] + -class15.currentX))
						        && ((class15.waypointsY[i_941_] - class15.currentY) <= (tileSize * 3))
						        && ((class15.waypointsX[i_941_] + -class15.currentX) >= (-tileSize * 3))
						        && ((class15.waypointsY[i_941_] + -class15.currentY) >= (-tileSize * 3))
						        && (i_942_ <= 8))
						{
							if (class15.waypointsX[i_941_] > class15.currentX)
							{
								i_940_ = 2;
								class15.currentX += i_943_;
								class15.stepFrame++;
							}
							else if (class15.currentX > (class15.waypointsX[i_941_]))
							{
								class15.currentX -= i_943_;
								i_940_ = 6;
								class15.stepFrame++;
							}
							if (((-class15.waypointsX[i_941_] + class15.currentX) < i_943_)
							        && ((class15.currentX - (class15.waypointsX[i_941_])) > -i_943_))
							{
								class15.currentX = class15.waypointsX[i_941_];
							}
							if (class15.waypointsY[i_941_] <= class15.currentY)
							{
								if (class15.waypointsY[i_941_] < class15.currentY)
								{
									class15.currentY -= i_943_;
									if (i_940_ == -1)
									{
										i_940_ = 0;
									}
									else if (i_940_ == 2)
									{
										i_940_ = 1;
									}
									else
									{
										i_940_ = 7;
									}
									class15.stepFrame++;
								}
							}
							else
							{
								class15.currentY += i_943_;
								class15.stepFrame++;
								if (i_940_ == -1)
								{
									i_940_ = 4;
								}
								else if (i_940_ == 2)
								{
									i_940_ = 3;
								}
								else
								{
									i_940_ = 5;
								}
							}
							if (((-class15.waypointsY[i_941_] + class15.currentY) < i_943_)
							        && ((-class15.waypointsY[i_941_] + class15.currentY) > -i_943_))
							{
								class15.currentY = class15.waypointsY[i_941_];
							}
						}
						else
						{
							class15.currentX = class15.waypointsX[i_941_];
							class15.currentY = class15.waypointsY[i_941_];
						}
						if (i_940_ != -1)
						{
							class15.currentSprite = i_940_;
						}
						if ((class15.currentX == class15.waypointsX[i_941_])
						        && (class15.currentY == class15.waypointsY[i_941_]))
						{
							class15.waypointEndSprite = (i_941_ + 1) % 10;
						}
					}
					else
					{
						class15.currentSprite = class15.nextSprite;
					}
					if (0 < class15.anInt145)
					{
						class15.anInt145--;
					}
					if (class15.anInt165 > 0)
					{
						class15.anInt165--;
					}
					if (0 < class15.anInt168)
					{
						class15.anInt168--;
					}
					if (playerAliveTimeout > 0)
					{
						playerAliveTimeout--;
						if (playerAliveTimeout == 0)
						{
							displayMessage(0, "You have been granted another life. Be more careful this time!", 0, null, -39,
							        null, null, false);
						}
						if (playerAliveTimeout == 0)
						{
							displayMessage(0, "You retain your skills. Your objects land where you died", 0, null, -69, null,
							        null, false);
						}
					}
				}
				for (int i_944_ = 0; i_944_ < npcCount; i_944_++)
				{
					final Mob class15 = npcArray[i_944_];
					final int i_945_ = (class15.waypointCurrentIndex + 1) % 10;
					if (i_945_ == class15.waypointEndSprite)
					{
						if (class15.type == 43)
						{
							class15.stepFrame++;
						}
						class15.currentSprite = class15.nextSprite;
					}
					else
					{
						int i_946_ = -1;
						final int i_947_ = class15.waypointEndSprite;
						int i_948_;
						if (i_945_ > i_947_)
						{
							i_948_ = -i_947_ + i_945_;
						}
						else
						{
							i_948_ = -i_947_ + i_945_ + 10;
						}
						int i_949_ = 4;
						if (i_948_ > 2)
						{
							i_949_ = (i_948_ + -1) * 4;
						}
						if (((class15.waypointsX[i_947_] + -class15.currentX) <= (tileSize * 3))
						        && ((class15.waypointsY[i_947_] + -class15.currentY) <= (tileSize * 3))
						        && ((-tileSize * 3) <= (class15.waypointsX[i_947_] + -class15.currentX))
						        && ((-tileSize * 3) <= (class15.waypointsY[i_947_] - class15.currentY))
						        && (i_948_ <= 8))
						{
							if (class15.currentX < class15.waypointsX[i_947_])
							{
								i_946_ = 2;
								class15.currentX += i_949_;
								class15.stepFrame++;
							}
							else if (class15.currentX > (class15.waypointsX[i_947_]))
							{
								class15.currentX -= i_949_;
								i_946_ = 6;
								class15.stepFrame++;
							}
							if ((i_949_ > (-class15.waypointsX[i_947_] + class15.currentX))
							        && ((-class15.waypointsX[i_947_] + class15.currentX) > -i_949_))
							{
								class15.currentX = class15.waypointsX[i_947_];
							}
							if (class15.currentY >= class15.waypointsY[i_947_])
							{
								if (class15.currentY > (class15.waypointsY[i_947_]))
								{
									class15.stepFrame++;
									if (i_946_ == -1)
									{
										i_946_ = 0;
									}
									else if (i_946_ != 2)
									{
										i_946_ = 7;
									}
									else
									{
										i_946_ = 1;
									}
									class15.currentY -= i_949_;
								}
							}
							else
							{
								class15.currentY += i_949_;
								if (i_946_ == -1)
								{
									i_946_ = 4;
								}
								else if (i_946_ == 2)
								{
									i_946_ = 3;
								}
								else
								{
									i_946_ = 5;
								}
								class15.stepFrame++;
							}
							if ((i_949_ > (-class15.waypointsY[i_947_] + class15.currentY))
							        && (-i_949_ < (-(class15.waypointsY[i_947_]) + class15.currentY)))
							{
								class15.currentY = class15.waypointsY[i_947_];
							}
						}
						else
						{
							class15.currentX = class15.waypointsX[i_947_];
							class15.currentY = class15.waypointsY[i_947_];
						}
						if (i_946_ != -1)
						{
							class15.currentSprite = i_946_;
						}
						if ((class15.currentX == class15.waypointsX[i_947_])
						        && (class15.currentY == class15.waypointsY[i_947_]))
						{
							class15.waypointEndSprite = (i_947_ - -1) % 10;
						}
					}
					if (0 < class15.anInt168)
					{
						class15.anInt168--;
					}
					if (0 < class15.anInt145)
					{
						class15.anInt145--;
					}
					if (0 < class15.anInt165)
					{
						class15.anInt165--;
					}
				}
				if (anInt939 != 2)
				{
					if (0 < GameImage.anInt569)
					{
						anInt1027++;
					}
					GameImage.anInt569 = 0;
					if (Class3.anInt7 > 0)
					{
						anInt1027 = 0;
					}
					Class3.anInt7 = 0;
				}
				for (int i_950_ = 0; i_950_ < playerCount; i_950_++)
				{
					final Mob class15 = playerArray[i_950_];
					if (class15.anInt158 > 0)
					{
						class15.anInt158--;
					}
				}
				if (anInt1027 > 20)
				{
					anInt1027 = 0;
					aBool73 = false;
				}
				if (!aBool80)
				{
					if ((-500 > (anInt906 + -ourPlayer.currentX)) || (500 < (anInt906 + -ourPlayer.currentX))
					        || (-500 > (anInt907 - ourPlayer.currentY)) || (500 < (anInt907 + -ourPlayer.currentY)))
					{
						anInt906 = ourPlayer.currentX;
						anInt907 = ourPlayer.currentY;
					}
					if (ourPlayer.currentY != anInt907)
					{
						anInt907 += ((-anInt907 + ourPlayer.currentY) / (((maybe_cameraHeight - 500) / 15) + 16));
					}
					if (ourPlayer.currentX != anInt906)
					{
						anInt906 += ((-anInt906 + ourPlayer.currentX) / (((-500 + maybe_cameraHeight) / 15) + 16));
					}
					if (configAutoCameraAngle)
					{
						final int i_951_ = anInt933 * 32;
						int i_952_ = i_951_ + -anInt843;
						int i_953_ = 1;
						if (i_952_ == 0)
						{
							anInt885 = 0;
						}
						else
						{
							if (i_952_ <= 128)
							{
								if (0 < i_952_)
								{
									i_953_ = 1;
								}
								else if (-128 > i_952_)
								{
									i_953_ = 1;
									i_952_ = 256 - -i_952_;
								}
								else if (i_952_ < 0)
								{
									i_952_ = -i_952_;
									i_953_ = -1;
								}
							}
							else
							{
								i_953_ = -1;
								i_952_ = -i_952_ + 256;
							}
							anInt885++;
							anInt843 += i_953_ * (((i_952_ * anInt885) + 255) / 256);
							anInt843 &= 0xff;
						}
					}
				}
				else if (((anInt906 + -ourPlayer.currentX) < -500) || (500 < (anInt906 + -ourPlayer.currentX))
				        || ((anInt907 + -ourPlayer.currentY) < -500) || (500 < (anInt907 - ourPlayer.currentY)))
				{
					anInt906 = ourPlayer.currentX;
					anInt907 = ourPlayer.currentY;
				}
				if (aBool69)
				{
					if (this.aString26.length() > 0)
					{
						if (this.aString26.equalsIgnoreCase("::lostcon") && !maybe_isApplet)
						{
							streamClass.closeStream();
						}
						else if (!this.aString26.equalsIgnoreCase("::closecon") || maybe_isApplet)
						{
							streamClass.createPacket(45);
							if (!aBool73)
							{
								streamClass.aClass27_Sub1_Sub1_1.put(0);
								aBool73 = true;
							}
							else
							{
								streamClass.aClass27_Sub1_Sub1_1.put(1);
							}
							streamClass.aClass27_Sub1_Sub1_1.method389(0, this.aString26);
							streamClass.finishPacket();
							this.aString26 = "";
							aString35 = "Please wait...";
							this.aString27 = "";
						}
						else
						{
							sendLogoutPacket(true);
						}
					}
					if ((this.lastMouseDownButton == 1) && (275 < this.mouseY) && (310 > this.mouseY) && (this.mouseX > 56)
					        && (456 > this.mouseX))
					{
						streamClass.createPacket(45);
						if (aBool73)
						{
							streamClass.aClass27_Sub1_Sub1_1.put(1);
						}
						else
						{
							streamClass.aClass27_Sub1_Sub1_1.put(0);
							aBool73 = true;
						}
						streamClass.aClass27_Sub1_Sub1_1.method389(0, "-null-");
						streamClass.finishPacket();
						aString35 = "Please wait...";
						this.aString26 = "";
						this.aString27 = "";
					}
					this.lastMouseDownButton = 0;
				}
				else
				{
					if (this.mouseY > (windowHeight + -4))
					{
						if ((15 < this.mouseX) && (96 > this.mouseX) && (this.lastMouseDownButton == 1))
						{
							messagesTab = 0;
						}
						if ((this.mouseX > 110) && (this.mouseX < 194) && (this.lastMouseDownButton == 1))
						{
							messagesTab = 1;
							gameMenu.anIntArray23[anInt1052] = 999999;
						}
						if ((215 < this.mouseX) && (this.mouseX < 295) && (this.lastMouseDownButton == 1))
						{
							messagesTab = 2;
							gameMenu.anIntArray23[anInt987] = 999999;
						}
						if ((this.mouseX > 315) && (395 > this.mouseX) && (this.lastMouseDownButton == 1))
						{
							messagesTab = 3;
							gameMenu.anIntArray23[anInt990] = 999999;
						}
						if ((this.mouseX > 417) && (497 > this.mouseX) && (this.lastMouseDownButton == 1))
						{
							this.aString26 = "";
							this.aString27 = "";
							anInt994 = 1;
						}
						this.lastMouseDownButton = 0;
						this.mouseDownButton = 0;
					}
					gameMenu.method85(this.mouseDownButton, this.mouseY, this.lastMouseDownButton, this.mouseX);
					if ((messagesTab > 0) && (this.mouseX >= 494) && (this.mouseY >= (windowHeight + -66)))
					{
						this.lastMouseDownButton = 0;
					}
					if (gameMenu.method81(chatHandle))
					{
						final String string = gameMenu.getText(chatHandle);
						
						if(Custom.EXISTS)
						{
							Custom.lastMessage = string;
						}
						
						gameMenu.updateText("", chatHandle);
						if (string.startsWith("::"))
						{
							if (string.equalsIgnoreCase("::closecon") && !maybe_isApplet)
							{
								streamClass.closeStream();
							}
							else if (string.equalsIgnoreCase("::logout") && !maybe_isApplet)
							{
								sendLogoutPacket(true);
							}
							else if (!string.equalsIgnoreCase("::lostcon") || maybe_isApplet)
							{
								sendChatCommand(string.substring(2));
							}
							else
							{
								lostConnection();
							}
						}
						else
						{
							sendChatMessage(string);
						}
					}
					if (i == 56)
					{
						for (int i_954_ = 0; 100 > i_954_; i_954_++)
						{
							if (0 < mudclient.messagesTimeout[i_954_])
							{
								mudclient.messagesTimeout[i_954_]--;
							}
						}
						if (!aBool84 && !aBool72)
						{
							anInt1036 = 0;
							anInt1009 = 0;
						}
						else
						{
							if (this.mouseDownButton != 0)
							{
								anInt1009++;
							}
							else
							{
								anInt1009 = 0;
							}
							if (anInt1009 <= 600)
							{
								if (450 < anInt1009)
								{
									anInt1036 += 500;
								}
								else if (300 < anInt1009)
								{
									anInt1036 += 50;
								}
								else if (anInt1009 <= 150)
								{
									if (50 >= anInt1009)
									{
										if ((anInt1009 > 20) && ((anInt1009 & 0x5) == 0))
										{
											anInt1036++;
										}
									}
									else
									{
										anInt1036++;
									}
								}
								else
								{
									anInt1036 += 5;
								}
							}
							else
							{
								anInt1036 += 5000;
							}
						}
						if (playerAliveTimeout != 0)
						{
							this.lastMouseDownButton = 0;
						}
						if (this.lastMouseDownButton == 1)
						{
							anInt887 = 1;
						}
						else if (this.lastMouseDownButton == 2)
						{
							anInt887 = 2;
						}
						gameCamera.method286(this.mouseY, this.mouseX);
						this.lastMouseDownButton = 0;
						if (configAutoCameraAngle)
						{
							if ((anInt885 == 0) || aBool80)
							{
								if (this.aBool41)
								{
									this.aBool41 = false;
									anInt933 = 0x7 & (anInt933 + 1);
									if (!aBool53)
									{
										if ((0x1 & anInt933) == 0)
										{
											anInt933 = 0x7 & (anInt933 - -1);
										}
										for (int i_955_ = 0; ((i_955_ < 8) && !method541(anInt933)); i_955_++)
										{
											anInt933 = 0x7 & (anInt933 - -1);
										}
									}
								}
								if (this.aBool43)
								{
									anInt933 = 0x7 & (anInt933 + 7);
									this.aBool43 = false;
									if (!aBool53)
									{
										if ((0x1 & anInt933) == 0)
										{
											anInt933 = 0x7 & (anInt933 + 7);
										}
										for (int i_956_ = 0; ((i_956_ < 8) && !method541(anInt933)); i_956_++)
										{
											anInt933 = (anInt933 + 7) & 0x7;
										}
									}
								}
							}
						}
						else if (!this.aBool41)
						{
							if (this.aBool43)
							{
								anInt843 = (anInt843 + -2) & 0xff;
							}
						}
						else
						{
							anInt843 = (anInt843 - -2) & 0xff;
						}
						if (!aBool53 || (550 >= maybe_cameraHeight))
						{
							if (!aBool53 && (maybe_cameraHeight < 750))
							{
								maybe_cameraHeight += 4;
							}
						}
						else
						{
							maybe_cameraHeight -= 4;
						}
						if (actionPictureType <= 0)
						{
							if (actionPictureType < 0)
							{
								actionPictureType++;
							}
						}
						else
						{
							actionPictureType--;
						}
						gameCamera.method270(1041214728, 17);
						anInt918++;
						if (5 < anInt918)
						{
							anInt880 = (anInt880 + 1) % 3;
							anInt868 = (anInt868 + 1) % 4;
							anInt936 = (anInt936 - -1) % 5;
							anInt918 = 0;
						}
						for (int i_957_ = 0; objectCount > i_957_; i_957_++)
						{
							final int i_958_ = objectX[i_957_];
							final int i_959_ = objectY[i_957_];
							if ((0 <= i_958_) && (0 <= i_959_) && (96 > i_958_) && (96 > i_959_)
							        && (objectType[i_957_] == 74))
							{
								objectModelArray[i_957_].method141(0, 0, 1);
							}
						}
						for (int i_960_ = 0; anInt1012 > i_960_; i_960_++)
						{
							anIntArray208[i_960_]++;
							if (anIntArray208[i_960_] > 50)
							{
								anInt1012--;
								for (int i_961_ = i_960_; anInt1012 > i_961_; i_961_++)
								{
									anIntArray188[i_961_] = anIntArray188[i_961_ + 1];
									anIntArray204[i_961_] = anIntArray204[i_961_ + 1];
									anIntArray208[i_961_] = anIntArray208[i_961_ + 1];
									anIntArray214[i_961_] = anIntArray214[i_961_ + 1];
								}
							}
						}
					}
				}
			}
		}
	}

	private void method592(final int i, final int i_962_, final int i_963_, final int i_964_)
	{
		streamClass.createPacket(64);
		streamClass.aClass27_Sub1_Sub1_1.put(i);
		streamClass.aClass27_Sub1_Sub1_1.put(i_963_);
		streamClass.aClass27_Sub1_Sub1_1.put(i_964_);
		streamClass.aClass27_Sub1_Sub1_1.put(i_962_);
		streamClass.finishPacket();
	}

	private void drawLoginScreen()
	{
		gameGraphics.f1Toggle = false;
		aBool77 = false;
		gameGraphics.method331();
		if ((maybe_loginScreenNumber == 0) || (maybe_loginScreenNumber == 1) || (maybe_loginScreenNumber == 2) || (maybe_loginScreenNumber == 3))
		{
			final int i_965_ = (anInt930 * 2) % 3072;
			if (i_965_ >= 1024)
			{
				if (2048 > i_965_)
				{
					gameGraphics.drawPicture(anInt893 - -1, 10, 0);
					if (i_965_ > 1792)
					{
						gameGraphics.method320(0, anInt935 + 10, 10, i_965_ - 1792);
					}
				}
				else
				{
					gameGraphics.drawPicture(anInt935 - -10, 10, 0);
					if (2816 < i_965_)
					{
						gameGraphics.method320(0, anInt893, 10, i_965_ + -2816);
					}
				}
			}
			else
			{
				gameGraphics.drawPicture(anInt893, 10, 0);
				if (768 < i_965_)
				{
					gameGraphics.method320(0, anInt893 + 1, 10, i_965_ + -768);
				}
			}
		}
		if (maybe_loginScreenNumber == 0)
		{
			aClass10_7.drawMenu(-6);
		}
		if (maybe_loginScreenNumber == 2)
		{
			final String string = menuLogin.getText(anInt1005);
			if ((string != null) && (string.length() > 0))
			{
				gameGraphics.method327(0, 185, maybe_windowWidth, 100, 85, 0, 30);
			}
			menuLogin.drawMenu(-6);
		}
		gameGraphics.drawPicture(anInt935 + 22, windowHeight, 0);
		gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
	}

	private void method594(final int i, final boolean bool)
	{
		int i_966_ = gameGraphics.menuDefaultWidth + -199;
		gameGraphics.drawPicture(anInt935 - -4, 3, i_966_ + -49);
		int i_967_ = 36;
		final int i_968_ = 196;
		final int i_969_ = 182;
		int i_971_;
		int i_970_ = i_971_ = Class34.method227(false, 160, 160, 160);
		if (menuMagicPrayersSelected == 0)
		{
			i_970_ = Class34.method227(false, 220, 220, 220);
		}
		else
		{
			i_971_ = Class34.method227(false, 220, 220, 220);
		}
		gameGraphics.method327(i_966_, i_967_, i_968_ / i, 128, 82, i_970_, 24);
		gameGraphics.method327((i_968_ / 2) + i_966_, i_967_, i_968_ / 2, 128, 113, i_971_, 24);
		gameGraphics.method327(i_966_, i_967_ + 24, i_968_, 128, 125, Class34.method227(false, 220, 220, 220), 90);
		gameGraphics.method327(i_966_, (i_967_ - -24) + 90, i_968_, 128, 108,
		        Class34.method227(false, 160, 160, 160), (i_969_ - 90) + -24);
		gameGraphics.method341(i_968_, i_967_ + 24, i_966_, 0);
		gameGraphics.method319(0, 24, i_967_ - 0, (i_968_ / 2) + i_966_);
		gameGraphics.method341(i_968_, i_967_ + 113, i_966_, 0);
		gameGraphics.drawText(0, 255, 4, "Magic", i_967_ + 16, i_966_ - -(i_968_ / 4));
		gameGraphics.drawText(0, 255, 4, "Prayers", i_967_ - -16, (i_968_ / 2) + i_966_ + (i_968_ / 4));
		if (menuMagicPrayersSelected == 0)
		{
			spellMenu.resetListTextCount(0, spellMenuHandle);
			int i_972_ = 0;
			for (int i_973_ = 0; i_973_ < EntityHandler.spelldef_count; i_973_++)
			{
				String string = "@yel@";
				for (int i_974_ = 0; i_974_ < EntityHandler.spelldef_runeCount[i_973_]; i_974_++)
				{
					final int i_975_ = EntityHandler.spelldef_runesRequiredIds[i_973_][i_974_];
					if (!hasRequiredRunes(EntityHandler.spelldef_runesRequiredAmounts[i_973_][i_974_], i_975_))
					{
						string = "@whi@";
						break;
					}
				}
				final int i_976_ = anIntArray185[6];
				if (i_976_ < EntityHandler.spelldef_level[i_973_])
				{
					string = "@bla@";
				}
				spellMenu.method68(null, spellMenuHandle, null, 0, i_972_++, 0,
				        new StringBuilder().append(string).append("Level ").append(EntityHandler.spelldef_level[i_973_])
				                .append(": ").append(EntityHandler.spelldef_name[i_973_]).toString());
			}
			spellMenu.drawMenu(-6);
			final int i_977_ = spellMenu.method92(spellMenuHandle);
			if (i_977_ == -1)
			{
				gameGraphics.method324("Point at a spell for a description", 0, 1, 0, i_966_ - -2, i_967_ + 124);
			}
			else
			{
				gameGraphics.method324(
				        new StringBuilder().append("Level ").append(EntityHandler.spelldef_level[i_977_]).append(": ")
				                .append(EntityHandler.spelldef_name[i_977_]).toString(),
				        0, 1, 16776960, i_966_ + 2, i_967_ + 124);
				gameGraphics.method324(EntityHandler.spelldef_description[i_977_], 0, 0, 16777215, i_966_ + 2, i_967_ + 136);
				for (int i_978_ = 0; i_978_ < EntityHandler.spelldef_runeCount[i_977_]; i_978_++)
				{
					final int i_979_ = EntityHandler.spelldef_runesRequiredIds[i_977_][i_978_];
					gameGraphics.drawPicture(anInt863 - -(EntityHandler.itemdef_sprite[i_979_]), i_967_ + 150,
					        (i_966_ - -2) + (i_978_ * 44));
					final int i_980_ = inventoryCount(i_979_);
					final int i_981_ = EntityHandler.spelldef_runesRequiredAmounts[i_977_][i_978_];
					String string = "@red@";
					if (hasRequiredRunes(i_981_, i_979_))
					{
						string = "@gre@";
					}
					gameGraphics.method324(
					        new StringBuilder().append(string).append(i_980_).append("/").append(i_981_).toString(), 0,
					        1, 16777215, i_966_ - (-2 - (i_978_ * 44)), i_967_ + 150);
				}
			}
		}
		if (menuMagicPrayersSelected == 1)
		{
			spellMenu.resetListTextCount(0, spellMenuHandle);
			int i_982_ = 0;
			for (int i_983_ = 0; i_983_ < EntityHandler.prayerdef_count; i_983_++)
			{
				String string = "@whi@";
				if (anIntArray200[5] < EntityHandler.prayerdef_level[i_983_])
				{
					string = "@bla@";
				}
				if (aBoolArray11[i_983_])
				{
					string = "@gre@";
				}
				spellMenu.method68(null, spellMenuHandle, null, 0, i_982_++, i ^ 0x2,
				        new StringBuilder().append(string).append("Level ").append(EntityHandler.prayerdef_level[i_983_])
				                .append(": ").append(EntityHandler.prayerdef_name[i_983_]).toString());
			}
			spellMenu.drawMenu(i + -8);
			final int i_984_ = spellMenu.method92(spellMenuHandle);
			if (i_984_ != -1)
			{
				gameGraphics.drawText(16776960, 255, 1,
				        new StringBuilder().append("Level ").append(EntityHandler.prayerdef_level[i_984_]).append(": ")
				                .append(EntityHandler.prayerdef_name[i_984_]).toString(),
				        i_967_ + 130, (i_968_ / 2) + i_966_);
				gameGraphics.drawText(16777215, 255, 0, (EntityHandler.prayerdef_description[i_984_]),
				        i_967_ + 145, (i_968_ / 2) + i_966_);
				gameGraphics.drawText(0, 255, 1,
				        new StringBuilder().append("Drain rate: ").append(EntityHandler.prayerdef_drainRate[i_984_]).toString(),
				        i_967_ + 160, (i_968_ / 2) + i_966_);
			}
			else
			{
				gameGraphics.method324("Point at a prayer for a description", i + -2, 1, 0, i_966_ + 2,
				        i_967_ - -124);
			}
		}
		if (bool)
		{
			i_966_ = ((-gameGraphics.menuDefaultWidth - -199) + this.mouseX);
			i_967_ = this.mouseY + -36;
			if ((0 <= i_966_) && (0 <= i_967_) && (196 > i_966_) && (i_967_ < 182))
			{
				spellMenu.method85(this.mouseDownButton, i_967_ + 36, this.lastMouseDownButton,
				        (i_966_ - 199 - -(gameGraphics.menuDefaultWidth)));
				if ((i_967_ <= 24) && (anInt887 == 1))
				{
					if ((i_966_ < 98) && (menuMagicPrayersSelected == 1))
					{
						menuMagicPrayersSelected = 0;
						spellMenu.method101(spellMenuHandle);
					}
					else if ((98 < i_966_) && (menuMagicPrayersSelected == 0))
					{
						menuMagicPrayersSelected = 1;
						spellMenu.method101(spellMenuHandle);
					}
				}
				if ((anInt887 == 1) && (menuMagicPrayersSelected == 0))
				{
					final int i_985_ = spellMenu.method92(spellMenuHandle);
					if (i_985_ != -1)
					{
						final int i_986_ = anIntArray185[6];
						if (EntityHandler.spelldef_level[i_985_] <= i_986_)
						{
							int i_987_;
							for (i_987_ = 0; i_987_ < EntityHandler.spelldef_runeCount[i_985_]; i_987_++)
							{
								final int i_988_ = (EntityHandler.spelldef_runesRequiredIds[i_985_][i_987_]);
								if (!hasRequiredRunes((EntityHandler.spelldef_runesRequiredAmounts[i_985_][i_987_]), i_988_))
								{
									displayMessage(0, "You don't have all the reagents you need for this spell", 0, null, -9,
									        null, null, false);
									i_987_ = -1;
									break;
								}
							}
							if (EntityHandler.spelldef_runeCount[i_985_] == i_987_)
							{
								anInt940 = i_985_;
								anInt989 = -1;
							}
						}
						else
						{
							displayMessage(0, "Your magic ability is not high enough for this spell", 0, null, i ^ ~0x7e,
							        null, null, false);
						}
					}
				}
				if ((anInt887 == 1) && (menuMagicPrayersSelected == 1))
				{
					final int i_989_ = spellMenu.method92(spellMenuHandle);
					if (i_989_ != -1)
					{
						final int i_990_ = anIntArray200[5];
						if (EntityHandler.prayerdef_level[i_989_] <= i_990_)
						{
							if (anIntArray185[5] != 0)
							{
								if (!aBoolArray11[i_989_])
								{
									streamClass.createPacket(60);
									streamClass.aClass27_Sub1_Sub1_1.put(i_989_);
									streamClass.finishPacket();
									aBoolArray11[i_989_] = true;
									playSound("prayeron");
								}
								else
								{
									streamClass.createPacket(254);
									streamClass.aClass27_Sub1_Sub1_1.put(i_989_);
									streamClass.finishPacket();
									aBoolArray11[i_989_] = false;
									playSound("prayeroff");
								}
							}
							else
							{
								displayMessage(0, "You have run out of prayer points. Return to a church to recharge", 0,
								        null, i + -44, null, null, false);
							}
						}
						else
						{
							displayMessage(0, "Your prayer ability is not high enough for this prayer", 0, null, -63, null,
							        null, false);
						}
					}
				}
				anInt887 = 0;
			}
		}
	}
	
	@Override
	void method467(final int i)
	{
		if (maybe_isApplet)
		{
			final String string = getDocumentBase().getHost().toLowerCase();
			if (!string.equals("runescape.com") && !string.endsWith(".runescape.com"))
			{
				aBool50 = true;
				return;
			}
		}
		method599(i + -10805);
		if (!method469(false))
		{
			lastLoadedNull = true;
		}
		else
		{
			ByteBuffer.method391(i + 1993319904, Class34.aClass44_1);
			if (i != -6464)
			{
				anInt1037 = 76;
			}
			try
			{
				if (GameFrame.aClass32_4.aClass28_1 != null)
				{
					Class27_Sub1_Sub1.aClass39_5 = new Class39((GameFrame.aClass32_4.aClass28_1), 24, 0);
					GameFrame.aClass32_4.aClass28_1 = null;
				}
			}
			catch (final IOException ioexception)
			{
				Class27_Sub1_Sub1.aClass39_5 = null;
			}
			int i_991_ = 0;
			for (int i_992_ = 0; 99 > i_992_; i_992_++)
			{
				final int i_993_ = i_992_ - -1;
				final int i_994_ = (int) ((Math.pow(2.0, i_993_ / 7.0) * 300.0) + i_993_);
				i_991_ += i_994_;
				anIntArray161[i_992_] = Class52.bitwiseAnd(i_991_, 268435452);
			}
			try
			{
				final String string = getParameter("referid");
				param_referid = Integer.parseInt(string);
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			try
			{
				final String string = getParameter("servertype");
				final int type = Integer.parseInt(string);
				if ((0x2 & type) != 0)
				{
					isVeterans = true;
				}
				if ((0x1 & type) != 0)
				{
					isMembers = true;
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			if (Class34.aClass38_5 == Class22.aClass38_3)
			{
				serverHost = getCodeBase().getHost();
				anInt786 = 443;
				anInt799 = 43594;
			}
			else if (GameImage.method342(Class34.aClass38_5))
			{
				serverHost = getCodeBase().getHost();
				anInt786 = 50000 + Class27_Sub1_Sub1.portOffset;
				anInt799 = 40000 + Class27_Sub1_Sub1.portOffset;
			}
			else if (Class34.aClass38_5 == StreamClass.aClass38_7)
			{
				anInt799 = 40000 + Class27_Sub1_Sub1.portOffset;
				anInt786 = 50000 + Class27_Sub1_Sub1.portOffset;
				serverHost = "local.runescape.com";
			}
			GameWindowMiddleMan.maxPacketReadCount = 1000;
			loadConfig();
			if (!lastLoadedNull)
			{
				anInt935 = 2000;
				anInt873 = anInt935 + 100;
				anInt863 = anInt873 + 50;
				anInt893 = anInt863 - -1000;
				anInt903 = anInt893 - -10;
				anInt925 = anInt903 - -50;
				anInt931 = anInt925 - -10;
				anInt910 = anInt931 + 5;
				aGraphics2 = getGraphics();
				changeThreadSleepModifier(50);
				gameGraphics = new GameImageMiddleMan(maybe_windowWidth, windowHeight + 12, 4000, this);
				gameGraphics.aclient1 = this;
				gameGraphics.method357(0, windowHeight + 12, 0, maybe_windowWidth);
				aClass29_1 = new Class29(gameGraphics, 1, "Choose option");
				aClass29_2 = new Class29(gameGraphics, 1);
				aClass29_3 = new Class29(gameGraphics, 1);
				Class24.aBool16 = false;
				Class33.anInt368 = anInt873;
				spellMenu = new Menu(gameGraphics, 5);
				final int i_996_ = gameGraphics.menuDefaultWidth - 199;
				final int i_997_ = 36;
				spellMenuHandle = spellMenu.method80(i_997_ + 24, 500, i_996_, true, 90, 1, 196);
				aClass10_4 = new Menu(gameGraphics, 5);
				anInt951 = aClass10_4.method80(i_997_ + 40, 500, i_996_, true, 126, 1, 196);
				aClass10_6 = new Menu(gameGraphics, 5);
				anInt1064 = aClass10_6.method80(i_997_ + 24, 500, i_996_, true, 251, 1, 196);
				method571();
				if (!lastLoadedNull)
				{
					loadEntities();
					if (!lastLoadedNull)
					{
						gameCamera = new Camera(gameGraphics, 15000, 15000, 1000);
						gameCamera.setCameraSize(maybe_windowWidth / 2, 256, windowHeight / 2, windowHeight / 2, anInt860, maybe_windowWidth / 2,
						        maybe_windowWidth);
						gameCamera.anInt465 = 1;
						gameCamera.anInt437 = 2400;
						gameCamera.anInt426 = 2300;
						gameCamera.anInt464 = 2400;
						gameCamera.method274(-10, -50, -50);
						engineHandle = new EngineHandle(gameCamera, gameGraphics);
						engineHandle.anInt16 = anInt935;
						loadTextures();
						if (!lastLoadedNull)
						{
							method583();
							if (!lastLoadedNull)
							{
								method568();
								if (!lastLoadedNull)
								{
									if (isMembers)
									{
										loadSounds();
									}
									if (!lastLoadedNull)
									{
										drawLoadingBarText(100, "Starting game...");
										drawGameMenu();
										makeLoginMenus(true);
										makeCharacterDesignMenu();
										resetLoginVars();
										method531(3631);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void method595(final byte i)
	{
		if (i != -2)
		{
			loadEntities();
		}
		final int i_998_ = 7;
		final int i_999_ = 15;
		final int i_1000_ = 175;
		if (anInt887 != 0)
		{
			for (int i_1001_ = 0; 5 > i_1001_; i_1001_++)
			{
				if ((i_1001_ > 0) && (i_998_ < this.mouseX) && (this.mouseX < (i_1000_ + i_998_))
				        && (this.mouseY > (i_999_ + (i_1001_ * 20)))
				        && ((i_999_ + (i_1001_ * 20) + 20) > this.mouseY))
				{
					anInt887 = 0;
					anInt1054 = i_1001_ - 1;
					streamClass.createPacket(29);
					streamClass.aClass27_Sub1_Sub1_1.put(anInt1054);
					streamClass.finishPacket();
					break;
				}
			}
		}
		for (int i_1002_ = 0; 5 > i_1002_; i_1002_++)
		{
			if ((anInt1054 - -1) != i_1002_)
			{
				gameGraphics.method327(i_998_, i_999_ + (i_1002_ * 20), i_1000_, 128, 87,
				        Class34.method227(false, 190, 190, 190), 20);
			}
			else
			{
				gameGraphics.method327(i_998_, i_999_ + (i_1002_ * 20), i_1000_, 128, 101,
				        Class34.method227(false, 0, 255, 0), 20);
			}
			gameGraphics.method341(i_1000_, i_999_ - -(i_1002_ * 20), i_998_, 0);
			gameGraphics.method341(i_1000_, i_999_ - (-(i_1002_ * 20) - 20), i_998_, 0);
		}
		gameGraphics.drawText(16777215, 255, 3, "Select combat style", i_999_ + 16, i_998_ - -(i_1000_ / 2));
		gameGraphics.drawText(0, i + 257, 3, "Controlled (+1 of each)", i_999_ + 36, (i_1000_ / 2) + i_998_);
		gameGraphics.drawText(0, 255, 3, "Aggressive (+3 strength)", i_999_ + 56, i_998_ - -(i_1000_ / 2));
		gameGraphics.drawText(0, i + 257, 3, "Accurate   (+3 attack)", i_999_ + 76, (i_1000_ / 2) + i_998_);
		gameGraphics.drawText(0, 255, 3, "Defensive  (+3 defense)", i_999_ + 96, (i_1000_ / 2) + i_998_);
	}

	private void method596()
	{
		if ((anInt939 == 0) && ((gameGraphics.menuDefaultWidth + -35) <= this.mouseX) && (3 <= this.mouseY)
		        && ((gameGraphics.menuDefaultWidth - 3) > this.mouseX) && (35 > this.mouseY))
		{
			anInt939 = 1;
		}
		if ((anInt939 == 0) && (this.mouseX >= (gameGraphics.menuDefaultWidth + -35 + -33)) && (this.mouseY >= 3)
		        && (this.mouseX < (gameGraphics.menuDefaultWidth + -3 + -33)) && (35 > this.mouseY))
		{
			anInt1041 = -11 + (int) (23.0 * Math.random());
			anInt939 = 2;
			anInt964 = -6 + (int) (13.0 * Math.random());
		}
		if ((anInt939 == 0) && ((gameGraphics.menuDefaultWidth + -101) <= this.mouseX) && (3 <= this.mouseY)
		        && (((gameGraphics.menuDefaultWidth - 3) + -66) > this.mouseX) && (35 > this.mouseY))
		{
			anInt939 = 3;
		}
		if ((anInt939 == 0) && ((gameGraphics.menuDefaultWidth - 35 - 99) <= this.mouseX) && (this.mouseY >= 3)
		        && ((gameGraphics.menuDefaultWidth + -102) > this.mouseX) && (35 > this.mouseY))
		{
			anInt939 = 4;
		}
		if ((anInt939 == 0) && (this.mouseX >= (gameGraphics.menuDefaultWidth + -132 + -35)) && (this.mouseY >= 3)
		        && ((gameGraphics.menuDefaultWidth + -135) > this.mouseX) && (this.mouseY < 35))
		{
			anInt939 = 5;
		}
		if ((anInt939 == 0) && (this.mouseX >= (gameGraphics.menuDefaultWidth + -200)) && (3 <= this.mouseY)
		        && (this.mouseX < (gameGraphics.menuDefaultWidth - 168)) && (this.mouseY < 35))
		{
			anInt939 = 6;
		}
		if ((anInt939 != 0) && (this.mouseX >= (gameGraphics.menuDefaultWidth - 35)) && (this.mouseY >= 3)
		        && ((gameGraphics.menuDefaultWidth + -3) > this.mouseX) && (this.mouseY < 26))
		{
			anInt939 = 1;
		}
		if ((anInt939 != 0) && (anInt939 != 2) && (this.mouseX >= ((gameGraphics.menuDefaultWidth + -35) - 33))
		        && (this.mouseY >= 3) && (this.mouseX < ((gameGraphics.menuDefaultWidth + -3) - 33))
		        && (26 > this.mouseY))
		{
			anInt939 = 2;
			anInt964 = -6 + (int) (13.0 * Math.random());
			anInt1041 = (int) (Math.random() * 23.0) - 11;
		}
		if ((anInt939 != 0) && (this.mouseX >= (gameGraphics.menuDefaultWidth + -66 + -35)) && (3 <= this.mouseY)
		        && (this.mouseX < (gameGraphics.menuDefaultWidth + -69)) && (this.mouseY < 26))
		{
			anInt939 = 3;
		}
		if ((anInt939 != 0) && (((gameGraphics.menuDefaultWidth - 99) + -35) <= this.mouseX) && (3 <= this.mouseY)
		        && (this.mouseX < (gameGraphics.menuDefaultWidth + -3 + -99)) && (26 > this.mouseY))
		{
			anInt939 = 4;
		}
		if ((anInt939 != 0) && (this.mouseX >= ((gameGraphics.menuDefaultWidth + -132) - 35)) && (3 <= this.mouseY)
		        && (((gameGraphics.menuDefaultWidth - 3) + -132) > this.mouseX) && (this.mouseY < 26))
		{
			anInt939 = 5;
		}
		if ((anInt939 != 0) && ((gameGraphics.menuDefaultWidth + -165 + -35) <= this.mouseX) && (3 <= this.mouseY)
		        && (((gameGraphics.menuDefaultWidth - 165) + -3) > this.mouseX) && (this.mouseY < 26))
		{
			anInt939 = 6;
		}
		if ((anInt939 == 1) && (((gameGraphics.menuDefaultWidth + -248) > this.mouseX)
		        || ((((anInt973 / 5) * 34) + 36) < this.mouseY)))
		{
			anInt939 = 0;
		}
		if ((anInt939 == 3) && (((gameGraphics.menuDefaultWidth + -199) > this.mouseX) || (316 < this.mouseY)))
		{
			anInt939 = 0;
		}
		if (((anInt939 == 2) || (anInt939 == 4) || (anInt939 == 5))
		        && (((gameGraphics.menuDefaultWidth + -199) > this.mouseX) || (240 < this.mouseY)))
		{
			anInt939 = 0;
		}
		if ((anInt939 == 6) && (((gameGraphics.menuDefaultWidth + -199) > this.mouseX) || (311 < this.mouseY)))
		{
			anInt939 = 0;
		}
	}

	private Mob getPlayerByServerIndex(final int serverIndex)
	{
		for (int index = 0; index < playerCount; index++)
		{
			if (playerArray[index].serverIndex == serverIndex)
			{
				return playerArray[index];
			}
		}
		return null;
	}

	private void method598(final byte maybe_dummy)
	{
		gameGraphics.f1Toggle = false;
		gameGraphics.method331();
		characterDesignMenu.drawMenu(-6);
		int i_1005_ = 140;
		i_1005_ += 116;
		if (maybe_dummy != 25)
		{
			anIntArray177 = null;
		}
		int i_1006_ = 50;
		i_1006_ -= 25;
		gameGraphics.spriteClipUnknown(i_1006_, i_1005_ + -87, 102, 64, EntityHandler.animationdef_number[anInt948],
		        characterTopBottomColors[anInt965]);
		gameGraphics.method348(false, characterSkinColors[anInt961], -128, 102, i_1006_, 64, 0,
		        EntityHandler.animationdef_number[anInt962], characterTopBottomColors[anInt1057], i_1005_ + -32 + -55);
		gameGraphics.method348(false, characterSkinColors[anInt961], -68, 102, i_1006_, 64, 0,
		        EntityHandler.animationdef_number[anInt1047], characterHairColors[anInt999], (i_1005_ - 32) + -55);
		gameGraphics.spriteClipUnknown(i_1006_, i_1005_ - 32, 102, 64, EntityHandler.animationdef_number[anInt948] + 6,
		        characterTopBottomColors[anInt965]);
		gameGraphics.method348(false, characterSkinColors[anInt961], -119, 102, i_1006_, 64, 0,
		        EntityHandler.animationdef_number[anInt962] + 6, characterTopBottomColors[anInt1057], i_1005_ + -32);
		gameGraphics.method348(false, characterSkinColors[anInt961], -72, 102, i_1006_, 64, 0,
		        EntityHandler.animationdef_number[anInt1047] + 6, characterHairColors[anInt999], i_1005_ + -32);
		gameGraphics.spriteClipUnknown(i_1006_, i_1005_ + 23, 102, 64, EntityHandler.animationdef_number[anInt948] + 12,
		        characterTopBottomColors[anInt965]);
		gameGraphics.method348(false, characterSkinColors[anInt961], maybe_dummy ^ ~0x53, 102, i_1006_, 64, 0,
		        EntityHandler.animationdef_number[anInt962] + 12, characterTopBottomColors[anInt1057], (i_1005_ - -55) + -32);
		gameGraphics.method348(false, characterSkinColors[anInt961], -89, 102, i_1006_, 64, 0,
		        EntityHandler.animationdef_number[anInt1047] - -12, characterHairColors[anInt999], i_1005_ + 23);
		gameGraphics.drawPicture(anInt935 + 22, windowHeight, 0);
		gameGraphics.drawImage(aGraphics2, this.anInt720, this.anInt694);
	}

	private void method599(final int i)
	{
		Container container;
		if (!maybe_isApplet)
		{
			container = Class38.gameFrame;
		}
		else if (Class27.anApplet1 == null)
		{
			container = this;
		}
		else
		{
			container = Class27.anApplet1;
		}
		if (i == -17269)
		{
			anInt941 = container.getSize().width;
			anInt1023 = container.getSize().height;
			this.anInt694 = 0;
			this.anInt720 = (anInt941 + -maybe_windowWidth) / 2;
			method490();
		}
	}

	static int computeItemCost(final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_,
	        final int i_3_, final int i_4_)
	{
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
		{
			int i_8_ = (i_4_ + (bool ? i_7_ : -i_7_) + -i_2_) * i_3_;
			if (i_8_ < -100)
			{
				i_8_ = -100;
			}
			else if (100 < i_8_)
			{
				i_8_ = 100;
			}
			int i_9_ = i + i_8_;
			if (10 > i_9_)
			{
				i_9_ = 10;
			}
			i_6_ += (i_9_ * i_0_) / 100;
		}
		return i_6_;
	}

	static String addCharacters(final int i, final String s)
	{
		String string_1_ = "";
	
		for (int j = 0; i > j; j++)
		{
			if (j < s.length())
			{
				final char c = s.charAt(j);
				if ((c < 'a') || (c > 'z'))
				{
					if ((c >= 'A') && ('Z' >= c))
					{
						string_1_ = new StringBuilder().append(string_1_).append(c).toString();
					}
					else if ((c >= '0') && ('9' >= c))
					{
						string_1_ = new StringBuilder().append(string_1_).append(c).toString();
					}
					else
					{
						string_1_ = new StringBuilder().append(string_1_).append('_').toString();
					}
				}
				else
				{
					string_1_ = new StringBuilder().append(string_1_).append(c).toString();
				}
			}
			else
			{
				string_1_ = new StringBuilder().append(string_1_).append(" ").toString();
			}
		}
		return string_1_;
	}

	public mudclient()
	{
		lastPlayerArray = new Mob[500];
		anInt887 = 0;
		tileSize = 128;
		anInt885 = 0;
		lastLoadedNull = false;
		anInt855 = 40;
		anInt864 = 2;
		anInt880 = 0;
		anInt868 = 0;
		windowHeight = 334;
		anInt882 = 0;
		anInt849 = -1;
		wildYSubtract = -1;
		mouseClickX = new int[8192];
		lastPlayerCount = 0;
		maybe_isApplet = true;
		memoryError = false;
		wildX = 0;
		anInt854 = 0;
		anInt843 = 128;
		mobArray = new Mob[4000];
		mouseClickY = new int[8192];
		anInt860 = 9;
		playerArray = new Mob[500];
		wildYMultiplier = 0;
		isMembers = false;
		wildY = 0;
		mouseClickCount = 0;
		aBool50 = false;
		anInt916 = 0;
		anIntArray155 = new int[8000];
		anInt923 = 0;
		anInt912 = -1;
		anInt888 = 0;
		anInt906 = 0;
		anInt886 = 2;
		actionPictureType = 0;
		playerCount = 0;
		anInt907 = 0;
		loggedIn = 0;
		maybe_cameraHeight = 550;
		anInt918 = 0;
		isVeterans = false;
		anInt933 = 1;
		anIntArray157 = new int[8000];
		anInt930 = 0;
		anInt937 = 0;
		lastWildYSubtract = -1;
		anInt914 = -1;
		anInt936 = 0;
		ourPlayer = new Mob();
		anInt939 = 0;
		anIntArray158 = new int[50];
		characterTopBottomColors = new int[] { 16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528,
		        14680288, 3158064, 6307840, 8409088, 16777215 };
		inventoryItemsCount = new int[35];
		anIntArray159 = new int[14];
		npcCombatModelArray2 = new int[] { 0, 0, 0, 0, 0, 1, 2, 1 };
		systemUpdate = 0;
		npcCombatModelArray1 = new int[] { 0, 1, 2, 1, 0, 0, 0, 0 };
		aStringArray47 = new String[50];
		shopUnknown3 = 0;
		anInt971 = 0;
		wallObjectX = new int[500];
		lastNpcArray = new Mob[500];
		groundItemObjectVar = new int[5000];
		aBool66 = false;
		objectModelArray = new Model[1500];
		wallObjectCount = 0;
		anIntArray169 = new int[50];
		selectedShopItemIndex = -1;
		messagesTab = 0;
		aBool60 = false;
		anInt960 = 0;
		wallObjectDirection = new int[500];
		anInt982 = 0;
		anInt964 = 0;
		anInt955 = 0;
		aBool67 = false;
		showCharacterLookScreen = false;
		aBool59 = false;
		anInt986 = 0;
		configSoundEffects = false;
		aStringArray45 = new String[5];
		anIntArray187 = new int[50];
		aBool71 = false;
		anIntArray160 = new int[14];
		npcArray = new Mob[500];
		anIntArray180 = new int[14];
		anIntArray183 = new int[8];
		anInt952 = 0;
		questListArray = (new String[] { "Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest",
		        "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure",
		        "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword",
		        "Vampire slayer", "Witch's potion", "Dragon slayer", "Witch's house (members)", "Lost city (members)",
		        "Hero's quest (members)", "Druidic ritual (members)", "Merlin's crystal (members)",
		        "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)",
		        "Fishing contest (members)", "Monk's friend (members)", "Temple of Ikov (members)",
		        "Clock tower (members)", "The Holy Grail (members)", "Fight Arena (members)",
		        "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)",
		        "Plague City (members)", "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)",
		        "Jungle potion (members)", "Grand tree (members)", "Shilo village (members)",
		        "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)",
		        "Watchtower (members)", "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)",
		        "Gertrude's Cat (members)", "Legend's Quest (members)" });
		anInt997 = -1;
		anInt948 = 2;
		skillArrayLong = new String[] { "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking",
		        "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw",
		        "Agility", "Thieving" };
		objectType = new int[1500];
		anInt978 = 0;
		aBool70 = false;
		anIntArray174 = new int[256];
		aBool79 = false;
		aBoolArray14 = new boolean[500];
		wallObjectType = new int[500];
		anInt967 = 0;
		aBoolArray12 = new boolean[50];
		playerAliveTimeout = 0;
		wallObjectY = new int[500];
		anInt984 = 0;
		aBool75 = false;
		anIntArray182 = new int[8];
		aBoolArray13 = new boolean[1500];
		aString33 = "";
		objectX = new int[1500];
		welcomeRecoverySetDays = 0;
		anInt1016 = -1;
		aBool68 = false;
		aString32 = "";
		wallObjectModelArray = new Model[500];
		anInt961 = 0;
		showShop = false;
		anInt985 = 0;
		aString30 = "";
		anInt1012 = 0;
		objectY = new int[1500];
		aBool77 = false;
		groundItemX = new int[5000];
		groundItemY = new int[5000];
		anIntArray193 = new int[8];
		npcRecordArray = new Mob[5000];
		anIntArray173 = new int[50];
		anIntArray188 = new int[50];
		equipmentStatusName = new String[] { "Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer" };
		aStringArray49 = null;
		characterSkinColors = new int[] { 15523536, 13415270, 11766848, 10056486, 9461792 };
		anIntArray203 = new int[50];
		aBool69 = false;
		anInt973 = 30;
		anInt989 = -1;
		anInt975 = 0;
		shopUnknown1 = 0;
		anIntArray204 = new int[50];
		aBool82 = false;
		aBool62 = true;
		anInt1027 = 0;
		anInt999 = 2;
		anIntArray200 = new int[18];
		menuMagicPrayersSelected = 0;
		anInt1028 = 1;
		anInt950 = 0;
		lastNpcCount = 0;
		anInt1009 = 0;
		anInt965 = 14;
		anInt946 = 0;
		anInt953 = 0;
		unreadMessages = 0;
		param_referid = 0;
		shopItems = new int[256];
		anIntArray189 = new int[18];
		groundItemType = new int[5000];
		aBool65 = false;
		logoutTimeout = 0;
		npcAnimationArray = new int[][] { { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4 },
		        { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4 }, { 11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4 },
		        { 3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 },
		        { 4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3 },
		        { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3 } };
		aBool74 = false;
		aBool73 = true;
		anIntArray161 = new int[99];
		configAutoCameraAngle = true;
		anIntArray198 = new int[8];
		anInt983 = -1;
		anIntArray181 = new int[14];
		aString35 = null;
		anIntArray164 = new int[14];
		objectRotation = new int[1500];
		anInt1041 = 0;
		objectCount = 0;
		welcomeLastLoggedInIp = 0;
		aBool81 = false;
		anIntArray208 = new int[50];
		serverIndex = -1;
		anIntArray213 = new int[50];
		aBool87 = false;
		anInt1031 = -2;
		anInt998 = 0;
		anIntArray202 = new int[50];
		anInt1045 = 0;
		anInt977 = 0;
		characterHairColors = new int[] { 16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280,
		        65535 };
		anInt1017 = 48;
		aBool72 = false;
		anInt1006 = -2;
		anInt943 = 0;
		anIntArray206 = new int[8];
		maybe_loginScreenNumber = 0;
		walkModel = new int[] { 0, 1, 2, 1 };
		anIntArray195 = new int[50];
		aBool63 = false;
		anInt1042 = 0;
		anInt938 = 0;
		configMouseButtons = false;
		anInt1038 = 0;
		anIntArray209 = new int[14];
		aBool85 = false;
		anIntArray215 = new int[8];
		anIntArray185 = new int[18];
		modelCache = new Model[1000];
		inventoryItems = new int[35];
		anIntArray172 = new int[14];
		anIntArray210 = new int[256];
		showServerMessageBox = false;
		aBool89 = false;
		soundData = null;
		anInt981 = 0;
		anInt1054 = 0;
		anInt1036 = 0;
		anInt1047 = 0;
		aBool90 = false;
		anInt1053 = 0;
		anInt1057 = 8;
		notInWilderness = false;
		showWelcomeBox = false;
		anIntArray186 = new int[5];
		aString38 = "";
		anInt1026 = 0;
		anInt992 = 0;
		anInt1056 = 0;
		anInt1049 = 0;
		anInt940 = -1;
		combatTimeout = 0;
		wearing = new int[35];
		aString40 = "";
		aBool76 = false;
		anInt1048 = 0;
		anIntArray218 = new int[50];
		anIntArray177 = new int[256];
		welcomeLastLoggedInDays = 0;
		anIntArray214 = new int[50];
		aBool84 = false;
		anIntArray207 = new int[256];
		aBool61 = false;
		anInt1055 = 0;
		anInt1050 = 0;
		aBool80 = false;
		anInt1060 = 0;
		aString36 = null;
		anIntArray217 = new int[50];
		anIntArray220 = new int[14];
		shopItemCount = new int[256];
		anIntArray184 = new int[256];
		wildernessType = 0;
		aBoolArray11 = new boolean[50];
		aBool92 = false;
		shopUnknown2 = 0;
		inputBoxType = 0;
		anInt1061 = 0;
		skillArray = new String[] { "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking",
		        "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility",
		        "Thieving" };
		anInt994 = 0;
		showSkipTutorial = false;
		anInt962 = 1;
		anIntArray212 = new int[8];
		groundItemCount = 0;
		anIntArray221 = new int[8];
		npcCount = 0;
		anIntArray216 = new int[50];
	}
}
