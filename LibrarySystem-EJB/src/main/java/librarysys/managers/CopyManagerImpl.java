package librarysys.managers;

import org.springframework.stereotype.Service;

import librarysys.entities.Copy;
import librarysys.managers.interfaces.CopyManager;

@Service
public class CopyManagerImpl extends AbstractManagerImpl<Copy,Integer> implements CopyManager{

}
