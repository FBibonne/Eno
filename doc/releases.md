# Eno Releases note

## 2.2.5 - 12/04/2021

- **[ddi2xforms][core]** Fixing issue for Insee data collection platform when specifying variable type in xforms bind for external variables when they were not initialized : now type is not specified for external variables. 
- **[poguesXML2ddi][core]** Adding support of formulas in loop minimum for ddi from pogues-xml format.
- **[ddi2lunaticXML][post-processing]** Adding lunatic post-processing to manage pagination.
- **[test]** Upgrading to unit test version : junit 5.


## 2.2.4 - 31/03/2021

- **[ddi2fo][post-processing]** Updating fo accompanying mails cnrCOL and medCOL.

## 2.2.3 - 24/03/2021

- **[poguesXML2ddi][core]** hotfix : The referenced variables must be framed by ¤ and not $.
- **[poguesXML2ddi][core]** hotfix : Adding support of filtered loops in pogues-xml.

## 2.2.2 - 16/03/2021

- **[poguesXML2ddi][core]** Allowing a ControlConstructReference to point to a QuestionConstruct (for dynamic tables). Until now, it was wrongly pointing as a Loop (in r:TypeOfObject).
- **[ddi2fodt][core]** Adding support of loops and filters for display in fodt format (the format used to produce the questionnaires' specifications).
- **[ddi2lunaticXML][post-processing]** Fixing vtl parser : (space after ',').

## 2.2.1 - 10/02/2021

- **[ddi2xforms][core]** Hotfix xforms calculated var in dynamic array
- **[ddi2fo][post-processing]** Adding meaningful barcode for the cover page of ***business*** fo forms in portrait format. The barcode is of the datamatrix kind and contains {Identifier of surveyed unit} - {Short label of survey} - {Year of the survey} - {Period of the survey}.
- **[ddi2fo][post-processing]** Updating ***business*** fo accompanying mails.
- **[ddi2lunaticXML][post-processing]** Adding specific treatment for ddi2lunaticXML pipeline.

## 2.2.0 - 22/01/2021

- **[ddi2lunaticXML][eno-core]** Changing the lunatic-model, using v.2.0.0.
