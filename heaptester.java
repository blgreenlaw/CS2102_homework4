class HeapTester {
  
boolean addEltTester(int elt, IHeap hOrig, IHeap hAdded) {
    if (hOrig.areEqualAdded(elt,hOrig, hAdded) &&
        hOrig.isValidHeap() &&
        hAdded.isValidHeap()) {
    return true;
    } else {
      return false;
    }
  }

boolean remMinEltTester(IHeap hOrig, IHeap hRem) {
  if (hOrig.areEqualRem(hOrig, hRem) &&
      hOrig.isValidHeap() &&
      hRem.isValidHeap()) {
    return true;
  } else {
    return false;
  }
}



}
