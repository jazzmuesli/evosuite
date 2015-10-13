/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TDoubleShortMap;
import gnu.trove.map.hash.TDoubleShortHashMap;
import gnu.trove.procedure.TDoubleShortProcedure;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TDoubleShortHashEvoSuite_Random {

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
      TDoubleShortMap tDoubleShortMap0 = null;
      int int0 = 0;
      float float0 = (-1220.2202F);
      double double0 = (-1780.0922977174275);
      short short0 = (short)1209;
      TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(int0, float0, double0, short0);
      int int1 = 51;
      double double1 = 643.4329086669109;
      short short1 = (short)0;
      TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap();
      tDoubleShortHashMap1.getAutoCompactionFactor();
      TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap(int1, (float) int1, double1, short1);
      tDoubleShortHashMap2.isEmpty();
      tDoubleShortHashMap2.clear();
      TDoubleShortHashMap tDoubleShortHashMap3 = null;
      try {
        tDoubleShortHashMap3 = new TDoubleShortHashMap(tDoubleShortMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = Double.NEGATIVE_INFINITY;
      doubleArray0[0] = double0;
      double double1 = (-33.60081119921196);
      doubleArray0[1] = double1;
      double double2 = 0.0;
      doubleArray0[2] = double2;
      double double3 = 0.0;
      doubleArray0[3] = double3;
      double double4 = (-1413.933986398652);
      doubleArray0[4] = double4;
      double double5 = (-1885.3117954931495);
      doubleArray0[5] = double5;
      double double6 = 1.0;
      doubleArray0[6] = double6;
      double double7 = 1.0;
      doubleArray0[7] = double7;
      short[] shortArray0 = new short[6];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short) (-83);
      shortArray0[1] = short1;
      short short2 = (short) (-1);
      shortArray0[2] = short2;
      short short3 = (short)1014;
      shortArray0[3] = short3;
      short short4 = (short)2014;
      shortArray0[4] = short4;
      short short5 = (short)55;
      shortArray0[5] = short5;
      TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
      String string0 = ",jYH_gJ&\"49M`8";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 0: ,jYH_gJ&\"49M`8:,jYH_gJ&%2249M%608#,jYH_gJ&%2249M%608
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 0.0;
      doubleArray0[0] = double0;
      double double1 = 1768.910379623087;
      doubleArray0[1] = double1;
      double double2 = 1.0;
      doubleArray0[2] = double2;
      double double3 = (-1818.1293933223067);
      doubleArray0[3] = double3;
      double double4 = 804.5843686875608;
      doubleArray0[4] = double4;
      double double5 = 0.0;
      doubleArray0[5] = double5;
      short[] shortArray0 = new short[10];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short) (-1238);
      shortArray0[1] = short1;
      short short2 = (short) (-1606);
      shortArray0[2] = short2;
      short short3 = (short)82;
      shortArray0[3] = short3;
      short short4 = (short) (-1);
      shortArray0[4] = short4;
      short short5 = (short) (-1140);
      shortArray0[5] = short5;
      short short6 = (short) (-1147);
      shortArray0[6] = short6;
      short short7 = (short)1913;
      shortArray0[7] = short7;
      short short8 = (short)1591;
      shortArray0[8] = short8;
      short short9 = (short) (-1297);
      shortArray0[9] = short9;
      TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
      TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap();
      tDoubleShortHashMap1.tempDisableAutoCompaction();
      tDoubleShortHashMap1.getNoEntryValue();
      TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap();
      TDoubleShortHashMap tDoubleShortHashMap3 = new TDoubleShortHashMap();
      tDoubleShortHashMap1.compact();
      double double6 = 1.0;
      short short10 = (short) (-671);
      tDoubleShortHashMap1.adjustValue(double6, short10);
      tDoubleShortHashMap1.putAll((TDoubleShortMap) tDoubleShortHashMap2);
      short[] shortArray1 = tDoubleShortHashMap1.values();
      assertNotSame(shortArray1, shortArray0);
  }

//   @Test
//   public void test3()  throws Throwable  {
//       int int0 = 631;
//       float float0 = 869.1307F;
//       double double0 = 1.0;
//       short short0 = (short)1;
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(int0, float0, double0, short0);
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap((TDoubleShortMap) tDoubleShortHashMap0);
//       assertEquals(1, tDoubleShortHashMap0.getNoEntryValue());
//       assertEquals(1.0, tDoubleShortHashMap0.getNoEntryKey(), 0.01D);
//       
//       TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap(int0, int0);
//       double double1 = (-1.0);
//       short short1 = (short) (-531);
//       boolean boolean0 = tDoubleShortHashMap2.adjustValue(double1, short1);
//       assertEquals(0.0, tDoubleShortHashMap2.getNoEntryKey(), 0.01D);
//       assertEquals(0, tDoubleShortHashMap2.getNoEntryValue());
//       assertEquals(false, boolean0);
//   }

