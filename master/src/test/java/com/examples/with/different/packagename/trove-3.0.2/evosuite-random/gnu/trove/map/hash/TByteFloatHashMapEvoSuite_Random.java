/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TByteFloatMap;
import gnu.trove.map.hash.TByteFloatHashMap;
import gnu.trove.procedure.TFloatProcedure;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TByteFloatHashMapEvoSuite_Random {

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


//   @Test
//   public void test0()  throws Throwable  {
//       int int0 = (-286);
//       TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0);
//       byte byte0 = (byte)1;
//       float float0 = Float.POSITIVE_INFINITY;
//       float float1 = tByteFloatHashMap0.put(byte0, float0);
//       assertEquals(false, tByteFloatHashMap0.isEmpty());
//       assertEquals(0.0F, float1, 0.01F);
//   }

  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          int int0 = 28289;
          byte byte0 = (byte) (-32);
          int int1 = 0;
          TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
          tByteFloatHashMap0.hashCode();
          byte byte1 = (byte) (-78);
          tByteFloatHashMap0.increment(byte1);
          tByteFloatHashMap0.getAutoCompactionFactor();
          float float0 = 0.0F;
          float float1 = (-1428.1506F);
          TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int1, float1, byte1, (float) int1);
          tByteFloatHashMap0.putAll((TByteFloatMap) tByteFloatHashMap1);
          tByteFloatHashMap0.adjustValue(byte1, float0);
          tByteFloatHashMap0.iterator();
          float float2 = 0.0F;
          TByteFloatHashMap tByteFloatHashMap2 = new TByteFloatHashMap(int1, float2);
          tByteFloatHashMap2.keySet();
          byte byte2 = (byte)0;
          FileDescriptor fileDescriptor0 = FileDescriptor.err;
          FileOutputStream fileOutputStream0 = null;
          try {
            fileOutputStream0 = new FileOutputStream(fileDescriptor0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"writeFileDescriptor\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:954)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:244)
             // sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:525)
             // org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             // org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:144)
             // org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:1)
             // java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
             // java.util.concurrent.FutureTask.run(FutureTask.java:166)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1110)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:603)
             // java.lang.Thread.run(Thread.java:722)
             //
          }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test2()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      tByteFloatHashMap0.clear();
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte) (-43);
      byteArray0[0] = byte0;
      byte byte1 = (byte)111;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-75);
      byteArray0[2] = byte2;
      byte byte3 = (byte)31;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-115);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-94);
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-105);
      byteArray0[7] = byte7;
      byte byte8 = (byte)0;
      byteArray0[8] = byte8;
      byte byte9 = (byte)10;
      byteArray0[9] = byte9;
      byte[] byteArray1 = tByteFloatHashMap0.keys(byteArray0);
      assertSame(byteArray0, byteArray1);
      assertNotNull(byteArray1);
      assertEquals(23, tByteFloatHashMap0.capacity());
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 996;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0);
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap();
      byte byte0 = (byte)77;
      tByteFloatHashMap1.adjustValue(byte0, byte0);
      String string0 = "UKV";
      String string1 = "sx/T2hPlyMD";
      File file0 = new File(string0, string1);
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // UKV/sx/T2hPlyMD (No such file or directory)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-91);
      byteArray0[0] = byte0;
      byte byte1 = (byte)66;
      byteArray0[1] = byte1;
      byte byte2 = (byte)71;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-77);
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-108);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-60);
      byteArray0[5] = byte5;
      byte byte6 = (byte)99;
      byteArray0[6] = byte6;
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) byteArray0[4];
      floatArray0[1] = (float) byte6;
      floatArray0[2] = (float) byte3;
      floatArray0[3] = (float) byteArray0[1];
      floatArray0[4] = (float) byte0;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(byteArray0, floatArray0);
      tByteFloatHashMap0.compact();
      assertEquals(11, tByteFloatHashMap0.capacity());
      assertEquals("{-91=-108.0, 71=-77.0, -108=-91.0, -77=66.0, 66=99.0}", tByteFloatHashMap0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      float float0 = 0.0F;
      tByteFloatHashMap0.getNoEntryKey();
      tByteFloatHashMap0.putIfAbsent(byte1, float0);
      tByteFloatHashMap0._states = byteArray0;
      byte byte2 = (byte)0;
      byte byte3 = (byte)14;
      byteArray0[0] = byte3;
      byteArray0[0] = byte0;
      byte byte4 = (byte)65;
      byteArray0[0] = byte1;
      float float1 = 1759.785F;
      tByteFloatHashMap0.put(byte4, float1);
      // Undeclared exception!
      try {
        tByteFloatHashMap0.remove(byte2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 293871013;
      float float0 = 0.0F;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, float0);
      String string0 = "";
      int int1 = (-1);
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int1, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: ://@?#
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 691;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0);
      byte byte0 = (byte) (-34);
      float float0 = (-1.0F);
      tByteFloatHashMap0.putIfAbsent(byte0, float0);
      assertEquals("{-34=-1.0}", tByteFloatHashMap0.toString());
      
      int int1 = 0;
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int1);
      assertFalse(tByteFloatHashMap1.equals(tByteFloatHashMap0));
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 1900;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0);
      float float0 = 556.22723F;
      byte byte0 = (byte) (-123);
      tByteFloatHashMap0.remove(byte0);
      assertEquals(3821, tByteFloatHashMap0.capacity());
      
      byte byte1 = (byte)89;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = byte0;
      byteArray0[1] = byte1;
      byteArray0[2] = byte1;
      byteArray0[3] = byte1;
      tByteFloatHashMap0._states = byteArray0;
      // Undeclared exception!
      try {
        tByteFloatHashMap0.contains(byte1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3732
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 72;
      float float0 = Float.POSITIVE_INFINITY;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, float0);
      String string0 = tByteFloatHashMap0.toString();
      assertNotNull(string0);
      assertEquals("{}", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      String string0 = "";
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         //  (No such file or directory)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      byteArray0[0] = byte0;
      float[] floatArray0 = new float[6];
      floatArray0[0] = (float) byte0;
      floatArray0[1] = (float) byteArray0[0];
      floatArray0[2] = (float) byte0;
      floatArray0[3] = (float) byte0;
      floatArray0[4] = (float) byteArray0[0];
      floatArray0[5] = (float) byteArray0[0];
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(byteArray0, floatArray0);
      TFloatProcedure tFloatProcedure0 = null;
      // Undeclared exception!
      try {
        tByteFloatHashMap0.forEachValue(tFloatProcedure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 1350;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      byte byte0 = (byte)1;
      tByteFloatHashMap0.increment(byte0);
      byte byte1 = (byte) (-52);
      float float0 = 0.5F;
      tByteFloatHashMap0.setAutoCompactionFactor(float0);
      float float1 = 0.0F;
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int0, (float) int0, byte1, float1);
      float float2 = (-1.0F);
      tByteFloatHashMap0.trimToSize();
      tByteFloatHashMap1.adjustOrPutValue(byte1, (float) int0, float2);
      int int1 = 765;
      byte byte2 = (byte)1;
      float float3 = (-274.11685F);
      tByteFloatHashMap0.size();
      tByteFloatHashMap1.keys();
      assertEquals("{-52=-1.0}", tByteFloatHashMap1.toString());
      
      TByteFloatHashMap tByteFloatHashMap2 = new TByteFloatHashMap((int) byte2, float3);
      tByteFloatHashMap2.containsValue((float) int1);
      float float4 = (-165.30112F);
      TByteFloatHashMap tByteFloatHashMap3 = new TByteFloatHashMap(int1, (float) int1, byte2, float4);
      tByteFloatHashMap2.capacity();
      tByteFloatHashMap2.trimToSize();
      assertEquals(3, tByteFloatHashMap2.capacity());
  }

  @Test
  public void test13()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)41;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-107);
      byteArray0[5] = byte5;
      byte byte6 = (byte)1;
      byteArray0[6] = byte6;
      byte byte7 = (byte)116;
      byteArray0[7] = byte7;
      byte[] byteArray1 = tByteFloatHashMap0.keys(byteArray0);
      assertNotNull(byteArray1);
      assertSame(byteArray1, byteArray0);
      
      byte byte8 = tByteFloatHashMap0.getNoEntryKey();
      float float0 = 900.6885F;
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap((int) byte8, float0);
      assertEquals(23, tByteFloatHashMap0.capacity());
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = (-1885);
      float float0 = (-1.0F);
      byte byte0 = (byte) (-1);
      float float1 = 1.0F;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, float0, byte0, float1);
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int0, int0);
      TByteFloatHashMap tByteFloatHashMap2 = new TByteFloatHashMap((TByteFloatMap) tByteFloatHashMap1);
      byte byte1 = (byte)0;
      float float2 = 0.0F;
      tByteFloatHashMap2.put(byte1, float2);
      assertEquals(false, tByteFloatHashMap2.isEmpty());
      
      int int1 = (-1597);
      TByteFloatHashMap tByteFloatHashMap3 = new TByteFloatHashMap(int1);
      tByteFloatHashMap3.compact();
      assertEquals(3, tByteFloatHashMap3.capacity());
  }

