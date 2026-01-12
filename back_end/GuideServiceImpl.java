package Ghumantey.fyp.Ghumantey.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ghumantey.fyp.Ghumantey.dao.GuideDetailDao;
import Ghumantey.fyp.Ghumantey.entity.GuideDetail;

@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideDetailDao guideDetailDao;

    @Override
    public List<GuideDetail> getAllGuides() {
        return guideDetailDao.findAll();
    }

    @Override
    public GuideDetail getGuideById(int id) {
        Optional<GuideDetail> optionalGuide = guideDetailDao.findById(id);
        return optionalGuide.orElse(null);
    }

    @Override
    public GuideDetail saveGuide(GuideDetail guide) {
        return guideDetailDao.save(guide);
    }

    @Override
    public GuideDetail updateGuide(int id, GuideDetail guide) {
        GuideDetail existingGuide = getGuideById(id);
        if (existingGuide != null) {
            existingGuide.setGuide_name(guide.getGuide_name());
            existingGuide.setLocation(guide.getLocation());
            existingGuide.setNumber(guide.getNumber());
            existingGuide.setDescription(guide.getDescription());
            existingGuide.setRatings(guide.getRatings());
            return guideDetailDao.save(existingGuide);
        }
        return null;
    }

    @Override
    public void deleteGuide(int id) {
        guideDetailDao.deleteById(id);
    }
}

