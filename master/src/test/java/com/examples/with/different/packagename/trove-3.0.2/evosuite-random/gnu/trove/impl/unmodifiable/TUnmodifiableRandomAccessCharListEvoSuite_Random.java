/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TCharCollection;
import gnu.trove.impl.sync.TSynchronizedRandomAccessCharList;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharList;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessCharList;
import gnu.trove.list.TCharList;
import gnu.trove.list.array.TCharArrayList;
import gnu.trove.list.linked.TCharLinkedList;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableRandomAccessCharListEvoSuite_Random {

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
      TCharCollection tCharCollection0 = null;
      TCharArrayList tCharArrayList0 = null;
      try {
        tCharArrayList0 = new TCharArrayList(tCharCollection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      int int0 = 10;
      int int1 = 974;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.remove(int0, int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[8];
      char char0 = '5';
      charArray0[0] = char0;
      char char1 = 'z';
      charArray0[1] = char1;
      char char2 = ',';
      charArray0[2] = char2;
      char char3 = 'y';
      charArray0[3] = char3;
      char char4 = 'e';
      charArray0[4] = char4;
      char char5 = 'j';
      charArray0[5] = char5;
      char char6 = 'u';
      charArray0[6] = char6;
      char char7 = 'q';
      charArray0[7] = char7;
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList(charArray0[2]);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      char[] charArray1 = new char[4];
      charArray1[0] = char3;
      charArray1[1] = char5;
      charArray1[2] = char0;
      charArray1[3] = char7;
      int int0 = 500;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.toArray(charArray1, (int) charArray1[0], (int) char0, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 121
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      char char0 = ';';
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList(char0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      TCharLinkedList tCharLinkedList1 = (TCharLinkedList)tUnmodifiableRandomAccessCharList0.list;
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList1 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList1);
      char char1 = 'a';
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList1.insert((int) char0, char1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 1820;
      TCharArrayList tCharArrayList0 = new TCharArrayList(int0);
      tCharArrayList0.sort(int0, int0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.addAll((TCharCollection) tCharArrayList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      char[] charArray0 = new char[6];
      char char0 = 'y';
      charArray0[0] = char0;
      char char1 = 'o';
      charArray0[1] = char1;
      char char2 = '3';
      charArray0[2] = char2;
      char char3 = 'U';
      charArray0[3] = char3;
      char char4 = 'd';
      charArray0[4] = char4;
      char char5 = 'g';
      charArray0[5] = char5;
      char[] charArray1 = tUnmodifiableRandomAccessCharList0.toArray(charArray0);
      assertSame(charArray0, charArray1);
  }

  @Test
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[6];
      char char0 = 'm';
      charArray0[0] = char0;
      TCharArrayList tCharArrayList0 = new TCharArrayList();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      int int0 = (-1122);
      int int1 = 0;
      tUnmodifiableRandomAccessCharList0.toArray(charArray0, int0, int1);
      char char1 = 'F';
      charArray0[1] = char1;
      char char2 = 'X';
      charArray0[2] = char2;
      char char3 = '>';
      charArray0[3] = char3;
      char char4 = 'C';
      charArray0[4] = char4;
      char char5 = '3';
      charArray0[5] = char5;
      TCharArrayList tCharArrayList1 = TCharArrayList.wrap(charArray0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList1 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList1);
      boolean boolean0 = tUnmodifiableRandomAccessCharList1.isEmpty();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 10;
      char char0 = 'H';
      TCharArrayList tCharArrayList0 = new TCharArrayList(int0, char0);
      int int1 = (-1850);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      tUnmodifiableRandomAccessCharList0.hashCode();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      tCharArrayList0.containsAll((Collection<?>) linkedList0);
      // Undeclared exception!
      try {
        tCharArrayList0.subList(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // end index -1850 greater than begin index 10
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList();
      int int0 = 1;
      // Undeclared exception!
      try {
        tCharLinkedList0.removeAt(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no elemenet at 1
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      char char0 = '?';
      int int0 = (-1266);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.binarySearch(char0, int0, int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // begin index can not be < 0
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      int int0 = (-1890);
      char char0 = 'Q';
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.set(int0, char0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[3];
      char char0 = 'B';
      charArray0[0] = char0;
      char char1 = 'l';
      charArray0[1] = char1;
      char char2 = 'Q';
      charArray0[2] = char2;
      TCharArrayList tCharArrayList0 = new TCharArrayList(charArray0);
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList();
      String string0 = tCharLinkedList0.toString();
      TSynchronizedRandomAccessCharList tSynchronizedRandomAccessCharList0 = new TSynchronizedRandomAccessCharList((TCharList) tCharArrayList0, (Object) string0);
      int int0 = 1409;
      int int1 = 65535;
      // Undeclared exception!
      try {
        tSynchronizedRandomAccessCharList0.subList(int0, int1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // end index < 3
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-673);
      TCharArrayList tCharArrayList0 = null;
      try {
        tCharArrayList0 = new TCharArrayList(int0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[7];
      char char0 = 'M';
      charArray0[0] = char0;
      char char1 = 'k';
      charArray0[1] = char1;
      char char2 = 'A';
      charArray0[2] = char2;
      char char3 = ')';
      charArray0[3] = char3;
      char char4 = 'd';
      charArray0[4] = char4;
      char char5 = '2';
      charArray0[5] = char5;
      char char6 = 'e';
      charArray0[6] = char6;
      TCharArrayList tCharArrayList0 = new TCharArrayList(charArray0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      char char7 = ' ';
      tUnmodifiableRandomAccessCharList0.contains(char7);
      char[] charArray1 = new char[4];
      char char8 = 'X';
      charArray1[0] = char8;
      charArray1[1] = char8;
      charArray1[2] = char8;
      charArray1[3] = char8;
      char char9 = 'l';
      charArray1[0] = char9;
      char char10 = '-';
      charArray1[1] = char10;
      char char11 = '4';
      charArray1[2] = char11;
      char char12 = 'p';
      charArray1[3] = char12;
      TCharArrayList tCharArrayList1 = TCharArrayList.wrap(charArray1);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList1 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList1);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList1.retainAll((TCharCollection) tCharArrayList1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[7];
      char char0 = 'n';
      charArray0[0] = char0;
      char char1 = 'q';
      charArray0[1] = char1;
      charArray0[0] = char0;
      charArray0[1] = char1;
      charArray0[2] = char1;
      charArray0[3] = char1;
      charArray0[4] = char1;
      charArray0[5] = char1;
      charArray0[6] = char1;
      char char2 = '2';
      charArray0[2] = char2;
      char char3 = '^';
      charArray0[3] = char3;
      char char4 = 'W';
      charArray0[4] = char4;
      char char5 = ')';
      TCharArrayList tCharArrayList0 = TCharArrayList.wrap(charArray0, charArray0[5]);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      tUnmodifiableRandomAccessCharList0.isEmpty();
      charArray0[5] = char5;
      char char6 = 'r';
      charArray0[6] = char6;
      TCharArrayList tCharArrayList1 = new TCharArrayList(charArray0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList1 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList1);
      int int0 = (-205);
      // Undeclared exception!
      try {
        tCharArrayList1.sort(int0, (int) char0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -205
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      char char0 = 'Q';
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList(char0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      boolean boolean0 = tUnmodifiableRandomAccessCharList0.isEmpty();
      assertEquals(true, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = 0;
      TCharArrayList tCharArrayList0 = new TCharArrayList(int0);
      TUnmodifiableCharList tUnmodifiableCharList0 = new TUnmodifiableCharList((TCharList) tCharArrayList0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tUnmodifiableCharList0);
      int int1 = (-877);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.sort(int0, int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      TCharArrayList tCharArrayList0 = new TCharArrayList();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      char char0 = '$';
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList0.fill(char0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      TCharArrayList tCharArrayList0 = new TCharArrayList();
      int int0 = 31;
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList0);
      int int1 = (-1155);
      char char0 = '3';
      tUnmodifiableRandomAccessCharList0.lastIndexOf(int1, char0);
      char char1 = '~';
      // Undeclared exception!
      try {
        tCharArrayList0.replace(int0, char1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 31
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = 0;
      char[] charArray0 = new char[2];
      char char0 = 'z';
      charArray0[0] = char0;
      char char1 = '|';
      charArray0[1] = char1;
      TCharArrayList tCharArrayList0 = new TCharArrayList(charArray0);
      TUnmodifiableCharList tUnmodifiableCharList0 = new TUnmodifiableCharList((TCharList) tCharArrayList0);
      TCharLinkedList tCharLinkedList0 = new TCharLinkedList((TCharList) tUnmodifiableCharList0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList0 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      tUnmodifiableRandomAccessCharList0.iterator();
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList1 = new TUnmodifiableRandomAccessCharList((TCharList) tCharLinkedList0);
      TCharArrayList tCharArrayList1 = new TCharArrayList(int0);
      TUnmodifiableRandomAccessCharList tUnmodifiableRandomAccessCharList2 = new TUnmodifiableRandomAccessCharList((TCharList) tCharArrayList1);
      int int1 = 1605;
      char[] charArray1 = new char[1];
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessCharList2.removeAll((TCharCollection) tCharArrayList1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
