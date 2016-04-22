package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Suggestion;
import util.APICall;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Na on 4/22/16.
 */
public interface WorkflowBuilderInterface {
//    public static List<Suggestion> getSuggestion(Long wid) {
//        List<Suggestion> suggestionList = new ArrayList<>();
//        return suggestionList;
//    }

    public List<Suggestion> getSuggestion(Long wid);
}
