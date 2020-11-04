package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	// Criar uma dependência usando o padrão factory
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {
// Apagando a implementação mockada para acessar o Banco de Dados
//		List<Department> list = new ArrayList<>();
//		list.add(new Department(1,"Books"));
//		list.add(new Department(2, "Computers"));
//		list.add(new Department(3, "Electronics"));
//		return list;
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
}
