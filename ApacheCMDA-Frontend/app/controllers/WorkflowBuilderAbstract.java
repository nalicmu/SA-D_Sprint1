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
public abstract class WorkflowBuilderAbstract implements WorkflowBuilderInterface{
    @Override
    public List<Suggestion> getSuggestion(Long wid) {
        JsonNode suggetionNode = APICall.callAPI(Constants.NEW_BACKEND + "suggestion/getSuggestionForWorkflow/" + wid.toString());
        List<Suggestion> suggestionList = new ArrayList<>();
        for (JsonNode n: suggetionNode) {
            Suggestion cur = new Suggestion(n);
            suggestionList.add(cur);
        }

        return suggestionList;
    }
}
