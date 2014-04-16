public class DataHeap<E extends NameAssoc> implements IHeap
{
	private E data;
	private IHeap<E> left;
	private IHeap<E> right;

	DataHeap(E data, IHeap<E> left, IHeap<E> right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public IHeap addElt()
	{
		return null;
	}

	@Override
	public E findMinElt()
	{
		return data;
	}

	@Override
	public IHeap removeMinElt()
	{

		return null;
	}

	@Override
	public int height()
	{
		return 0;
	}

	@Override
	public IHeap merge(IHeap other)
	{
		return null;
	}

	@Override
	public IHeap getLeft()
	{
		return this.left;
	}

	@Override
	public IHeap getRight()
	{
		return this.right;
	}
}
