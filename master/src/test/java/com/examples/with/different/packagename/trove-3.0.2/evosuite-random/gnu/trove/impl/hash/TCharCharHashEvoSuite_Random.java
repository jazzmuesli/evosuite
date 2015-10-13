/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TCharCharMap;
import gnu.trove.map.hash.TCharCharHashMap;
import gnu.trove.set.TCharSet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.testcase.TestCaseExecutor;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TCharCharHashEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
  } 

  @Before 
  public void initTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[10];
      char char0 = '';
      charArray0[0] = char0;
      char char1 = '_';
      charArray0[1] = char1;
      char char2 = 'S';
      charArray0[2] = char2;
      char char3 = '7';
      charArray0[3] = char3;
      char char4 = 'I';
      charArray0[4] = char4;
      char char5 = '9';
      charArray0[5] = char5;
      char char6 = 'f';
      charArray0[6] = char6;
      char char7 = 'b';
      charArray0[7] = char7;
      char char8 = 'x';
      charArray0[8] = char8;
      float float0 = (-43.43309F);
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap((int) charArray0[5], float0);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap0);
      float float1 = 1.0F;
      tCharCharHashMap1.setAutoCompactionFactor(float1);
      char char9 = '!';
      int int0 = (-1717);
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap(int0, (float) charArray0[0], char9, charArray0[6]);
      assertEquals('f', tCharCharHashMap2.getNoEntryValue());
      assertEquals('!', tCharCharHashMap2.getNoEntryKey());
      
      charArray0[9] = char9;
      char[] charArray1 = new char[3];
      charArray1[0] = char2;
      charArray1[1] = char6;
      charArray1[2] = char3;
      TCharCharHashMap tCharCharHashMap3 = new TCharCharHashMap(charArray0, charArray1);
      TCharCharHashMap tCharCharHashMap4 = new TCharCharHashMap(charArray0, charArray0);
      assertEquals("{!=!, S=S, =, 9=9, f=f, 7=7, b=b, x=x, I=I, _=_}", tCharCharHashMap4.toString());
      assertEquals('\u0000', tCharCharHashMap4.getNoEntryValue());
  }

  @Test
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[9];
      char char0 = '#';
      charArray0[0] = char0;
      char char1 = 'h';
      charArray0[1] = char1;
      char char2 = 't';
      float float0 = 745.717F;
      char char3 = 'e';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap((int) char0, float0, char0, char3);
      char char4 = 'P';
      tCharCharHashMap0.contains(char4);
      charArray0[2] = char2;
      char char5 = 'H';
      charArray0[3] = char5;
      char char6 = 'b';
      charArray0[4] = char6;
      char char7 = 'L';
      charArray0[5] = char7;
      char char8 = ',';
      charArray0[6] = char8;
      char char9 = 'j';
      charArray0[7] = char9;
      char char10 = 'h';
      charArray0[8] = char10;
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(charArray0, charArray0);
      tCharCharHashMap1.tempDisableAutoCompaction();
      TCharCharMap tCharCharMap0 = null;
      TCharCharHashMap tCharCharHashMap2 = null;
      try {
        tCharCharHashMap2 = new TCharCharHashMap(tCharCharMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-1302);
      float float0 = 0.0F;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0);
      TCharCharHashMap tCharCharHashMap1 = null;
      try {
        tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap0);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 0;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0);
      tCharCharHashMap0.getAutoCompactionFactor();
      char char0 = 'U';
      char char1 = '}';
      tCharCharHashMap0.put(char0, char1);
      int int1 = (-1604);
      char char2 = 'h';
      char char3 = 'T';
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(int1, (float) int1, char2, char3);
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap1);
      tCharCharHashMap2.values(tCharCharHashMap1._set);
      TCharCharHashMap tCharCharHashMap3 = new TCharCharHashMap();
      tCharCharHashMap3.keys();
      char char4 = 'Y';
      char char5 = 'G';
      tCharCharHashMap2.clear();
      tCharCharHashMap1.isEmpty();
      tCharCharHashMap1.adjustOrPutValue(char5, char5, char3);
      ObjectOutput objectOutput0 = null;
      byte[] byteArray0 = tCharCharHashMap1._states;
      tCharCharHashMap2.remove(char2);
      tCharCharHashMap0.getNoEntryKey();
      assertEquals(false, tCharCharHashMap0.isEmpty());
      
      // Undeclared exception!
      try {
        tCharCharHashMap3.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      tCharCharHashMap0.valueCollection();
      assertEquals(23, tCharCharHashMap0.capacity());
      
      int int0 = 0;
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte) (-89);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)9;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-89);
      byteArray0[3] = byte3;
      byte byte4 = (byte)36;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-104);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-109);
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-1);
      byteArray0[7] = byte7;
      byte byte8 = (byte) (-12);
      byteArray0[8] = byte8;
      byte byte9 = (byte)91;
      byteArray0[9] = byte9;
      tCharCharHashMap0._states = byteArray0;
      tCharCharHashMap0.setAutoCompactionFactor((float) int0);
      char[] charArray0 = new char[8];
      char char0 = '!';
      charArray0[0] = char0;
      char char1 = '|';
      charArray0[1] = char1;
      // Undeclared exception!
      try {
        tCharCharHashMap0.ensureCapacity((int) charArray0[1]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 17;
      float float0 = 0.0F;
      char char0 = ' ';
      char char1 = 'B';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0, char0, char1);
      tCharCharHashMap0.tempDisableAutoCompaction();
      assertEquals('B', tCharCharHashMap0.getNoEntryValue());
      assertEquals(' ', tCharCharHashMap0.getNoEntryKey());
      
      int int1 = 0;
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(int1, int1);
      char char2 = 'p';
      boolean boolean0 = tCharCharHashMap1.containsKey(char2);
      assertEquals('\u0000', tCharCharHashMap1.getNoEntryValue());
      assertEquals(false, boolean0);
      assertEquals('\u0000', tCharCharHashMap1.getNoEntryKey());
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 532;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0);
      tCharCharHashMap0.hashCode();
      assertEquals(1117, tCharCharHashMap0.capacity());
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryValue());
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryKey());
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-292);
      char char0 = '<';
      char char1 = 'E';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, (float) int0, char0, char1);
      int int1 = 540;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int1);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tCharCharHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals('E', tCharCharHashMap0.getNoEntryValue());
      assertEquals('<', tCharCharHashMap0.getNoEntryKey());
      
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(int0);
      char[] charArray0 = tCharCharHashMap1._set;
      int int2 = 853;
      tCharCharHashMap1.ensureCapacity(int2);
      assertEquals('\u0000', tCharCharHashMap1.getNoEntryValue());
      assertEquals('\u0000', tCharCharHashMap1.getNoEntryKey());
  }

  @Test
  public void test8()  throws Throwable  {
      char[] charArray0 = new char[1];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      char char0 = ']';
      char char1 = '!';
      tCharCharHashMap0.adjustValue(char0, char1);
      char char2 = 'i';
      charArray0[0] = char2;
      int int0 = (-171);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(int0);
      tCharCharHashMap1.getAutoCompactionFactor();
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap(charArray0, charArray0);
      boolean boolean0 = tCharCharHashMap2.adjustValue(charArray0[0], char2);
      assertEquals("{i=\u00D2}", tCharCharHashMap2.toString());
      
      TCharCharHashMap tCharCharHashMap3 = new TCharCharHashMap();
      char char3 = 'Z';
      tCharCharHashMap3.increment(char3);
      int int1 = (-1);
      char char4 = '3';
      TCharCharHashMap tCharCharHashMap4 = new TCharCharHashMap(int1, (float) char3, char4, char3);
      char char5 = '%';
      tCharCharHashMap4.get(char5);
      tCharCharHashMap3.hashCode();
      boolean boolean1 = tCharCharHashMap3.containsValue(char3);
      assertFalse(boolean1 == boolean0);
  }

