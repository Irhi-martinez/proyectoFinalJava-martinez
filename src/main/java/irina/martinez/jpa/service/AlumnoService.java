package irina.martinez.jpa.service;

import irina.martinez.jpa.entity.Alumno;
import irina.martinez.jpa.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    @Autowired
    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> getAlumnoById(Long id) {
        return alumnoRepository.findById(id);
    }

    public Alumno createAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public Alumno updateAlumno(Long id, Alumno alumno) {
        if (alumnoRepository.existsById(id)) {
            alumno.setId(id);
            return alumnoRepository.save(alumno);
        }
        return null;
    }

    public void deleteAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }
}