//   @Test
//   public void test4()  throws Throwable  {
//       double[] doubleArray0 = new double[7];
//       double double0 = 351.57504196902926;
//       doubleArray0[0] = double0;
//       double double1 = 0.0;
//       doubleArray0[1] = double1;
//       double double2 = (-1536.1772925102734);
//       doubleArray0[2] = double2;
//       double double3 = (-1766.36306648895);
//       doubleArray0[3] = double3;
//       double double4 = 0.0;
//       doubleArray0[4] = double4;
//       double double5 = 0.0;
//       doubleArray0[5] = double5;
//       double double6 = (-1317.0057425721923);
//       doubleArray0[6] = double6;
//       short[] shortArray0 = new short[7];
//       short short0 = (short)17739;
//       shortArray0[0] = short0;
//       short short1 = (short)0;
//       shortArray0[1] = short1;
//       short short2 = (short)0;
//       shortArray0[2] = short2;
//       short short3 = (short) (-78);
//       shortArray0[3] = short3;
//       short short4 = (short) (-396);
//       shortArray0[4] = short4;
//       short short5 = (short) (-1);
//       shortArray0[5] = short5;
//       short short6 = (short)0;
//       shortArray0[6] = short6;
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       tDoubleShortHashMap0.tempDisableAutoCompaction();
//       assertEquals(0, tDoubleShortHashMap0.getNoEntryValue());
//       assertEquals(5, tDoubleShortHashMap0.size());
//       assertEquals("{-1317.0057425721923=0, -1766.36306648895=-78, -1536.1772925102734=0, 351.57504196902926=17739, 0.0=-1}", tDoubleShortHashMap0.toString());
//   }

//   @Test
//   public void test5()  throws Throwable  {
//       double[] doubleArray0 = new double[3];
//       double double0 = (-940.4990680861615);
//       doubleArray0[0] = double0;
//       double double1 = (-1.0);
//       doubleArray0[1] = double1;
//       double double2 = 0.0;
//       doubleArray0[2] = double2;
//       short[] shortArray0 = new short[2];
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap((TDoubleShortMap) tDoubleShortHashMap0);
//       tDoubleShortHashMap1.hashCode();
//       assertEquals(23, tDoubleShortHashMap1.capacity());
//       assertEquals("{-940.4990680861615=0, -1.0=0}", tDoubleShortHashMap0.toString());
//       
//       short short0 = (short)823;
//       shortArray0[0] = short0;
//       shortArray0[0] = short0;
//       doubleArray0[0] = double1;
//       int int0 = (-1);
//       TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap(int0);
//       TDoubleShortProcedure tDoubleShortProcedure0 = null;
//       tDoubleShortHashMap2.forEachEntry(tDoubleShortProcedure0);
//       doubleArray0[1] = (double) shortArray0[0];
//       doubleArray0[2] = (double) short0;
//       shortArray0[1] = short0;
//       short short1 = (short) (-1702);
//       int int1 = (-1786);
//       int int2 = 0;
//       TDoubleShortHashMap tDoubleShortHashMap3 = new TDoubleShortHashMap(int2);
//       tDoubleShortHashMap3.containsValue(short1);
//       float float0 = 0.0F;
//       TDoubleShortHashMap tDoubleShortHashMap4 = new TDoubleShortHashMap(int1, float0);
//       assertEquals(0.0, tDoubleShortHashMap4.getNoEntryKey(), 0.01D);
//       assertEquals(0, tDoubleShortHashMap4.getNoEntryValue());
//       
//       shortArray0[1] = short1;
//       TDoubleShortHashMap tDoubleShortHashMap5 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       assertEquals("{-1.0=823, 823.0=-1702}", tDoubleShortHashMap5.toString());
//       
//       Locale locale0 = Locale.CANADA_FRENCH;
//       Locale locale1 = Locale.ITALY;
//       String string0 = locale0.getDisplayVariant(locale1);
//       tDoubleShortHashMap3.equals((Object) string0);
//       assertEquals(0.0, tDoubleShortHashMap3.getNoEntryKey(), 0.01D);
//       assertEquals(0, tDoubleShortHashMap3.getNoEntryValue());
//   }

  @Test
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 1694.8786267215623;
      doubleArray0[0] = double0;
      double double1 = 715.5142522361087;
      doubleArray0[1] = double1;
      double double2 = 0.0;
      doubleArray0[2] = double2;
      double double3 = 0.0;
      doubleArray0[3] = double3;
      double double4 = 1298.5818669669402;
      doubleArray0[4] = double4;
      short[] shortArray0 = new short[1];
      short short0 = (short)0;
      shortArray0[0] = short0;
      TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
      assertEquals(11, tDoubleShortHashMap0.capacity());
      
      tDoubleShortHashMap0.trimToSize();
      assertEquals("{1694.8786267215623=0}", tDoubleShortHashMap0.toString());
  }

