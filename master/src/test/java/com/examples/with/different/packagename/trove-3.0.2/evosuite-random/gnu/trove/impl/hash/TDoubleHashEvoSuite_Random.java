/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TDoubleCollection;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.array.TDoubleArrayList;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.hash.TDoubleObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.procedure.array.ToObjectArrayProceedure;
import gnu.trove.set.hash.TDoubleHashSet;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TDoubleHashEvoSuite_Random {

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
      double[] doubleArray0 = new double[7];
      double double0 = (-1074.2514193662098);
      doubleArray0[0] = double0;
      double double1 = 1625.0371965311244;
      doubleArray0[1] = double1;
      double double2 = 1013.2143780429344;
      doubleArray0[2] = double2;
      double double3 = 0.0;
      doubleArray0[3] = double3;
      double double4 = 672.3572179357155;
      doubleArray0[4] = double4;
      double double5 = (-150.25008612579825);
      doubleArray0[5] = double5;
      double double6 = 0.0;
      doubleArray0[6] = double6;
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(doubleArray0);
      int int0 = 31;
      tDoubleHashSet0.ensureCapacity(int0);
      assertEquals(79, tDoubleHashSet0.capacity());
      assertEquals(6, tDoubleHashSet0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 165;
      TDoubleObjectHashMap<String> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<String>();
      int int1 = 797;
      tDoubleObjectHashMap0.ensureCapacity(int1);
      float float0 = (-400.52335F);
      TDoubleObjectHashMap<String> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<String>(int0, float0, (double) float0);
      int int2 = 1622;
      float float1 = 324.69183F;
      tDoubleObjectHashMap1.size();
      double double0 = 759.1012020485604;
      tDoubleObjectHashMap1.contains(double0);
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int2, float1);
      tDoubleHashSet0.iterator();
      int int3 = 1672;
      tDoubleObjectHashMap1.clear();
      float float2 = (-1.0F);
      String string0 = "";
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0);
      // Undeclared exception!
      try {
        stringTokenizer0.nextToken(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet();
      double double0 = (-13.212180997413164);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      int int0 = 186;
      double double1 = (-1322.1472342642546);
      doubleArray0[0] = double1;
      doubleArray0[1] = double1;
      double double2 = 1329.9204690577883;
      doubleArray0[2] = double2;
      int int1 = 0;
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(int1);
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Object>((TDoubleObjectMap<?>) tDoubleObjectHashMap0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) double0;
      objectArray0[1] = (Object) tDoubleObjectHashMap1;
      ToObjectArrayProceedure<Object> toObjectArrayProceedure0 = new ToObjectArrayProceedure<Object>(objectArray0);
      tDoubleObjectHashMap1.forEachValue((TObjectProcedure<? super Object>) toObjectArrayProceedure0);
      doubleArray0[3] = (double) int0;
      doubleArray0[4] = double1;
      doubleArray0[5] = double2;
      doubleArray0[6] = double1;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap2 = new TDoubleObjectHashMap<Object>(int0);
      tDoubleObjectHashMap2.tempDisableAutoCompaction();
      doubleArray0[2] = double0;
      doubleArray0[3] = double0;
      doubleArray0[4] = double0;
      doubleArray0[5] = double0;
      doubleArray0[6] = double0;
      tDoubleHashSet0.addAll(doubleArray0);
      boolean boolean0 = tDoubleHashSet0.remove(double0);
      assertEquals("{-1322.1472342642546}", tDoubleHashSet0.toString());
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet();
      double[] doubleArray0 = new double[1];
      double double0 = 0.0;
      String string0 = "|";
      File file0 = new File(string0);
      String string1 = file0.getCanonicalPath();
      tDoubleHashSet0.equals((Object) string1);
      doubleArray0[0] = double0;
      tDoubleHashSet0.retainAll(doubleArray0);
      assertEquals(23, tDoubleHashSet0.capacity());
      assertEquals(0.0, tDoubleHashSet0.getNoEntryValue(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-205);
      float float0 = 1036.4473F;
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int0, float0);
      tDoubleHashSet0.tempDisableAutoCompaction();
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>(int0);
      tDoubleObjectHashMap0.clear();
      double[] doubleArray0 = tDoubleHashSet0._set;
      int int1 = 0;
      TDoubleList tDoubleList0 = null;
      String string0 = "s\"p{";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 1: s\"p{:s%22p%7B#s%22p%7B
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList();
      int int0 = 0;
      float float0 = (-919.1961F);
      double double0 = 1026.8909197619978;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>(int0, float0, double0);
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryValue(), 0.01D);
      
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet((TDoubleCollection) tDoubleArrayList0);
      Collection<Integer> collection0 = null;
      // Undeclared exception!
      try {
        tDoubleHashSet0.removeAll(collection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int0, int0);
      tDoubleHashSet0.size();
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
      TDoubleHashSet tDoubleHashSet1 = new TDoubleHashSet();
      tDoubleHashSet1.toArray();
      tDoubleObjectHashMap0.iterator();
      PipedInputStream pipedInputStream0 = null;
      PipedOutputStream pipedOutputStream0 = null;
      try {
        pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 227;
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int0);
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-54);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-38);
      int int1 = (-1680);
      double double0 = 113.44140698149434;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>(int1, (float) byteArray0[1], double0);
      tDoubleObjectHashMap0.getNoEntryKey();
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryValue(), 0.01D);
      
      byteArray0[2] = byte2;
      byte byte3 = (byte)99;
      TDoubleArrayList tDoubleArrayList0 = TDoubleArrayList.wrap(tDoubleHashSet0._set);
      boolean boolean0 = tDoubleHashSet0.removeAll((TDoubleCollection) tDoubleArrayList0);
      assertEquals(false, boolean0);
      
      // Undeclared exception!
      try {
        tDoubleArrayList0.insert((int) byte0, tDoubleHashSet0._set);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can not grow ArrayList wrapped external array
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 183;
      float float0 = 1353.1559F;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>(int0, float0, (double) float0);
      tDoubleObjectHashMap0.isEmpty();
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryValue(), 0.01D);
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 111;
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int0, int0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(tDoubleHashSet0._states);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) dataInputStream0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) bufferedInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 0;
      float float0 = 0.0F;
      TDoubleObjectHashMap<String> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<String>(int0, float0);
      tDoubleObjectHashMap0.getAutoCompactionFactor();
      int int1 = 0;
      int int2 = 1;
      int int3 = (-172);
      tDoubleObjectHashMap0.ensureCapacity(int3);
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int2, int2);
      tDoubleHashSet0.compact();
      assertEquals(0.0, tDoubleHashSet0.getNoEntryValue(), 0.01D);
      
      int int4 = 59;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Object>(int4);
      double double0 = 82.41069005666604;
      boolean boolean0 = tDoubleObjectHashMap1.containsKey(double0);
      assertEquals(false, boolean0);
      
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap2 = new TDoubleObjectHashMap<Object>(int1);
      tDoubleObjectHashMap2.clear();
      Object[] objectArray0 = tDoubleObjectHashMap2.values();
      assertNotNull(objectArray0);
      
      tDoubleObjectHashMap1.keySet();
      assertEquals(0.0, tDoubleObjectHashMap1.getNoEntryValue(), 0.01D);
      assertEquals(137, tDoubleObjectHashMap1.capacity());
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = (-1122);
      int int1 = Integer.MAX_VALUE;
      TDoubleHashSet tDoubleHashSet0 = new TDoubleHashSet(int1);
      Locale locale0 = Locale.getDefault();
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      String string0 = locale0.getDisplayCountry(locale1);
      tDoubleHashSet0.equals((Object) string0);
      TDoubleHashSet tDoubleHashSet1 = new TDoubleHashSet(int0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      tDoubleHashSet1.retainAll((Collection<?>) linkedList0);
      tDoubleHashSet1.isEmpty();
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(int0);
      TDoubleHashSet tDoubleHashSet2 = new TDoubleHashSet();
      double[] doubleArray0 = tDoubleHashSet2._set;
      assertEquals(23, tDoubleHashSet2.capacity());
      assertEquals(0.0, tDoubleHashSet2.getNoEntryValue(), 0.01D);
      
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Integer>(int0);
      tDoubleObjectHashMap1.keySet();
      assertEquals(0.0, tDoubleObjectHashMap1.getNoEntryValue(), 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 0;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>(int0, int0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) int0;
      objectArray0[1] = (Object) int0;
      objectArray0[2] = (Object) int0;
      objectArray0[3] = (Object) tDoubleObjectHashMap0;
      objectArray0[4] = (Object) int0;
      Object[] objectArray1 = tDoubleObjectHashMap0.values(objectArray0);
      assertNotNull(objectArray1);
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryValue(), 0.01D);
  }

//  @Test
//  public void test13()  throws Throwable  {
//      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
//      int int0 = (-38);
//      double double0 = 0.0;
//      // Undeclared exception!
//      try {
//        tDoubleObjectHashMap0.insertKeyAt(int0, double0);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//      
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -38
//         //
//      }
//  }

  @Test
  public void test14()  throws Throwable  {
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
      tDoubleObjectHashMap0.valueCollection();
      assertEquals(23, tDoubleObjectHashMap0.capacity());
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryValue(), 0.01D);
      
      int int0 = 0;
      float float0 = 1.0F;
      TDoubleObjectHashMap<String> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<String>(int0, float0, (double) float0);
      tDoubleObjectHashMap1.isEmpty();
      assertEquals(0.0, tDoubleObjectHashMap1.getNoEntryValue(), 0.01D);
  }
}
