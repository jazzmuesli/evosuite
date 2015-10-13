/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedByteCollection;
import gnu.trove.impl.sync.TSynchronizedLongByteMap;
import gnu.trove.map.TLongByteMap;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.procedure.TLongByteProcedure;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.text.Segment;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedLongByteMapEvoSuite_Random {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap();
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0);
      TSynchronizedLongByteMap tSynchronizedLongByteMap1 = new TSynchronizedLongByteMap((TLongByteMap) tSynchronizedLongByteMap0);
      tSynchronizedLongByteMap1.size();
      TLongByteMap tLongByteMap0 = null;
      TSynchronizedLongByteMap tSynchronizedLongByteMap2 = null;
      try {
        tSynchronizedLongByteMap2 = new TSynchronizedLongByteMap(tLongByteMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 0;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(int0);
      Locale locale0 = Locale.US;
      String string0 = locale0.getDisplayName();
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0, (Object) string0);
      TLongByteHashMap tLongByteHashMap1 = new TLongByteHashMap((TLongByteMap) tSynchronizedLongByteMap0);
      Segment segment0 = new Segment();
      long long0 = tSynchronizedLongByteMap0.getNoEntryKey();
      tSynchronizedLongByteMap0.keys(tLongByteHashMap0._set);
      String string1 = segment0.toString();
      TSynchronizedLongByteMap tSynchronizedLongByteMap1 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap1, (Object) string1);
      long long1 = 0L;
      byte byte0 = (byte) (-114);
      String string2 = File.separator;
      tSynchronizedLongByteMap0.adjustValue(long0, byte0);
      tSynchronizedLongByteMap1.equals((Object) string2);
      tSynchronizedLongByteMap1.adjustOrPutValue(long1, byte0, byte0);
      assertEquals(1, tLongByteHashMap1.size());
      
      int int1 = 30577;
      TLongByteHashMap tLongByteHashMap2 = new TLongByteHashMap(int1);
      TSynchronizedLongByteMap tSynchronizedLongByteMap2 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap2);
      assertFalse(tLongByteHashMap2.equals(tLongByteHashMap1));
  }

