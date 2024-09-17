class PeekingIterator implements Iterator<Integer> {
    Integer buffer;
    Iterator<Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        buffer = this.iterator.hasNext() ? this.iterator.next() : null;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return buffer;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer temp = buffer;
	    buffer = iterator.hasNext() ? iterator.next() : null;
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return buffer != null;
	}
}
