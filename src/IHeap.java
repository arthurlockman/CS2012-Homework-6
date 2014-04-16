public interface IHeap<E extends NameAssoc>
{
	IHeap addElt(E elt);
	E findMinElt();
	IHeap removeMinElt();
	int height();
	IHeap merge (IHeap other);
	IHeap getLeft();
	IHeap getRight();
}
