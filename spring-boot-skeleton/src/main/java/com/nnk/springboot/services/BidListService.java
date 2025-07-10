import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

	// Annotation qui indique que cette classe est un service Spring, utilisé pour la logique métier
	@Service
	public class BidListService {
	    // Injection automatique du repository qui permet d'interagir avec la base de données
	    @Autowired
	    private BidListRepository bidListRepository;
	    
	    // Méthode qui retourne la liste de tous les BidList stockés en base
	    public List<BidList> findAll() {
	        return bidListRepository.findAll();
	    }
	    
	    // Méthode qui enregistre un objet BidList dans la base (insert ou update)
	    public BidList save(BidList bidList) {
	        return bidListRepository.save(bidList);
	    }
	    
	    // Méthode qui récupère un BidList par son identifiant, renvoie un Optional (peut être vide)
	    public Optional<BidList> findById(Integer id) {
	        return bidListRepository.findById(id);
	    }
	    
	    // Méthode qui supprime un BidList de la base à partir de son identifiant
	    public void delete(Integer id) {
	        bidListRepository.deleteById(id);
	    }
	}

