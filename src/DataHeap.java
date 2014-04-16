public class DataHeap<E extends NameAssoc> extends AbsIHeap
{
	DataHeap(E data, IHeap<E> left, IHeap<E> right)
	{
		super(data, left, right);
	}

	@Override
	public IHeap addElt(NameAssoc elt)
	{
		IHeap h = this.merge(new DataHeap<E>((E)elt, new MtHeap<E>(), new MtHeap<E>()));
		return h;
	}

	@Override
	public E findMinElt()
	{
		return (E)data;
	}

	@Override
	public IHeap removeMinElt()
	{
		IHeap h = this.left.merge(this.right);
		return h;
	}

	@Override
	public int height()
	{
		return 1 + this.getLeft().height() + this.getRight().height();
	}

	@Override
	public IHeap merge(IHeap other)
	{
		E newRoot;
		IHeap ST1, ST2, ST3;
		IHeap H1 = this;
		IHeap H2 = other;

		if (H1.findMinElt().lessThan(H2.findMinElt()))
			newRoot =  (E)H1.findMinElt();
		else
			newRoot = (E)H2.findMinElt();

		if (newRoot.equals(H1.findMinElt()))
		{
			newRoot = (E)H1.findMinElt();
			ST1 = H1.getLeft();
			ST2 = H2.getRight();
			ST3 = H2;
		}
		else
		{
			newRoot = (E) H2.findMinElt();
			ST1 = H2.getLeft();
			ST2 = H2.getRight();
			ST3 = H1;
		}

		if (ST1.height() >= ST2.height() && ST1.height() >= ST3.height())
			return new DataHeap<E>(newRoot, ST1, ST2.merge(ST3));
		else if (ST2.height() >= ST1.height() && ST2.height() >= ST3.height())
			return new DataHeap<E>(newRoot, ST2, ST1.merge(ST3));
		else
			return new DataHeap<E>(newRoot, ST3, ST1.merge(ST2));
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
