package Ghumantey.fyp.Ghumantey.service;



import java.util.List;
import Ghumantey.fyp.Ghumantey.entity.GuideDetail;

public interface GuideService {

    List<GuideDetail> getAllGuides();

    GuideDetail getGuideById(int id);

    GuideDetail saveGuide(GuideDetail guide);

    GuideDetail updateGuide(int id, GuideDetail guide);

    void deleteGuide(int id);
}

