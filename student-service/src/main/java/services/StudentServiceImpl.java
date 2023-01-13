package services;

import java.util.List;

import ma.app.studentsapp.entities.Student;
import ma.app.studentsapp.repositories.StudentRepository;

public class StudentServiceImpl implements StudentService{

		private StudentRepository studentRepository;
		
		public StudentServiceImpl(StudentRepository studentRepository) {
			super();
			this.studentRepository = studentRepository;
		}

		@Override
		public List<Student> getAllStudents() {
			return studentRepository.findAll();
		}

		@Override
		public Student saveStudent(Student student) {
			return studentRepository.save(student);
		}

		@Override
		public Student getStudentById(Long id) {
			return studentRepository.findById(id).get();
		}

		@Override
		public Student updateStudent(Student student) {
			return studentRepository.save(student);
		}

		@Override
		public void deleteStudentById(Long id) {
			studentRepository.deleteById(id);	
		}

	
}
