n = int(raw_input())
scores = [[raw_input(), float(raw_input())] for i in xrange(n)]
sortedScores = sorted(scores,key=lambda x:x[1])
second_score = sortedScores[0][1]
for name,score in sortedScores:
    if score > second_score:
        second_score = score
        break
print('\n'.join([name for name,score in sorted(scores) if score == second_score]))
