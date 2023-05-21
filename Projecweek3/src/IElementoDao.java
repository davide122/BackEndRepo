import model.Elemento;

public interface IElementoDao {
	public void save(Elemento c);
	public Elemento getById(long id);
	public void delete(Elemento c);
	public void update(Elemento c);
}
