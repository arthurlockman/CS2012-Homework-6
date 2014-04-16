import com.sun.media.sound.EmergencySoundbank;

public class DataHeap<E extends NameAssoc> extends AbsIHeap
{
	DataHeap(E data, IHeap<E> left, IHeap<E> right)
	{
		super(data, left, right);
	}

	@Override
	public IHeap addElt(NameAssoc elt)
	{
		return this.merge(new DataHeap<E>((E)elt, new MtHeap<E>(), new MtHeap<E>()));
	}

	@Override
	public E findMinElt()
	{
		return (E)data;
	}

	@Override
	public IHeap removeMinElt()
	{
		return this.left.merge(this.right);
	}

	@Override
	public int height()
	{
		return 1 + left.height() + right.height();
	}

	@Override
	public IHeap merge(IHeap other)
	{
		E newRoot;
		IHeap ST1, ST2, ST3;

		if (this.findMinElt().lessThan(other.findMinElt()))
		{
			newRoot = this.findMinElt();
			ST1 = this.left;
			ST2 = this.right;
			ST3 = other;
		}
		else
		{
			newRoot = (E) other.findMinElt();
			ST1 = other.getLeft();
			ST2 = other.getRight();
			ST3 = this;
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
