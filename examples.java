import tester.* ;
class Examples {
  
  HeapTester heapTester = new HeapTester();
  IHeap mtHeap = new MtHeap();
  public Examples(){
    
  
  IHeap heap2 = new DataHeap(5, mtHeap, mtHeap); 
  IHeap heap3 = new DataHeap(9, mtHeap, mtHeap);
  IHeap heap1 = new DataHeap(0, heap2, heap3);
  
  IHeap heap5 = new DataHeap(10, mtHeap, mtHeap);
  IHeap heap6 = new DataHeap(200, mtHeap, mtHeap);
  IHeap heap4 = new DataHeap(7, heap5, heap6);
  
  IHeap heap9 = new DataHeap(40,mtHeap, mtHeap);
  IHeap heap10 = new DataHeap(10,mtHeap, mtHeap);
  IHeap heap8 = new DataHeap(20, heap10, mtHeap);
  IHeap heap7 = new DataHeap(5, heap8, heap9);
  
 
 
  IHeap heap14 = new DataHeap(15,mtHeap, mtHeap);
  IHeap heap15 = new DataHeap(20,mtHeap, mtHeap);
  IHeap heap12 = new DataHeap(5,heap14, heap15);
  IHeap heap17 = new DataHeap(3000,mtHeap, mtHeap);
   IHeap heap16 = new DataHeap(200,heap17, mtHeap);
   IHeap heap13 = new DataHeap(10,heap16, mtHeap);
  IHeap heap11 = new DataHeap(0,heap12, heap13);
  }
  
  boolean test1(Tester t) {
    t.checkExpect(heapTester.addEltTester(6, heap1.addElt(6)),true);
  }
}