//   @Test
//   public void test2()  throws Throwable  {
//       long[] longArray0 = new long[3];
//       long long0 = (-1629L);
//       longArray0[0] = long0;
//       long long1 = 861L;
//       longArray0[1] = long1;
//       long long2 = 1L;
//       longArray0[2] = long2;
//       byte[] byteArray0 = new byte[9];
//       byte byte0 = (byte) (-100);
//       byteArray0[0] = byte0;
//       byte byte1 = (byte) (-1);
//       byteArray0[1] = byte1;
//       byte byte2 = (byte)0;
//       byteArray0[2] = byte2;
//       byte byte3 = (byte) (-1);
//       byteArray0[3] = byte3;
//       byte byte4 = (byte)4;
//       byteArray0[4] = byte4;
//       byte byte5 = (byte)0;
//       byteArray0[5] = byte5;
//       byte byte6 = (byte)126;
//       byteArray0[6] = byte6;
//       byte byte7 = (byte) (-58);
//       byteArray0[7] = byte7;
//       byte byte8 = (byte) (-123);
//       byteArray0[8] = byte8;
//       TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(longArray0, byteArray0);
//       TLongByteHashMap tLongByteHashMap1 = new TLongByteHashMap((TLongByteMap) tLongByteHashMap0);
//       TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap1);
//       TSynchronizedByteCollection tSynchronizedByteCollection0 = (TSynchronizedByteCollection)tSynchronizedLongByteMap0.valueCollection();
//       assertEquals(0, tSynchronizedByteCollection0.getNoEntryValue());
//   }

  @Test
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[7];
      long long0 = 1064L;
      longArray0[0] = long0;
      long long1 = 0L;
      longArray0[1] = long1;
      long long2 = (-1041L);
      longArray0[2] = long2;
      long long3 = (-9223372036854775808L);
      longArray0[3] = long3;
      long long4 = (-9223372036854775808L);
      longArray0[4] = long4;
      long long5 = 818L;
      longArray0[5] = long5;
      long long6 = 264L;
      longArray0[6] = long6;
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-105);
      byteArray0[0] = byte0;
      byte byte1 = (byte)13;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-58);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-120);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-1);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-115);
      byteArray0[6] = byte6;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(longArray0, byteArray0);
      Locale locale0 = Locale.GERMAN;
      Locale locale1 = Locale.UK;
      String string0 = locale0.getDisplayScript(locale1);
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0, (Object) string0);
      long long7 = 1414L;
      tSynchronizedLongByteMap0.put(long7, byteArray0[6]);
      assertEquals(7, tLongByteHashMap0.size());
      assertEquals("{-9223372036854775808=-120, 1414=-115, 1064=-105, 264=-115, -1041=-58, 818=-1, 0=13}", tLongByteHashMap0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 1;
          long long0 = 0L;
          byte byte0 = (byte) (-61);
          TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(int0, (float) int0, long0, byte0);
          String string0 = "vVp\\%LzH6n]C0@x`E";
          // Undeclared exception!
          try {
            File.createTempFile(string0, string0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      float float0 = 10.0F;
      byte byte0 = (byte)48;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(int0, float0, (long) int0, byte0);
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0);
      TLongByteProcedure tLongByteProcedure0 = null;
      tSynchronizedLongByteMap0.forEachEntry(tLongByteProcedure0);
      float float1 = 0.0F;
      byte byte1 = (byte)15;
      TLongByteMap tLongByteMap0 = null;
      TLongByteHashMap tLongByteHashMap1 = null;
      try {
        tLongByteHashMap1 = new TLongByteHashMap(tLongByteMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = (-2048);
      int int1 = 0;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(int1);
      String string0 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: :#
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TLongByteMap tLongByteMap0 = null;
      String string0 = "Y;-VWdT#qG";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in fragment at index 23: Y;-VWdT#qG:Y;-VWdT%23qG#Y;-VWdT%23qG
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = 2L;
      longArray0[0] = long0;
      long long1 = (-432L);
      longArray0[1] = long1;
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte) (-78);
      byteArray0[0] = byte0;
      byte byte1 = (byte)121;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-125);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-110);
      byteArray0[5] = byte5;
      byte byte6 = (byte)101;
      byteArray0[6] = byte6;
      byte byte7 = (byte)119;
      byteArray0[7] = byte7;
      byte byte8 = (byte)12;
      byteArray0[8] = byte8;
      byte byte9 = (byte) (-49);
      byteArray0[9] = byte9;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(longArray0, byteArray0);
      Locale locale0 = Locale.FRANCE;
      Locale locale1 = Locale.CHINESE;
      String string0 = locale0.getDisplayName(locale1);
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0, (Object) string0);
      boolean boolean0 = tSynchronizedLongByteMap0.increment((long) byte5);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      long[] longArray0 = new long[4];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = (-1301L);
      longArray0[1] = long1;
      long long2 = 9223372036854775807L;
      longArray0[2] = long2;
      long long3 = 595L;
      longArray0[3] = long3;
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-127);
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-44);
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-21);
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-116);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-1);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-75);
      byteArray0[6] = byte6;
      byte byte7 = (byte)0;
      byteArray0[7] = byte7;
      byte byte8 = (byte) (-75);
      byteArray0[8] = byte8;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(longArray0, byteArray0);
      Locale locale0 = Locale.UK;
      Locale locale1 = null;
      // Undeclared exception!
      try {
        locale0.getDisplayCountry(locale1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 1455;
      int int1 = 1271;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap();
      String string0 = "^5)C(&tWW";
      String string1 = "fjJ!E*m0O5p";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int0, string0, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: ^5)C(&tWW://%5E5)C(&tWW@^5)C(&tWW:1455%5E5)C(&tWW?%5E5)C(&tWW#fjJ!E*m0O5p
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = 1L;
      longArray0[0] = long0;
      long long1 = 1717L;
      longArray0[1] = long1;
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte) (-80);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)118;
      byteArray0[2] = byte2;
      byte byte3 = (byte)1;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-50);
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      byte byte7 = (byte)8;
      byteArray0[7] = byte7;
      byte byte8 = (byte)59;
      byteArray0[8] = byte8;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(longArray0, byteArray0);
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0);
      long long2 = 33L;
      String string0 = Long.toBinaryString(long2);
      TSynchronizedLongByteMap tSynchronizedLongByteMap1 = new TSynchronizedLongByteMap((TLongByteMap) tSynchronizedLongByteMap0, (Object) string0);
      tSynchronizedLongByteMap1.values(tLongByteHashMap0._states);
      assertEquals("{1717=0}", tLongByteHashMap0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 0;
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap(int0);
      Object object0 = null;
      tLongByteHashMap0.ensureCapacity(int0);
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap((TLongByteMap) tLongByteHashMap0, object0);
      // Undeclared exception!
      try {
        tSynchronizedLongByteMap0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TLongByteHashMap tLongByteHashMap0 = new TLongByteHashMap();
      String string0 = "6V}R";
      String string1 = "";
      int int0 = (-943);
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string1, int0, string1, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 0: 6V}R://6V%7DR@:-943?6V%7DR#
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 0;
      TLongByteMap tLongByteMap0 = null;
      TSynchronizedLongByteMap tSynchronizedLongByteMap0 = null;
      try {
        tSynchronizedLongByteMap0 = new TSynchronizedLongByteMap(tLongByteMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