//   @Test
//   public void test9()  throws Throwable  {
//       int int0 = 0;
//       float float0 = (-1721.2031F);
//       TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0);
//       char char0 = 'I';
//       char char1 = 'z';
//       tCharCharHashMap0.put(char0, char1);
//       TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap();
//       tCharCharHashMap1.iterator();
//       int int1 = tCharCharHashMap1.capacity();
//       PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
//       PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, int1);
//       int int2 = 242;
//       pipedOutputStream0.write(int2);
//       ObjectInputStream objectInputStream0 = null;
//       try {
//         objectInputStream0 = new ObjectInputStream((InputStream) pipedInputStream0);
//         fail("Expecting exception: InterruptedIOException");
//       
//       } catch(InterruptedIOException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 0;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, int0);
      tCharCharHashMap0.ensureCapacity(int0);
      tCharCharHashMap0.capacity();
      char[] charArray0 = new char[3];
      tCharCharHashMap0.isEmpty();
      tCharCharHashMap0.iterator();
      char char0 = ')';
      InputStream inputStream0 = null;
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = (-1062);
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, int0);
      char[] charArray0 = new char[2];
      char char0 = 'w';
      charArray0[0] = char0;
      char char1 = 'h';
      charArray0[1] = char1;
      char[] charArray1 = tCharCharHashMap0.keys(charArray0);
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryValue());
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryKey());
      assertNotNull(charArray1);
  }

  @Test
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[8];
      char char0 = 'g';
      charArray0[0] = char0;
      char char1 = '?';
      charArray0[1] = char1;
      char char2 = 'z';
      charArray0[2] = char2;
      char char3 = 'q';
      charArray0[3] = char3;
      char char4 = 'i';
      charArray0[4] = char4;
      char char5 = '@';
      charArray0[5] = char5;
      char char6 = '';
      charArray0[6] = char6;
      char char7 = 'N';
      charArray0[7] = char7;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      float float0 = 1.0F;
      tCharCharHashMap0.setAutoCompactionFactor(float0);
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryValue());
      assertEquals("{@=@, ?=?, q=q, N=N, =, z=z, i=i, g=g}", tCharCharHashMap0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 0;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, int0);
      char[] charArray0 = tCharCharHashMap0._set;
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryValue());
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryKey());
  }

  @Test
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[8];
      char char0 = '7';
      charArray0[0] = char0;
      charArray0[1] = char0;
      charArray0[2] = char0;
      charArray0[3] = char0;
      char char1 = 'a';
      charArray0[4] = char1;
      charArray0[5] = char1;
      charArray0[6] = char0;
      charArray0[7] = char0;
      charArray0[0] = char1;
      charArray0[1] = char1;
      charArray0[2] = char0;
      charArray0[3] = char1;
      charArray0[4] = char0;
      char char2 = '#';
      charArray0[5] = char2;
      charArray0[6] = char2;
      charArray0[7] = char2;
      charArray0[0] = char0;
      char char3 = 'K';
      charArray0[1] = char3;
      char char4 = ')';
      charArray0[2] = char4;
      char char5 = 'B';
      charArray0[3] = char5;
      char char6 = '^';
      charArray0[4] = char6;
      char char7 = '^';
      charArray0[5] = char7;
      char char8 = '^';
      charArray0[6] = char8;
      char char9 = '1';
      charArray0[7] = char9;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      ObjectOutput objectOutput0 = null;
      // Undeclared exception!
      try {
        tCharCharHashMap0.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 0;
      char[] charArray0 = new char[5];
      char char0 = '/';
      charArray0[0] = char0;
      char char1 = '%';
      charArray0[1] = char1;
      char char2 = 'X';
      charArray0[2] = char2;
      char char3 = 'O';
      charArray0[3] = char3;
      char char4 = 'S';
      charArray0[4] = char4;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      tCharCharHashMap0.compact();
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap();
      char char5 = 'z';
      char char6 = 'Q';
      tCharCharHashMap0.adjustValue(char6, charArray0[0]);
      assertEquals("{S=S, %=%, /=/, O=O, X=X}", tCharCharHashMap0.toString());
      
      boolean boolean0 = tCharCharHashMap1.adjustValue(char5, char5);
      assertEquals(false, boolean0);
      
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap(int0);
      tCharCharHashMap2.trimToSize();
      assertEquals('\u0000', tCharCharHashMap2.getNoEntryValue());
      assertEquals('\u0000', tCharCharHashMap2.getNoEntryKey());
      
      char char7 = 'd';
      char char8 = 'a';
      TCharCharHashMap tCharCharHashMap3 = new TCharCharHashMap((int) char5, (float) int0, char7, char8);
      assertEquals('a', tCharCharHashMap3.getNoEntryValue());
      assertEquals('d', tCharCharHashMap3.getNoEntryKey());
  }

  @Test
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[1];
      char char0 = 'd';
      charArray0[0] = char0;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      char char1 = tCharCharHashMap0.getNoEntryValue();
      assertEquals("{d=d}", tCharCharHashMap0.toString());
      assertEquals('\u0000', char1);
      
      int int0 = 0;
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(int0);
      tCharCharHashMap1.ensureCapacity(int0);
      TCharSet tCharSet0 = tCharCharHashMap1.keySet();
      assertEquals('\u0000', tCharSet0.getNoEntryValue());
  }

  @Test
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[4];
      char char0 = '0';
      charArray0[0] = char0;
      char char1 = 'l';
      charArray0[1] = char1;
      char char2 = '';
      charArray0[2] = char2;
      char char3 = 'M';
      charArray0[3] = char3;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryValue());
      assertEquals("{l=l, =, 0=0, M=M}", tCharCharHashMap0.toString());
      assertEquals('\u0000', tCharCharHashMap0.getNoEntryKey());
  }
}
