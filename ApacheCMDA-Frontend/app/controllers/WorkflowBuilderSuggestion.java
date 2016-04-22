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
public class WorkflowBuilderSuggestion implements WorkflowBuilderInterface {
    @Override
    public List<Suggestion> getSuggestion(Long wid) {
        List<Suggestion> suggestionList = new ArrayList<>();
        return suggestionList;
    }

    public static List<Suggestion> getWorkflowSuggestion(Long wid) {
        JsonNode suggetionNode = APICall.callAPI(Constants.NEW_BACKEND + "suggestion/getSuggestionForWorkflow/" + wid.toString());
        List<Suggestion> suggestionList = new ArrayList<>();
        for (JsonNode n: suggetionNode) {
            Suggestion cur = new Suggestion(n);
            suggestionList.add(cur);
        }

        return suggestionList;
    }
}