//   @Test
//   public void test7()  throws Throwable  {
//       int int0 = 1637;
//       double[] doubleArray0 = new double[4];
//       double double0 = (-2013.1609767346436);
//       doubleArray0[0] = double0;
//       double double1 = 801.8172087823139;
//       doubleArray0[1] = double1;
//       doubleArray0[2] = (double) int0;
//       doubleArray0[3] = (double) int0;
//       short[] shortArray0 = new short[2];
//       short short0 = (short)28289;
//       shortArray0[0] = short0;
//       short short1 = (short)935;
//       shortArray0[1] = short1;
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       float float0 = 866.7785F;
//       short short2 = (short)719;
//       shortArray0[0] = short0;
//       shortArray0[1] = short0;
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap((int) shortArray0[1], float0, double0, short2);
//       tDoubleShortHashMap0.putAll((TDoubleShortMap) tDoubleShortHashMap1);
//       assertEquals(0.0, tDoubleShortHashMap0.getNoEntryKey(), 0.01D);
//       assertEquals("{-2013.1609767346436=28289, 801.8172087823139=935}", tDoubleShortHashMap0.toString());
//       assertEquals(0, tDoubleShortHashMap0.getNoEntryValue());
//       assertEquals(719, tDoubleShortHashMap1.getNoEntryValue());
//       assertEquals((-2013.1609767346436), tDoubleShortHashMap1.getNoEntryKey(), 0.01D);
//       
//       float float1 = 1.0F;
//       TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap(int0, float1);
//       tDoubleShortHashMap2.isEmpty();
//       assertEquals(0.0, tDoubleShortHashMap2.getNoEntryKey(), 0.01D);
//       assertEquals(0, tDoubleShortHashMap2.getNoEntryValue());
//       assertFalse(tDoubleShortHashMap2.equals(tDoubleShortHashMap0));
//   }

//   @Test
//   public void test8()  throws Throwable  {
//       int int0 = (-1);
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(int0);
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap((TDoubleShortMap) tDoubleShortHashMap0);
//       int int1 = 310081;
//       float float0 = 242.17107F;
//       TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap(int1, float0);
//       short short0 = (short) (-728);
//       tDoubleShortHashMap1.adjustValue((double) int1, short0);
//       tDoubleShortHashMap1.compact();
//       short short1 = (short)122;
//       tDoubleShortHashMap2.putIfAbsent((double) float0, short1);
//       tDoubleShortHashMap1._set = tDoubleShortHashMap0._set;
//       tDoubleShortHashMap2.isEmpty();
//       TDoubleShortHashMap tDoubleShortHashMap3 = new TDoubleShortHashMap();
//       tDoubleShortHashMap2.contains((double) short0);
//       assertEquals(false, tDoubleShortHashMap2.isEmpty());
//       
//       TDoubleShortHashMap tDoubleShortHashMap4 = new TDoubleShortHashMap();
//       tDoubleShortHashMap4.trimToSize();
//       tDoubleShortHashMap4.getAutoCompactionFactor();
//       assertEquals(0, tDoubleShortHashMap4.getNoEntryValue());
//   }

//   @Test
//   public void test9()  throws Throwable  {
//       int int0 = 1597;
//       float float0 = 0.0F;
//       double double0 = 0.0;
//       short short0 = (short)1;
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(int0, float0, double0, short0);
//       tDoubleShortHashMap0.hashCode();
//       assertEquals(0.0, tDoubleShortHashMap0.getNoEntryKey(), 0.01D);
//       assertEquals(1, tDoubleShortHashMap0.getNoEntryValue());
//       
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap();
//       assertEquals(0, tDoubleShortHashMap1.getNoEntryValue());
//       assertEquals(0.0, tDoubleShortHashMap1.getNoEntryKey(), 0.01D);
//       assertEquals(23, tDoubleShortHashMap1.capacity());
//   }

