/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TByteDoubleMapDecorator;
import gnu.trove.map.TByteDoubleMap;
import gnu.trove.map.hash.TByteDoubleHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutput;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TByteDoubleMapDecoratorEvoSuite_Random {

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


//   @Test
//   public void test0()  throws Throwable  {
//       TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
//       Byte byte0 = null;
//       Double double0 = null;
//       try {
//         double0 = new Double((double) byte0);
//         fail("Expecting exception: IllegalArgumentException");
//       
//       } catch(IllegalArgumentException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test
  public void test1()  throws Throwable  {
      TByteDoubleMap tByteDoubleMap0 = null;
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator(tByteDoubleMap0);
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 899;
      float float0 = 715.4202F;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, float0);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleMapDecorator0.getMap();
      TByteDoubleMapDecorator tByteDoubleMapDecorator1 = new TByteDoubleMapDecorator();
      tByteDoubleMapDecorator1.values();
      TByteDoubleMapDecorator tByteDoubleMapDecorator2 = new TByteDoubleMapDecorator();
      tByteDoubleMapDecorator2.values();
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator2.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-485);
      byte byte0 = (byte) (-1);
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, (float) int0, byte0, (double) byte0);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleMapDecorator0.keySet();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = byte0;
      tByteDoubleHashMap0._set = byteArray0;
      TByteDoubleMapDecorator tByteDoubleMapDecorator1 = new TByteDoubleMapDecorator();
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator1.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 146;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, int0);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleMapDecorator0.entrySet();
      int int1 = 1743;
      TByteDoubleMapDecorator tByteDoubleMapDecorator1 = new TByteDoubleMapDecorator();
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator1.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)51;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) byte2;
      doubleArray0[1] = (double) byteArray0[2];
      doubleArray0[2] = (double) byte1;
      doubleArray0[3] = (double) byte1;
      doubleArray0[4] = (double) byteArray0[2];
      doubleArray0[5] = (double) byteArray0[2];
      doubleArray0[6] = (double) byteArray0[2];
      doubleArray0[7] = (double) byte2;
      doubleArray0[8] = (double) byteArray0[1];
      doubleArray0[9] = (double) byteArray0[1];
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleMapDecorator0.put((Byte) byteArray0[1], (Double) doubleArray0[5]);
      assertEquals("{51=0.0, 0=51.0}", tByteDoubleHashMap0.toString());
      assertEquals("{51=null, null=51.0}", tByteDoubleMapDecorator0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = 0.0;
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)119;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-105);
      byteArray0[2] = byte2;
      byte byte3 = (byte)113;
      byteArray0[3] = byte3;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) byte3;
      doubleArray0[1] = (double) byteArray0[2];
      doubleArray0[2] = (double) byte1;
      doubleArray0[3] = double0;
      doubleArray0[4] = (double) byteArray0[2];
      doubleArray0[5] = (double) byte3;
      doubleArray0[6] = (double) byte0;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
      tByteDoubleMapDecorator0.values();
      TByteDoubleMapDecorator tByteDoubleMapDecorator1 = new TByteDoubleMapDecorator();
      String string0 = "_";
      // Undeclared exception!
      try {
        File.createTempFile(string0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
      ObjectOutput objectOutput0 = null;
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator0.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
      String string0 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: ://?#
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
      // Undeclared exception!
      try {
        tByteDoubleMapDecorator0.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)38;
      byteArray0[0] = byte0;
      byte byte1 = (byte)71;
      byteArray0[1] = byte1;
      byte byte2 = (byte)21;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-118);
      byteArray0[3] = byte3;
      byte byte4 = (byte)18;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-64);
      byteArray0[5] = byte5;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) byteArray0[1];
      doubleArray0[1] = (double) byteArray0[0];
      doubleArray0[2] = (double) byte3;
      doubleArray0[3] = (double) byte2;
      doubleArray0[4] = (double) byteArray0[1];
      doubleArray0[5] = (double) byte5;
      doubleArray0[6] = (double) byte3;
      doubleArray0[7] = (double) byteArray0[4];
      double double0 = 0.0;
      doubleArray0[8] = double0;
      doubleArray0[9] = (double) byteArray0[2];
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleMapDecorator0.toString();
      TByteDoubleMapDecorator tByteDoubleMapDecorator1 = new TByteDoubleMapDecorator();
      String string0 = ")jYf";
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // )jYf (No such file or directory)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap();
      byte byte0 = (byte) (-122);
      tByteDoubleHashMap0.put(byte0, byte0);
      boolean boolean0 = false;
      double double0 = 0.0;
      Double double1 = new Double(double0);
      AbstractMap.SimpleImmutableEntry<Double, TByteDoubleHashMap> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Double, TByteDoubleHashMap>(double1, tByteDoubleHashMap0);
      abstractMap_SimpleImmutableEntry0.getValue();
      tByteDoubleHashMap0.reenableAutoCompaction(boolean0);
      byte byte1 = (byte)42;
      tByteDoubleHashMap0.contains(byte1);
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator((TByteDoubleMap) tByteDoubleHashMap0);
      Collection<Double> collection0 = tByteDoubleMapDecorator0.values();
      assertEquals(false, collection0.isEmpty());
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = (-911);
      float float0 = 0.0F;
      TByteDoubleMapDecorator tByteDoubleMapDecorator0 = new TByteDoubleMapDecorator();
      String string0 = " exceeds size ";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 0:  exceeds size :%20exceeds%20size%20#%20exceeds%20size%20
         //
      }
  }
}
