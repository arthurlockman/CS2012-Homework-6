public interface IHeap<E extends NameAssoc>
{
	IHeap addElt();
	E findMinElt();
	IHeap removeMinElt();
	int height();
	IHeap merge (IHeap other);
	IHeap getLeft();
	IHeap getRight();
}