//   @Test
//   public void test10()  throws Throwable  {
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap();
//       double double0 = (-132.1021251483865);
//       boolean boolean0 = tDoubleShortHashMap0.containsKey(double0);
//       assertEquals(false, boolean0);
//       
//       int int0 = 1273;
//       double[] doubleArray0 = new double[3];
//       doubleArray0[0] = (double) int0;
//       doubleArray0[1] = (double) int0;
//       doubleArray0[2] = (double) int0;
//       short[] shortArray0 = new short[3];
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap();
//       boolean boolean1 = true;
//       tDoubleShortHashMap1.reenableAutoCompaction(boolean1);
//       short short0 = (short)231;
//       shortArray0[0] = short0;
//       short short1 = (short) (-317);
//       shortArray0[1] = short1;
//       short short2 = (short)1482;
//       float float0 = 589.80615F;
//       tDoubleShortHashMap1.setAutoCompactionFactor(float0);
//       assertEquals(0.0, tDoubleShortHashMap1.getNoEntryKey(), 0.01D);
//       
//       shortArray0[0] = short0;
//       shortArray0[1] = short1;
//       shortArray0[2] = short0;
//       shortArray0[2] = short2;
//       TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       TDoubleShortHashMap tDoubleShortHashMap3 = new TDoubleShortHashMap(int0, int0);
//       double[] doubleArray1 = tDoubleShortHashMap2.keys(tDoubleShortHashMap3._set);
//       assertEquals(0.0, tDoubleShortHashMap2.getNoEntryKey(), 0.01D);
//       assertNotNull(doubleArray1);
//       assertEquals("{1273.0=1482}", tDoubleShortHashMap2.toString());
//       assertEquals(7, tDoubleShortHashMap2.capacity());
//       assertEquals(1, tDoubleShortHashMap2.size());
//       
//       tDoubleShortHashMap3.tempDisableAutoCompaction();
//       assertEquals(0.0, tDoubleShortHashMap3.getNoEntryKey(), 0.01D);
//       assertEquals(0, tDoubleShortHashMap3.getNoEntryValue());
//   }

//   @Test
//   public void test11()  throws Throwable  {
//       int int0 = 132;
//       double[] doubleArray0 = new double[6];
//       double double0 = (-1747.4222496250304);
//       doubleArray0[0] = double0;
//       doubleArray0[1] = (double) int0;
//       doubleArray0[2] = (double) int0;
//       doubleArray0[3] = (double) int0;
//       double double1 = (-1020.133399096728);
//       doubleArray0[4] = double1;
//       doubleArray0[5] = (double) int0;
//       short[] shortArray0 = new short[10];
//       short short0 = (short)851;
//       shortArray0[0] = short0;
//       short short1 = (short)0;
//       shortArray0[1] = short1;
//       short short2 = (short) (-1529);
//       shortArray0[2] = short2;
//       short short3 = (short) (-1891);
//       shortArray0[3] = short3;
//       short short4 = (short) (-1042);
//       shortArray0[4] = short4;
//       short short5 = (short)929;
//       shortArray0[5] = short5;
//       short short6 = (short)24407;
//       shortArray0[6] = short6;
//       short short7 = (short) (-1140);
//       shortArray0[7] = short7;
//       short short8 = (short)0;
//       shortArray0[8] = short8;
//       short short9 = (short)107;
//       shortArray0[9] = short9;
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       Object object0 = null;
//       tDoubleShortHashMap0.equals(object0);
//       assertEquals(0, tDoubleShortHashMap0.getNoEntryValue());
//       assertEquals(3, tDoubleShortHashMap0.size());
//       assertEquals(23, tDoubleShortHashMap0.capacity());
//       assertEquals("{-1747.4222496250304=851, 132.0=929, -1020.133399096728=-1042}", tDoubleShortHashMap0.toString());
//       assertEquals(0.0, tDoubleShortHashMap0.getNoEntryKey(), 0.01D);
//       
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap(int0, int0);
//       tDoubleShortHashMap1.trimToSize();
//       assertEquals(0, tDoubleShortHashMap1.getNoEntryValue());
//       assertEquals(0.0, tDoubleShortHashMap1.getNoEntryKey(), 0.01D);
//   }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-1007);
      TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(int0);
      int int1 = 188;
      int int2 = 0;
      TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap(int2);
      Object object0 = new Object();
      tDoubleShortHashMap1.equals(object0);
      TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap();
      tDoubleShortHashMap2.contains((double) int2);
      int int3 = (-150);
      double[] doubleArray0 = tDoubleShortHashMap1.keys(tDoubleShortHashMap2._set);
      assertNotNull(doubleArray0);
      assertEquals(23, tDoubleShortHashMap2.capacity());
      
      tDoubleShortHashMap2.trimToSize();
      double double0 = (-1378.889104736403);
      short short0 = (short)1983;
      TDoubleShortHashMap tDoubleShortHashMap3 = new TDoubleShortHashMap(int3, (float) int3, double0, short0);
      double double1 = Double.POSITIVE_INFINITY;
      tDoubleShortHashMap3.remove(double1);
      TDoubleShortHashMap tDoubleShortHashMap4 = new TDoubleShortHashMap(int1);
      assertEquals(379, tDoubleShortHashMap4.capacity());
  }

