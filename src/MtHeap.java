public class MtHeap<E extends NameAssoc> extends AbsIHeap
{
	private E data = null;

	MtHeap() { super(null, null, null); }

	@Override
	public IHeap addElt(NameAssoc elt)
	{
		return null;
	}

	@Override
	public E findMinElt()
	{
		return null;
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
		return other;
	}

	@Override
	public IHeap getLeft()
	{
		return null;
	}

	@Override
	public IHeap getRight()
	{
		return null;
	}
}
