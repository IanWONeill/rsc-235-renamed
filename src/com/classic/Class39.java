package com.classic;

import java.io.EOFException;
import java.io.IOException;

final class Class39
{
	private final byte[] aByteArray15;
	private long aLong8;
	private int anInt407;
	private long aLong9 = -1L;
	private final byte[] aByteArray16;
	private long aLong10;
	private long aLong11;
	private long aLong12;
	private int anInt412 = 0;
	private final Class28 aClass28_4;
	private long aLong13;

	void method247(final long l) throws IOException
	{
		if (0L > l)
		{
			throw new IOException();
		}
		aLong8 = l;
	}

	void method248(final byte[] is, int i, int i_1_) throws IOException
	{
		do
		{
			try
			{
				if (aLong12 < (i + aLong8))
				{
					aLong12 = aLong8 - -(long) i;
				}
				if ((aLong11 != -1L) && ((aLong11 > aLong8) || ((anInt412 + aLong11) < aLong8)))
				{
					method254();
				}
				if ((aLong11 != -1L) && ((aByteArray16.length + aLong11) < (aLong8 - -(long) i)))
				{
					final int i_3_ = (int) (aByteArray16.length - aLong8 - -aLong11);
					Class14.method112(is, i_1_, aByteArray16, (int) (-aLong11 + aLong8), i_3_);
					i -= i_3_;
					aLong8 += i_3_;
					i_1_ = i_3_ + i_1_;
					anInt412 = aByteArray16.length;
					method254();
				}
				if (aByteArray16.length < i)
				{
					if (aLong10 != aLong8)
					{
						aClass28_4.method181(aLong8);
						aLong10 = aLong8;
					}
					aClass28_4.method183(i, i_1_, is);
					aLong10 += i;
					if (aLong13 < aLong10)
					{
						aLong13 = aLong10;
					}
					long l = -1L;
					if ((aLong8 >= aLong9) && (aLong8 < (anInt407 + aLong9)))
					{
						l = aLong8;
					}
					else if ((aLong8 <= aLong9) && ((aLong8 + i) > aLong9))
					{
						l = aLong9;
					}
					long l_4_ = -1L;
					if ((aLong9 < (i + aLong8)) && ((i + aLong8) <= (anInt407 + aLong9)))
					{
						l_4_ = aLong8 + i;
					}
					else if ((aLong8 < (anInt407 + aLong9)) && ((aLong9 + anInt407) <= (aLong8 - -(long) i)))
					{
						l_4_ = aLong9 - -(long) anInt407;
					}
					if ((-1L < l) && (l_4_ > l))
					{
						final int i_5_ = (int) (-l + l_4_);
						Class14.method112(is, (int) (l + i_1_ + -aLong8), aByteArray15, (int) (l + -aLong9), i_5_);
					}
					aLong8 += i;
				}
				else
				{
					if (i <= 0)
					{
						break;
					}
					if (aLong11 == -1L)
					{
						aLong11 = aLong8;
					}
					Class14.method112(is, i_1_, aByteArray16, (int) (-aLong11 + aLong8), i);
					aLong8 += i;
					if (anInt412 < (-aLong11 + aLong8))
					{
						anInt412 = (int) (aLong8 - aLong11);
					}
				}
			}
			catch (final IOException ioexception)
			{
				aLong10 = -1L;
				throw ioexception;
			}
			break;
		}
		while (false);
	}

	long method249()
	{
		return aLong12;
	}

	private void method250(final byte[] is) throws IOException
	{
		method253(0, is.length, is);
	}

	static void method251(final ByteBuffer class27_sub1)
	{
		final byte[] is = new byte[24];
		if (Class27_Sub1_Sub1.aClass39_5 != null)
		{
			try
			{
				Class27_Sub1_Sub1.aClass39_5.method247(0L);
				Class27_Sub1_Sub1.aClass39_5.method250(is);
				int i_7_;
				for (i_7_ = 0; (i_7_ < 24) && (is[i_7_] == 0); i_7_++)
				{
					/* empty */
				}
				if (i_7_ >= 24)
				{
					throw new IOException();
				}
			}
			catch (final Exception exception)
			{
				for (int i_8_ = 0; i_8_ < 24; i_8_++)
				{
					is[i_8_] = (byte) -1;
				}
			}
		}
		class27_sub1.writeBytes(24, is, 0);
	}

	private void method252() throws IOException
	{
		anInt407 = 0;
		if (aLong8 != aLong10)
		{
			aClass28_4.method181(aLong8);
			aLong10 = aLong8;
		}
		aLong9 = aLong8;
		int i;
		for (/**/; anInt407 < aByteArray15.length; anInt407 += i)
		{
			int i_9_ = aByteArray15.length + -anInt407;
			if (200000000 < i_9_)
			{
				i_9_ = 200000000;
			}
			i = aClass28_4.method182(aByteArray15, anInt407, i_9_);
			if (i == -1)
			{
				break;
			}
			aLong10 += i;
		}
	}

