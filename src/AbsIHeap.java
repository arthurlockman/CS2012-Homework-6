public abstract class AbsIHeap<E extends NameAssoc> implements IHeap
{
	protected E data;
	protected IHeap<E> left;
	protected IHeap<E> right;

	AbsIHeap(E data, IHeap<E> left, IHeap<E> right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