//   @Test
//   public void test15()  throws Throwable  {
//       int int0 = 0;
//       TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, int0);
//       TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int0, int0);
//       byte[] byteArray0 = tByteFloatHashMap1._set;
//       tByteFloatHashMap0.clear();
//       int int1 = 1;
//       float float0 = 320.07397F;
//       byte byte0 = (byte) (-100);
//       float float1 = 6.6360896E8F;
//       TByteFloatHashMap tByteFloatHashMap2 = new TByteFloatHashMap(int1, float0, byte0, float1);
//       TByteFloatHashMap tByteFloatHashMap3 = new TByteFloatHashMap((TByteFloatMap) tByteFloatHashMap2);
//       assertEquals(3, tByteFloatHashMap3.capacity());
//       assertEquals(6.6360896E8F, tByteFloatHashMap3.getNoEntryValue(), 0.01F);
//       assertEquals(-100, tByteFloatHashMap3.getNoEntryKey());
//       
//       boolean boolean0 = tByteFloatHashMap0.isEmpty();
//       assertEquals("{}", tByteFloatHashMap0.toString());
//       assertEquals(true, boolean0);
//   }

  @Test
  public void test16()  throws Throwable  {
      double double0 = (-1.0);
      Float float0 = new Float(double0);
      byte byte0 = (byte) (-125);
      Byte byte1 = new Byte(byte0);
      AbstractMap.SimpleEntry<Float, Byte> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Float, Byte>(float0, byte1);
      String string0 = "from > to : ";
      String string1 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: from > to : ://from%20%3E%20to%20:%20from%20%3E%20to%20:%20?from%20%3E%20to%20:%20#
         //
      }
  }
}