	void method253(int i_10_, int i_11_, final byte[] is) throws IOException
	{
		try
		{
			if (is.length < (i_10_ - -i_11_))
			{
				throw new ArrayIndexOutOfBoundsException(i_11_ + i_10_ + -is.length);
			}
			if ((-1L != aLong11) && (aLong8 >= aLong11) && ((anInt412 + aLong11) >= (i_11_ + aLong8)))
			{
				Class14.method112(aByteArray16, (int) (-aLong11 + aLong8), is, i_10_, i_11_);
				aLong8 += i_11_;
				return;
			}
			final long l = aLong8;
			final int i_13_ = i_10_;
			final int i_14_ = i_11_;
			if ((aLong9 <= aLong8) && (aLong8 < (anInt407 + aLong9)))
			{
				int i_15_ = (int) ((aLong9 - aLong8) + anInt407);
				if (i_15_ > i_11_)
				{
					i_15_ = i_11_;
				}
				Class14.method112(aByteArray15, (int) (aLong8 - aLong9), is, i_10_, i_15_);
				i_11_ -= i_15_;
				aLong8 += i_15_;
				i_10_ = i_15_ + i_10_;
			}
			if (i_11_ > aByteArray15.length)
			{
				aClass28_4.method181(aLong8);
				aLong10 = aLong8;
				int i_16_;
				for (/**/; 0 < i_11_; i_11_ -= i_16_)
				{
					i_16_ = aClass28_4.method182(is, i_10_, i_11_);
					if (i_16_ == -1)
					{
						break;
					}
					aLong10 += i_16_;
					i_10_ = i_16_ + i_10_;
					aLong8 += i_16_;
				}
			}
			else if (i_11_ > 0)
			{
				method252();
				int i_17_ = i_11_;
				if (i_17_ > anInt407)
				{
					i_17_ = anInt407;
				}
				Class14.method112(aByteArray15, 0, is, i_10_, i_17_);
				aLong8 += i_17_;
				i_11_ -= i_17_;
				i_10_ = i_17_ + i_10_;
			}
			if (-1L != aLong11)
			{
				if ((aLong8 < aLong11) && (i_11_ > 0))
				{
					int i_18_ = (int) (-aLong8 + aLong11) + i_10_;
					if (i_18_ > (i_10_ - -i_11_))
					{
						i_18_ = i_10_ - -i_11_;
					}
					while (i_10_ < i_18_)
					{
						i_11_--;
						is[i_10_++] = (byte) 0;
						aLong8++;
					}
				}
				long l_19_ = -1L;
				long l_20_ = -1L;
				if ((aLong11 >= l) && ((l + i_14_) > aLong11))
				{
					l_19_ = aLong11;
				}
				else if ((l >= aLong11) && (l < (aLong11 + anInt412)))
				{
					l_19_ = l;
				}
				if (((anInt412 + aLong11) <= l) || ((anInt412 + aLong11) > (l + i_14_)))
				{
					if ((aLong11 < (l - -(long) i_14_)) && ((anInt412 + aLong11) >= (l + i_14_)))
					{
						l_20_ = i_14_ + l;
					}
				}
				else
				{
					l_20_ = aLong11 - -(long) anInt412;
				}
				if ((-1L < l_19_) && (l_19_ < l_20_))
				{
					final int i_21_ = (int) (l_20_ + -l_19_);
					Class14.method112(aByteArray16, (int) (l_19_ - aLong11), is, i_13_ + (int) (l_19_ + -l), i_21_);
					if (l_20_ > aLong8)
					{
						i_11_ -= -aLong8 + l_20_;
						aLong8 = l_20_;
					}
				}
			}
		}
		catch (final IOException ioexception)
		{
			aLong10 = -1L;
			throw ioexception;
		}
		if (0 < i_11_)
		{
			throw new EOFException();
		}
	}

	private void method254() throws IOException
	{
		if (-1L != aLong11)
		{
			if (aLong10 != aLong11)
			{
				aClass28_4.method181(aLong11);
				aLong10 = aLong11;
			}
			aClass28_4.method183(anInt412, 0, aByteArray16);
			aLong10 += anInt412;
			if (aLong13 < aLong10)
			{
				aLong13 = aLong10;
			}
			long l = -1L;
			long l_22_ = -1L;
			if ((aLong9 <= aLong11) && (aLong11 < (anInt407 + aLong9)))
			{
				l = aLong11;
			}
			else if ((aLong11 <= aLong9) && ((aLong11 - -(long) anInt412) > aLong9))
			{
				l = aLong9;
			}
			if (((aLong11 + anInt412) > aLong9) && ((anInt412 + aLong11) <= (anInt407 + aLong9)))
			{
				l_22_ = aLong11 - -(long) anInt412;
			}
			else if (((anInt407 + aLong9) > aLong11) && ((anInt407 + aLong9) <= (anInt412 + aLong11)))
			{
				l_22_ = aLong9 + anInt407;
			}
			if ((-1L < l) && (l_22_ > l))
			{
				final int i_23_ = (int) (-l + l_22_);
				Class14.method112(aByteArray16, (int) (-aLong11 + l), aByteArray15, (int) (l + -aLong9), i_23_);
			}
			anInt412 = 0;
			aLong11 = -1L;
		}
	}

	static int method255(final ByteBuffer class27_sub1, final boolean bool, final String string)
	{
		final int i = class27_sub1.position;
		if (bool)
		{
			return 46;
		}
		final byte[] is = GameImageMiddleMan.maybe_stringToByteArray(string);
		class27_sub1.putVarSizeLength(is.length);
		class27_sub1.position += Camera.aClass44_2.method303(class27_sub1.buffer, is.length, is, class27_sub1.position, 0);
		return -i + class27_sub1.position;
	}

	Class39(final Class28 class28, final int i, final int i_24_) throws IOException
	{
		aLong11 = -1L;
		aClass28_4 = class28;
		aLong12 = aLong13 = class28.method184();
		aLong8 = 0L;
		aByteArray15 = new byte[i];
		aByteArray16 = new byte[i_24_];
	}
}