//   @Test
//   public void test13()  throws Throwable  {
//       double[] doubleArray0 = new double[4];
//       double double0 = (-1967.4148660023407);
//       doubleArray0[0] = double0;
//       double double1 = Double.NEGATIVE_INFINITY;
//       doubleArray0[1] = double1;
//       double double2 = Double.POSITIVE_INFINITY;
//       doubleArray0[2] = double2;
//       double double3 = 1.0;
//       doubleArray0[3] = double3;
//       short[] shortArray0 = new short[8];
//       short short0 = (short) (-1);
//       shortArray0[0] = short0;
//       short short1 = (short)1913;
//       shortArray0[1] = short1;
//       short short2 = (short)47;
//       shortArray0[2] = short2;
//       short short3 = (short)104;
//       shortArray0[3] = short3;
//       short short4 = (short)90;
//       shortArray0[4] = short4;
//       short short5 = (short)0;
//       shortArray0[5] = short5;
//       short short6 = (short)69;
//       shortArray0[6] = short6;
//       short short7 = (short) (-22555);
//       shortArray0[7] = short7;
//       TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap(doubleArray0, shortArray0);
//       short short8 = (short)1245;
//       short short9 = tDoubleShortHashMap0.put(double2, short8);
//       assertEquals("{1.0=104, -Infinity=1245, -1967.4148660023407=-1}", tDoubleShortHashMap0.toString());
//       
//       int int0 = 1;
//       float float0 = 0.0F;
//       short short10 = (short)0;
//       TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap(int0, float0, (double) int0, short10);
//       tDoubleShortHashMap1.trimToSize();
//       assertFalse(short10 == short9);
//   }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 452759;
      TDoubleShortHashMap tDoubleShortHashMap0 = new TDoubleShortHashMap();
      TDoubleShortProcedure tDoubleShortProcedure0 = null;
      String string0 = "";
      File file0 = new File(string0);
      String string1 = file0.getParent();
      tDoubleShortHashMap0.equals((Object) string1);
      tDoubleShortHashMap0.forEachEntry(tDoubleShortProcedure0);
      TDoubleShortHashMap tDoubleShortHashMap1 = new TDoubleShortHashMap();
      tDoubleShortHashMap1.getNoEntryKey();
      TDoubleShortHashMap tDoubleShortHashMap2 = new TDoubleShortHashMap();
      boolean boolean0 = false;
      tDoubleShortHashMap2.reenableAutoCompaction(boolean0);
      int int1 = 0;
      double double0 = (-1025.4067748409739);
      short short0 = (short) (-1);
      TDoubleShortHashMap tDoubleShortHashMap3 = new TDoubleShortHashMap(int1, (float) int1, double0, short0);
      boolean boolean1 = false;
      tDoubleShortHashMap3.reenableAutoCompaction(boolean1);
      TDoubleShortHashMap tDoubleShortHashMap4 = new TDoubleShortHashMap(int0, int0);
      tDoubleShortHashMap2.put((double) int0, short0);
      int int2 = 1898;
      tDoubleShortHashMap2.ensureCapacity(int2);
      assertEquals(1, tDoubleShortHashMap2.size());
      
      tDoubleShortHashMap4.tempDisableAutoCompaction();
      tDoubleShortHashMap3.size();
      TDoubleShortHashMap tDoubleShortHashMap5 = new TDoubleShortHashMap((TDoubleShortMap) tDoubleShortHashMap4);
      TDoubleShortHashMap tDoubleShortHashMap6 = new TDoubleShortHashMap((TDoubleShortMap) tDoubleShortHashMap5);
      boolean boolean2 = false;
      tDoubleShortHashMap5.isEmpty();
      tDoubleShortHashMap4.reenableAutoCompaction(boolean2);
      tDoubleShortHashMap0.forEachEntry(tDoubleShortProcedure0);
      assertEquals(0.0, tDoubleShortHashMap0.getNoEntryKey(), 0.01D);
  }
}
